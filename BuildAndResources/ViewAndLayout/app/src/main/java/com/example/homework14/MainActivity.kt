package com.example.homework14

import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton.setOnClickListener{
            val view = layoutInflater.inflate(R.layout.dynamic, container, false)
            container.addView(view)
            checkboxAgreement.isEnabled = false
            loginButton.isEnabled = false
            editTextLogin.isEnabled = false
            editTextPassword.isEnabled = false
            Handler().postDelayed({
                container.removeView(view)
                checkboxAgreement.isEnabled = true
                loginButton.isEnabled = true
                editTextLogin.isEnabled = true
                editTextPassword.isEnabled = true
                Toast.makeText(this, R.string.completedAction, Toast.LENGTH_LONG).show()
            },2000)
            
        }
    }
}