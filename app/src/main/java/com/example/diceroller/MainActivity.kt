package com.example.diceroller

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dice.addAnimatorListener(object :Animator.AnimatorListener{
            override fun onAnimationStart(p0: Animator?) {
            }


            override fun onAnimationEnd(p0: Animator?) {
                hidedice()
                val num=(1..6).random()
                textView.text=num.toString()
            }

            override fun onAnimationCancel(p0: Animator?) {
            }

            override fun onAnimationRepeat(p0: Animator?) {
            }
        })

    }

    fun rolldice(view: View) {
        showdice()
        dice.playAnimation()
    }

    private fun showdice() {
        dice.visibility=View.VISIBLE
        textView.visibility=View.GONE
        button1.isEnabled=false

    }
    private fun hidedice(){
        dice.visibility=View.GONE
        textView.visibility=View.VISIBLE
        button1.isEnabled=true

    }
}