package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.example.myapplication.adapter.CustomAdapter

class Part1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val adapter: CustomAdapter

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part1)

        supportActionBar?.title = "PART 1"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        val mList=Constants.getQuestions()

        recyclerview.layoutManager = LinearLayoutManager(this)
        adapter = CustomAdapter(mList)

        recyclerview.adapter = adapter


        adapter.setOnClickListener(object : CustomAdapter.OnClickListener {
            override fun onClick(position: Int, model: ItemsViewModel) {
                val intent = Intent(this@Part1, questionsActivity::class.java).setAction("your.custom.action")

                intent.putExtra("number", model.number)
                intent.putExtra("question", model.question)
                startActivity(intent)
                Animatoo.animateSlideLeft(this@Part1)

            }
        })
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == android.R.id.home) {
            finish()
            Animatoo.animateSlideRight(this)
            return true
        }
        return true
    }
}