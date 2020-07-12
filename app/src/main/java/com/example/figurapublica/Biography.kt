package com.example.figurapublica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.Menu
import android.view.MenuItem
import android.view.MotionEvent
import android.widget.ImageButton
import androidx.core.view.GestureDetectorCompat

class Biography : AppCompatActivity() {
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biography)

        val goToMainButton = findViewById<ImageButton>(R.id.goToMainButton)
        val goToPhotoAlbum = findViewById<ImageButton>(R.id.goToPhotoAlbum)

        goToMainButton.setOnClickListener{
            val goHome = Intent(this, MainActivity::class.java)
            this.startActivity(goHome)
            overridePendingTransition(R.anim.animation_enter,R.anim.animation_leave)
            finish()
        }

        goToPhotoAlbum.setOnClickListener{
            val goToAlbumIntent = Intent(this, PhotoAlbum::class.java)
            this.startActivity(goToAlbumIntent)
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
            }

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