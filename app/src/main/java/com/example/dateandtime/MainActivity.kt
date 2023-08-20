package com.example.dateandtime

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    private lateinit var currentDate:LocalDateTime
    private var Dateformate=DateTimeFormatter.ofPattern("yyyy-MM-dd hh-mm-ss a")
    private lateinit var formatteddate:String
    private lateinit var datelabel:TextView
    private lateinit var timer: CountDownTimer

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        datelabel=findViewById(R.id.datatime)

        timer = object : CountDownTimer(Long.MAX_VALUE, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                updateTimeDisplay()
                }

            override fun onFinish() {
                TODO("Not yet implemented")
                //not required
            }
        }
        timer.start()

    }

    fun updateTimeDisplay(){
        currentDate=LocalDateTime.now()
        formatteddate=currentDate.format(Dateformate)
        datelabel.text = formatteddate
    }

    }

