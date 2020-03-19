package com.rofidamaher.teachergradesapp.models

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.rofidamaher.teachergradesapp.R
import kotlinx.android.synthetic.main.fragment_b.*
import kotlinx.android.synthetic.main.fragment_c.view.*

class ClassCFragment : Fragment() {

    var Names: ArrayList<String> = ArrayList()
    var Grades: ArrayList<String> = ArrayList()

    var newStu_name =""
    var newStu_grade =""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val v = inflater.inflate(R.layout.fragment_c, container, false)

        var name = arguments?.getString("Name")
        var Class_no = arguments?.getString("Class")

        v.name_tea_c.setText("Hello  " + name)
        v.class_no_c.setText(Class_no)

        loadData()

        v.add_stu.setOnClickListener {
            newStu_name = Enter_name.text.toString()
            newStu_grade = Enter_grade.text.toString()

            Names.add(newStu_name)
            Grades.add(newStu_grade)


        }

        val adapter = AdapterC(this, Names, Grades)
        v.recyclec.layoutManager = LinearLayoutManager(context)
        v.recyclec.adapter = adapter

        return v
    }

    private fun loadData() {

        Names.add("Adel3")
        Grades.add("20")
        Names.add("Ali")
        Grades.add("50")
        Names.add("Amir")
        Grades.add("35")
        Names.add("Adel")
        Grades.add("20")
        Names.add("Ali")
        Grades.add("50")
        Names.add("Amir")
        Grades.add("35")
        Names.add("Adel")
        Grades.add("20")
        Names.add("Ali")
        Grades.add("50")
        Names.add("Amir")
        Grades.add("35")
        Names.add("Adel")
        Grades.add("20")
        Names.add("Ali")
        Grades.add("50")
        Names.add("Amir")
        Grades.add("35")
    }

//     companion object {
//         fun newInstance(name: String?, class_no: String): ClassCFragment {
//             val args = Bundle()
//             args.putString("name", name)
//             args.putString("class", class_no)
//             val fragment = ClassCFragment()
//             fragment.arguments = args
//             return fragment
//
//         }
//     }

}
//}