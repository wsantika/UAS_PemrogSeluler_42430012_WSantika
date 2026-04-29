package com.example.harleycatalog.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.harleycatalog.R
import com.example.harleycatalog.model.Motor

class MotorAdapter(
    private val motorList: ArrayList<Motor>,
    private val onClick: (Motor) -> Unit
) : RecyclerView.Adapter<MotorAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val tvType: TextView = itemView.findViewById(R.id.tvType)
        val tvYear: TextView = itemView.findViewById(R.id.tvYear)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_motor, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return motorList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val motor = motorList[position]

        holder.tvName.text = motor.name
        holder.tvType.text = motor.type
        holder.tvYear.text = motor.year.toString()

        holder.itemView.setOnClickListener {
            onClick(motor)
        }
    }
}