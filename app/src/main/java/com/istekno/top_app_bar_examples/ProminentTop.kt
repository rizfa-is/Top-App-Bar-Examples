package com.istekno.top_app_bar_examples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.topAppBar
import kotlinx.android.synthetic.main.prominent_bar.*

class ProminentTop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.prominent_bar)

        window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

        btn_regular.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        topAppBarProm.setNavigationOnClickListener {
            Toast.makeText(this,"Click on Navigation Menu", Toast.LENGTH_SHORT).show()
        }

        topAppBarProm.setOnMenuItemClickListener {
            when(it.itemId) {
                R.id.favorite -> {
                    Toast.makeText(this, "Click on Favorite icon", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.search -> {
                    Toast.makeText(this, "Click on Search icon", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.more -> {
                    Toast.makeText(this, "Click on More icon", Toast.LENGTH_SHORT).show()
                    true
                }
            }
            false
        }
    }
}