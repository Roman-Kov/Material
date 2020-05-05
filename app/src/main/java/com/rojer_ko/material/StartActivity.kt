package com.rojer_ko.material

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //setTheme(R.style.AppTheme_MyDark)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        start()
    }

    private fun start(){
        btnStart.setOnClickListener {
            val login : String = loginTextInput.text.toString()
            if(login == ""){
                    Snackbar.make(it, "Login is empty!!!", Snackbar.LENGTH_LONG).show()
                    return@setOnClickListener
                }
            if (login.length > resources.getInteger(R.integer.counterMax)){
                Snackbar.make(it, "Too many symbols in Login!!!", Snackbar.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("login", login)
            startActivity(intent)
        }
    }
}
