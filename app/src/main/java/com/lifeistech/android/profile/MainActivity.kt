package com.lifeistech.android.profile

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        authorButton.setOnClickListener{
            authorButton.setBackgroundColor(Color.parseColor("#4FC7E5"))
            beginningButton.setBackgroundColor(Color.parseColor("#929292"))
            publicationYearButton.setBackgroundColor(Color.parseColor("#929292"))
            mainCharacterButton.setBackgroundColor(Color.parseColor("#929292"))
            hintContentText.text = "エドガー・アラン・ポー"
        }

        beginningButton.setOnClickListener{
            beginningButton.setBackgroundColor(Color.parseColor("#4FC7E5"))
            authorButton.setBackgroundColor(Color.parseColor("#929292"))
            publicationYearButton.setBackgroundColor(Color.parseColor("#929292"))
            mainCharacterButton.setBackgroundColor(Color.parseColor("#929292"))
            hintContentText.text = "分析的なものとして…"
        }

        publicationYearButton.setOnClickListener{
            publicationYearButton.setBackgroundColor(Color.parseColor("#4FC7E5"))
            authorButton.setBackgroundColor(Color.parseColor("#929292"))
            beginningButton.setBackgroundColor(Color.parseColor("#929292"))
            mainCharacterButton.setBackgroundColor(Color.parseColor("#929292"))
            hintContentText.text = "1841年"
        }

        mainCharacterButton.setOnClickListener{
            beginningButton.setBackgroundColor(Color.parseColor("#929292"))
            authorButton.setBackgroundColor(Color.parseColor("#929292"))
            publicationYearButton.setBackgroundColor(Color.parseColor("#929292"))
            mainCharacterButton.setBackgroundColor(Color.parseColor("#4FC7E5"))
            hintContentText.text = "C・オーギュスト・デュパン"
        }

        button1.setOnClickListener{
                button1.setBackgroundColor(Color.parseColor("#9c2121"))
            button2.setBackgroundColor(Color.parseColor("#929292"))
            button3.setBackgroundColor(Color.parseColor("#929292"))
            button4.setBackgroundColor(Color.parseColor("#929292"))
            answerText.text = "不正解！"
        }
        button2.setOnClickListener{
            button1.setBackgroundColor(Color.parseColor("#929292"))
            button2.setBackgroundColor(Color.parseColor("#9c2121"))
            button3.setBackgroundColor(Color.parseColor("#929292"))
            button4.setBackgroundColor(Color.parseColor("#929292"))
            answerText.text = "正解！おめでとう！"
        }
        button3.setOnClickListener{
            button1.setBackgroundColor(Color.parseColor("#929292"))
            button2.setBackgroundColor(Color.parseColor("#929292"))
            button3.setBackgroundColor(Color.parseColor("#9c2121"))
            button4.setBackgroundColor(Color.parseColor("#929292"))
            answerText.text = "不正解！"
        }
        button4.setOnClickListener{
            button1.setBackgroundColor(Color.parseColor("#929292"))
            button2.setBackgroundColor(Color.parseColor("#929292"))
            button3.setBackgroundColor(Color.parseColor("#929292"))
            button4.setBackgroundColor(Color.parseColor("#9c2121"))
            answerText.text = "不正解！"
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
