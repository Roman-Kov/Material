package com.rojer_ko.material.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.snackbar.Snackbar
import com.rojer_ko.material.R
import kotlinx.android.synthetic.main.activity_start.*
import kotlinx.android.synthetic.main.bottom_sheet.*

class StartActivity : BaseActivity() {

    private lateinit var  bottomSheetBehavior: BottomSheetBehavior<LinearLayout>
    override val layoutRes: Int = R.layout.activity_start
    override val isAppBar: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initViews()
        login()
        exit()
        showHelp()
    }

    private fun initViews(){
        bottomSheetBehavior = BottomSheetBehavior.from(bottom_sheet)
    }

    private fun login(){
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

    private fun exit(){
        btnExit.setOnClickListener {
            finish()
        }
    }

    private fun showHelp(){
        helpTextView.setOnClickListener {
            if(bottomSheetBehavior.state == BottomSheetBehavior.STATE_COLLAPSED) {
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
                return@setOnClickListener
            }
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
        }
    }
}
