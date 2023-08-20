package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.ItemQuestionModel
import com.example.myapplication.ItemsViewModel
import com.example.myapplication.R

class QuestionAdapter(private val qList: List<ItemQuestionModel>) : RecyclerView.Adapter<QuestionAdapter.ViewHolder>() {
    private var onClickListener: OnClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionAdapter.ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.modelquestion, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = qList[position]

        holder.question.text = ItemsViewModel.Question

        holder.button.setOnClickListener {
            if (onClickListener != null) {
                onClickListener!!.onClick(position, ItemsViewModel)
            }
        }

    }

    override fun getItemCount(): Int {
        return qList.size
    }

    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }

    interface OnClickListener {
        fun onClick(position: Int, model: ItemQuestionModel)
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val question: TextView = itemView.findViewById(R.id.questionpart1)
        val button: Button = itemView.findViewById(R.id.questionpart1btn)
    }
}