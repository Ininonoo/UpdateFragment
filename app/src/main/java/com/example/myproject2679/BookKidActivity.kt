package com.example.myproject2679

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class BookKidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_kid)

        val btnFairy : Button = findViewById(R.id.btnFairy)
        val btnFable : Button = findViewById(R.id.btnFable)
        val btnSc : Button = findViewById(R.id.btnScience)


        btnFairy.setOnClickListener{
            replaceFragment(FairyFragment())
        }

        btnFable.setOnClickListener{
            replaceFragment(FableFragment())
        }

        btnSc.setOnClickListener{
            replaceFragment(ScienceFragment())
        }


    }
    private  fun replaceFragment(frg:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragKid,frg)
        fragmentTrx.commit()
    }
}