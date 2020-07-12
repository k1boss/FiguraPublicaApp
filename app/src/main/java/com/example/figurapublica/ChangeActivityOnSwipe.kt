package com.example.figurapublica
/*
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GestureDetectorCompat

class ChangeActivityOnSwipe(val context: Context, val nextActivity: Activity?, val previousActivity: kotlin.Any): AppCompatActivity(){
    private lateinit var gestureDetectorCompat: GestureDetectorCompat


    //Swipe motion event detect
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        gestureDetectorCompat = GestureDetectorCompat(context, SwipeRightToLeft())
        this.gestureDetectorCompat.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    inner class SwipeRightToLeft: GestureDetector.SimpleOnGestureListener() {
        //swipe right to left
        override fun onFling(
            e1: MotionEvent?,
            e2: MotionEvent?,
            velocityX: Float,
            velocityY: Float
        ): Boolean {

            if (e1 != null && e2 != null) {
                if(nextActivity!=null)
                {
                    if (e2.x < e1.x) {
                        //Action performed when swipe
                        //TODO next activity
                        val nextIntent = Intent(context, nextActivity::class.java)
                        context.startActivity(nextIntent)
                    }
                }

                if(previousActivity!=null)
                {
                    if(e2.x > e1.x){
                        //Action performed when swipe
                        //TODO next activity
                        val nextIntent = Intent(context, previousActivity::class.java)
                        context.startActivity(nextIntent)
                    }
                }
            }
            return true
        }
    }


}*/