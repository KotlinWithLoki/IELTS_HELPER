package com.example.myapplication

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.IntentFilter
import android.os.Build
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.google.android.material.button.MaterialButton
import kotlin.math.roundToInt


class Stopwatch : AppCompatActivity() {

    private var timerStarted = false
    private lateinit var serviceIntent: Intent
    private var time = 0.0

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stopwatch)

        supportActionBar?.title = "STOPWATCH"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var startbtn = findViewById<Button>(R.id.startbtn).setOnClickListener { startStopTimer() }
        var resetbtn = findViewById<Button>(R.id.resetbtn).setOnClickListener { resetTimer() }

        serviceIntent = Intent(applicationContext, TimeService::class.java)
        registerReceiver(updateTime, IntentFilter(TimeService.TIMER_UPDATED), RECEIVER_NOT_EXPORTED)
    }

    private fun resetTimer() {
        stopTimer()
        time = 0.0
        findViewById<TextView>(R.id.TimeEditStop).text = getTimeStringFromDouble(time)
    }

    private fun startStopTimer() {
        if (timerStarted)
            stopTimer()
        else
            startTimer()
    }

    @SuppressLint("CutPasteId", "UseCompatLoadingForDrawables", "SetTextI18n")
    private fun startTimer() {
        serviceIntent.putExtra(TimeService.TIMER_EXTRA, time)
        startService(serviceIntent)
        findViewById<Button>(R.id.startbtn).text = "STOP"
        findViewById<MaterialButton>(R.id.startbtn).icon = getDrawable(R.drawable.baseline_pause_24)
        timerStarted = true
    }

    @SuppressLint("CutPasteId", "SetTextI18n", "UseCompatLoadingForDrawables")
    private fun stopTimer() {
        stopService(serviceIntent)
        findViewById<Button>(R.id.startbtn).text = "START"
        findViewById<MaterialButton>(R.id.startbtn).icon = getDrawable(R.drawable.baseline_play_arrow_24)
        timerStarted = false
    }

    private val updateTime: BroadcastReceiver = object : BroadcastReceiver(){
        override fun onReceive(context: Context, intent: Intent) {
            time = intent.getDoubleExtra(TimeService.TIMER_EXTRA, 0.0)
            findViewById<TextView>(R.id.TimeEditStop).text = getTimeStringFromDouble(time)
        }
    }

    private fun getTimeStringFromDouble(time: Double): String? {
        val result = time.roundToInt()
        val hours = result % 86400 / 3600
        val minutes = result % 86400 % 3600 / 60
        val seconds = result % 86400 % 3600 % 60

        return makeTimeString(hours, minutes, seconds)
    }

    private fun makeTimeString(hours: Int, minutes: Int, seconds: Int): String = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == android.R.id.home) {

            val builder: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this@Stopwatch)

            builder.setMessage("If you close this window, Time will reset")

            builder.setTitle("Do you want to close this window ?")
            builder.setCancelable(false)
            builder.setPositiveButton("Yes") { _: DialogInterface?, _: Int ->
                resetTimer()
                finish()
                Animatoo.animateSlideDown(this)
            }
            builder.setNegativeButton("No"
            ) { dialog: DialogInterface, _: Int ->
                dialog.cancel()
            }
            val alertDialog: android.app.AlertDialog? = builder.create()
            alertDialog?.show()
            return true
        }
        return true
    }

}