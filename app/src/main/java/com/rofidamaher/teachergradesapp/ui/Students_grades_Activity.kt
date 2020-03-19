package com.rofidamaher.teachergradesapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.rofidamaher.teachergradesapp.R
import com.rofidamaher.teachergradesapp.models.ClassAFragment
import com.rofidamaher.teachergradesapp.models.ClassBFragment
import com.rofidamaher.teachergradesapp.models.ClassCFragment

class Students_grades_Activity : AppCompatActivity() {

    lateinit var ClassA : ClassAFragment
    lateinit var ClassB : ClassBFragment
    lateinit var ClassC : ClassCFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students_grades_)

        val bottomNav : BottomNavigationView = findViewById(R.id.bottom_navigation)

        var intent = intent
        var name = intent.getStringExtra("Name")


        //for default fragment classA
        //newInstance send data to fragment
        ClassA = ClassAFragment.newInstance(name ,"Class A")
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_continer,ClassA)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()


        bottomNav.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){

                R.id.classA -> {
                    //newInstance send data to fragment
                    //ClassA = ClassAFragment.newInstance(name ,"Class A")
                    ClassA = ClassAFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_continer, ClassA)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()

                    //Another way to send data to a fragment like Bundle
                    val bundle = Bundle()
                    bundle.putString("Name", name)
                    bundle.putString("Class", "Class A")
                    //PASS OVER THE BUNDLE TO OUR FRAGMENT
                    ClassA.setArguments(bundle)


                }

                R.id.classB ->{
                    ClassB = ClassBFragment.newInstance(name ,"Class B")
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_continer,ClassB)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()

//                    val bundle = Bundle()
//                    bundle.putString("Name", name)
//                    bundle.putString("class", "Class B")
//
//                    //PASS OVER THE BUNDLE TO OUR FRAGMENT
//                    ClassB.setArguments(bundle)
                }

                R.id.classC ->{
                    //newInstance send data to fragment
                    //ClassC = ClassCFragment().newInstance(name ,"Class C")
                    ClassC = ClassCFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_continer,ClassC)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()

                    val bundle = Bundle()
                    bundle.putString("Name", name)
                    bundle.putString("Class", "Class C")

                    //PASS OVER THE BUNDLE TO OUR FRAGMENT
                    ClassC.setArguments(bundle)
                }
            }
            true

        }
    }


}
