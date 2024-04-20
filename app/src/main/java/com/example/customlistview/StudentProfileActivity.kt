package com.example.customlistview

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StudentProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_profile)

        // Retrieve data from Intent
        val studentName = intent.getStringExtra("studentName")
        val studentId = intent.getStringExtra("studentId")
        val studentProgram = intent.getStringExtra("studentProgram")
        val dbsys32Grade = intent.getStringExtra("dbsys32Grade")
        val intprog32Grade = intent.getStringExtra("intprog32Grade")
        val sysad32Grade = intent.getStringExtra("sysad32Grade")

        // Populate TextViews with received data
        findViewById<TextView>(R.id.tvStudentName).text = "Name: $studentName"
        findViewById<TextView>(R.id.tvStudentIdNumber).text = "Id Number: $studentId"
        findViewById<TextView>(R.id.tvStudentProgram).text = "Program: $studentProgram"
        findViewById<TextView>(R.id.tvDBSYS32Grade).text = "Grade: $dbsys32Grade"
        findViewById<TextView>(R.id.tvINTPROG32Grade).text = "Grade: $intprog32Grade"
        findViewById<TextView>(R.id.tvSYSAD32Grade).text = "Grade: $sysad32Grade"

    }
}
