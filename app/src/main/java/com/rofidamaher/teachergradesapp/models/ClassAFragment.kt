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

    var students :ArrayList<Student> = ArrayList() //List(25) {Student()}


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

            var index = students.size
            students.add(index, Student(newStu_name,newStu_grade))

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


        students.add(0,Student("ali","20"))
        students.add(1,Student("Adel","20"))
        students.add(2,Student("Ali","50"))
        students.add(3,Student("Amir","35"))
        students.add(4,Student("Amir","35"))
        students.add(5,Student("ali","20"))
        students.add(6,Student("Adel","20"))
        students.add(7,Student("Ali","50"))
        students.add(8,Student("Amir","35"))
        students.add(9,Student("Amir","35"))
    }
}
