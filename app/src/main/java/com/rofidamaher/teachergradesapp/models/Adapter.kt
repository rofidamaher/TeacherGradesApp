package com.rofidamaher.teachergradesapp.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rofidamaher.teachergradesapp.R
import kotlinx.android.synthetic.main.row.view.*

class Adapter(val mContext: ClassAFragment, val textNames:ArrayList<String>, val grades: ArrayList<String>) :
    RecyclerView.Adapter<Adapter.viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val callForRow =  layoutInflater.inflate(R.layout.row , parent ,false)
        return viewHolder(callForRow)
    }

    override fun getItemCount(): Int {
        return textNames.size
        }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        holder.itemView.stu_name.text = textNames.get(position)
        holder.itemView.stu_grade.text = grades.get(position)
       }

    public class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}