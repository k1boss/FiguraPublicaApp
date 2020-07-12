package com.example.figurapublica


import android.content.Intent
import android.os.Bundle
import android.view.GestureDetector
import android.view.Menu
import android.view.MenuItem
import android.view.MotionEvent
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GestureDetectorCompat


class MainActivity : AppCompatActivity() {

    //  parte do codigo de navegação com swipes
    //private lateinit var gestureDetectorCompat: GestureDetectorCompat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //  parte do codigo de navegação com swipes
        //gestureDetectorCompat = GestureDetectorCompat(this,MyGestureListener() )

        val goToBiographyButton = findViewById<ImageButton>(R.id.goToMainButton)
        goToBiographyButton.setOnClickListener{
            val goToBiographyIntent = Intent(this, Biography::class.java)
            startActivity(goToBiographyIntent)
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

            R.id.aboutMenu -> {
                val howToIntent = Intent(this, AboutPage::class.java)
                startActivity(howToIntent)
                overridePendingTransition(R.anim.animation_enter,R.anim.animation_leave)
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    /*  CODE NOT WORKING ON EVERYTHING
        ESCLARECER COM O PROFESSOR
    //Swipe motion event detect
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        this.gestureDetectorCompat.onTouchEvent(event)
        return super.onTouchEvent(event)
    }


    inner class MyGestureListener: GestureDetector.SimpleOnGestureListener(){
        //swipe right to left
        override fun onFling(
            e1: MotionEvent?,
            e2: MotionEvent?,
            velocityX: Float,
            velocityY: Float
        ): Boolean {

            if(e1 != null && e2 != null)
            {
                if(e2.getX() < e1.getX())
                {
                    //Action performed when swipe right to left
                    //TODO next activity
                    val nextIntent = Intent(this@MainActivity, Biography::class.java)
                    startActivity(nextIntent)
                    overridePendingTransition(R.anim.animation_enter,R.anim.animation_leave)
                    finish()
                }
            }
            return true
        }
    }*/


}