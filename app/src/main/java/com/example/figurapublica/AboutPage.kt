package com.example.figurapublica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton

class AboutPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)

        val backToHome = findViewById<ImageButton>(R.id.aboutToHomePage)
        backToHome.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
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
            R.id.howToMenu -> {
                val howToIntent = Intent(this, HowTo::class.java)
                startActivity(howToIntent)
                overridePendingTransition(R.anim.animation_enter,R.anim.animation_leave)
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}