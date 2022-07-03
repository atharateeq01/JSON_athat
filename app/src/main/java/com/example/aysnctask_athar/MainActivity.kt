package com.example.aysnctask_athar

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONException
import org.json.JSONObject
class MainActivity : AppCompatActivity() {
    lateinit var textViewName: TextView
    lateinit var textViewSal: TextView
    var jsonString = "{\"employee\":{\"name\":\"Athar\",\"salary\":14206}}"
    lateinit var name:String
    lateinit var salary:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Athar Ateeq"
        textViewName = findViewById(R.id.textViewName)
        textViewSal = findViewById(R.id.textViewSal)
        try {
            // get JSONObject from JSON file
            val obj = JSONObject(jsonString)
            // fetch JSONObject named employee
            val employee: JSONObject = obj.getJSONObject("employee")
            // get employee name and salary
            name = employee.getString("name")
            salary = employee.getString("salary")
            // set employee name and salary in TextView's
            textViewName.text = "Name: $name"
            textViewSal.text = "Salary: $salary"
        } catch (e: JSONException) {
            e.printStackTrace()
        }
    }
}