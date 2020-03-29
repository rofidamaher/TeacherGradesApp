package com.rofidamaher.teachergradesapp.models

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.rofidamaher.teachergradesapp.R
import kotlinx.android.synthetic.main.fragment_a.view.*
import kotlinx.android.synthetic.main.fragment_b.*


class ClassAFragment : Fragment() {

    var students :Array<Student> = emptyArray()//List(25) {Student()}


    var newStu_name =""
    var newStu_grade =""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_a, container, false)

        var name = arguments?.getString("Name")
        var Class_no = arguments?.getString("Class")

        v.name_tea_c.setText("Hello  " + name)
        v.class_no_c.setText(Class_no)

        loadData()

        v.add_stu.setOnClickListener {
            newStu_name = Enter_name.text.toString()
            newStu_grade = Enter_grade.text.toString()

            students[0].Name=newStu_name
            students[0].Grade=newStu_grade
        }


        val adapter = Adapter(this, students)

        v.recycler.layoutManager = LinearLayoutManager(context)
        v.recycler.adapter = adapter

        return v
    }

    companion object {
        fun newInstance(name: String, class_no: String): ClassAFragment {
            val args = Bundle()
            args.putString("Name", name)
            args.putString("Class", class_no)
            val fragment = ClassAFragment()
            fragment.arguments = args
            return fragment
        }
    }

    private fun loadData() {

        students[0].Name="ali"
        students[0].Grade="20"
        students[1].Name="Adel"
        students[1].Grade="20"
        students[2].Name="Ali"
        students[2].Grade="50"
        students[3].Name="Amir"
        students[3].Grade="35"
        students[4].Name="ali"
        students[4].Grade="20"
        students[5].Name="Adel"
        students[5].Grade="20"
        students[6].Name="Ali"
        students[6].Grade="50"
        students[7].Name="Amir"
        students[7].Grade="35"
    }
}
