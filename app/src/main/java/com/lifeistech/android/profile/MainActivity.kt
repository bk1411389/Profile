package com.lifeistech.android.profile

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myNameButton.setOnClickListener{
            myNameButton.setBackgroundColor(Color.parseColor("#4FC7E5"))
            myLikeSportsButton.setBackgroundColor(Color.parseColor("#929292"))
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#929292"))
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#929292"))
            myText.text = "？？？"
        }

        myLikeSportsButton.setOnClickListener{
            myLikeSportsButton.setBackgroundColor(Color.parseColor("#4FC7E5"))
            myNameButton.setBackgroundColor(Color.parseColor("#929292"))
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#929292"))
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#929292"))
            myText.text = "バスケ"
        }

        myLikeFoodsButton.setOnClickListener{
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#4FC7E5"))
            myNameButton.setBackgroundColor(Color.parseColor("#929292"))
            myLikeSportsButton.setBackgroundColor(Color.parseColor("#929292"))
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#929292"))
            myText.text = "すし"
        }

        myLikeHobbyButton.setOnClickListener{
            myLikeSportsButton.setBackgroundColor(Color.parseColor("#929292"))
            myNameButton.setBackgroundColor(Color.parseColor("#929292"))
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#929292"))
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#4FC7E5"))
            myText.text = "音楽"
        }

//        myImageView.visibility = View.INVISIBLE
//        myText.visibility = View.INVISIBLE
//
//        myNameButton.setOnClickListener{
//            myImageView.visibility = View.VISIBLE
//            myText.visibility = View.VISIBLE
//        }

    }
}
