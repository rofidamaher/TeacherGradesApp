package com.rofidamaher.teachergradesapp

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.rofidamaher.teachergradesapp.ui.Students_grades_Activity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name :EditText = findViewById(R.id.dr_name)


        btn_Login.setOnClickListener {
            val dr_name = name.text.toString()

            val intent = Intent(this, Students_grades_Activity::class.java)
            intent.putExtra("Name",dr_name)
            startActivity(intent)
        }
    }
}
