package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.ItemsViewModel
import com.example.myapplication.R

class CustomAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    private var onClickListener: OnClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.modelpart, parent, false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        holder.question.text = ItemsViewModel.question

        holder.number.text = ItemsViewModel.number

        holder.card.startAnimation(AnimationUtils.loadAnimation(holder.itemView.context, R.anim.anim_one))

        holder.itemView.setOnClickListener {
            if (onClickListener != null) {
                onClickListener!!.onClick(position, ItemsViewModel)
            }
        }


    }

    override fun getItemCount(): Int {
        return mList.size
    }

    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }

    interface OnClickListener {
        fun onClick(position: Int, model: ItemsViewModel)
    }


    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val number: TextView = itemView.findViewById(R.id.numberpart1)
        val question: TextView = itemView.findViewById(R.id.questionpart1)
        val card: CardView = itemView.findViewById(R.id.cardview1)
    }
}