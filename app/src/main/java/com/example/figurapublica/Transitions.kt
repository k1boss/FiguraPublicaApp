package com.example.figurapublica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class Transitions() : AppCompatActivity(){

    companion object: AppCompatActivity(){
        fun transitionRightToLeft(){
            overridePendingTransition(R.anim.animation_leave,
                R.anim.animation_enter);
            finish()
        }

        fun transitionLeftToRight(){
            overridePendingTransition(R.anim.animation_enter,
                R.anim.animation_leave);
            finish()
        }
    }


}
