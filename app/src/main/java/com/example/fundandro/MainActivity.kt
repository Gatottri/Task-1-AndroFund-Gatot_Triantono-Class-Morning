package com.example.fundandro


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.home)

        val userName = intent.getParcelableExtra<User>("User")?.userName
        val password = intent.getParcelableExtra<User>("User")?.password
        tv.text = "Username $userName and Password $password"


        val btnstart: Button = findViewById(R.id.btn_start)
        btnstart.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_start -> {

                val intent = Intent()
                intent.putExtra("Log", "You have login")
                setResult(RESULT_OK, intent)
                finish()
            }

        }
    }
}