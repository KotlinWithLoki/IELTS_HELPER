package com.example.myapplication


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuBuilder
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.example.myapplication.adapter.QuestionAdapter


class questionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)
        var recyclerquestion = findViewById<RecyclerView>(R.id.recyclerquestions)

        var numberpart1 = findViewById<TextView>(R.id.numberpart1)

        var questionpart1 = findViewById<TextView>(R.id.questionpart1)

        var qList=Constants.DoNotWork()

        val number = intent.getStringExtra("number")
        numberpart1.text = number

        val question = intent.getStringExtra("question")
        questionpart1.text = question

        supportActionBar?.title = "PART 1"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



        if(number == "1"){
            qList=Constants.getQuestion1()
        }else if(number == "2"){
            qList=Constants.getQuestion2()
        }else if(number == "3"){
            qList=Constants.getQuestion3()
        }else if(number == "4"){
            qList=Constants.getQuestion4()
        }else if(number == "5"){
            qList=Constants.getQuestion5()
        }else if(number == "6"){
            qList=Constants.getQuestion6()
        }else if(number == "7"){
            qList=Constants.getQuestion7()
        }else if(number == "8"){
            qList=Constants.getQuestion8()
        }else if(number == "9"){
            qList=Constants.getQuestion9()
        }else if(number == "10"){
            qList=Constants.getQuestion10()
        }else if(number == "11"){
            qList=Constants.getQuestion11()
        }else if(number == "12"){
            qList=Constants.getQuestion12()
        }else if(number == "13"){
            qList=Constants.getQuestion13()
        }else if(number == "14"){
            qList=Constants.getQuestion14()
        }else if(number == "15"){
            qList=Constants.getQuestion15()
        }else if(number == "16"){
            qList=Constants.getQuestion16()
        }else if(number == "17"){
            qList=Constants.getQuestion17()
        }else if(number == "18"){
            qList=Constants.getQuestion18()
        }else if(number == "19"){
            qList=Constants.getQuestion19()
        }else if(number == "20"){
            qList=Constants.getQuestion20()
        }else if(number == "21"){
            qList=Constants.getQuestion21()
        }else if(number == "22"){
            qList=Constants.getQuestion22()
        }else if(number == "23"){
            qList=Constants.getQuestion23()
        }else if(number == "24"){
            qList=Constants.getQuestion24()
        }else if(number == "25"){
            qList=Constants.getQuestion25()
        }else if(number == "26"){
            qList=Constants.getQuestion26()
        }else if(number == "27"){
            qList=Constants.getQuestion27()
        }else if(number == "28"){
            qList=Constants.getQuestion28()
        }else if(number == "29"){
            qList=Constants.getQuestion29()
        }else if(number == "30"){
            qList=Constants.getQuestion30()
        }

        recyclerquestion.layoutManager = LinearLayoutManager(this)

        val adapter = QuestionAdapter(qList)

        recyclerquestion.adapter = adapter

        adapter.setOnClickListener(object : QuestionAdapter.OnClickListener {
            override fun onClick(position: Int, model: ItemQuestionModel) {
                Toast.makeText(this@questionsActivity, "Coming soon...", Toast.LENGTH_SHORT).show()
            }
        })

    }

    @SuppressLint("RestrictedApi")
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        if (menu is MenuBuilder) {
            menu.setOptionalIconsVisible(true)
        }
        menuInflater.inflate(R.menu.menutimer, menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == android.R.id.home) {
            finish()
            Animatoo.animateSlideRight(this@questionsActivity)
            return true
        }

        if (item.itemId == R.id.enterTimer){
            var intent = Intent(this, Stopwatch::class.java).setAction("your.custom.action")
            startActivity(intent)
            Animatoo.animateSlideUp(this@questionsActivity)
        }
        return true
    }
}