package com.rofidamaher.teachergradesapp.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rofidamaher.teachergradesapp.R
import kotlinx.android.synthetic.main.row.view.*

class Adapter(val mContext: ClassAFragment, val studentList: Array<Student>) :
    RecyclerView.Adapter<Adapter.viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val callForRow =  layoutInflater.inflate(R.layout.row , parent ,false)
        return viewHolder(callForRow)
    }

    override fun getItemCount(): Int {
        return studentList.size
        }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        holder.itemView.stu_name.text = studentList.get(position).Name
        holder.itemView.stu_grade.text = studentList.get(position).Grade
       }

    public class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}