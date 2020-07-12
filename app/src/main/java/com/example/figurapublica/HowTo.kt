package com.example.figurapublica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton


class HowTo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_to)

        val backButton = findViewById<ImageButton>(R.id.backButton)

        backButton.setOnClickListener{
            val homeIntent = Intent(this, MainActivity::class.java)
            startActivity(homeIntent)
            overridePendingTransition(R.anim.animation_enter,R.anim.animation_leave)
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId)
        {
            R.id.aboutMenu -> {
                val howToIntent = Intent(this, AboutPage::class.java)
                startActivity(howToIntent)
                overridePendingTransition(R.anim.animation_enter,R.anim.animation_leave)
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}