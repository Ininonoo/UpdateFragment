package com.example.myproject2679

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        val btnMore:Button = findViewById(R.id.ButtonMenu4)
        val btnKid:Button = findViewById(R.id.ButtonBookKId)
        val rvBuku:RecyclerView = findViewById(R.id.recyclerViewBuku)


       btnKid.setOnClickListener {
           val intent = Intent(this, BookKidActivity::class.java)
           startActivity(intent)
       }

        rvBuku.layoutManager = LinearLayoutManager (this)

        val data = ArrayList<BukuModel>()
        data.add(
            BukuModel(R.drawable.book1, "Emi's Beach Adventure",
            "lorem jasgjagdahh jasdghjagahj uhaskj")
        )
        data.add(
            BukuModel(R.drawable.book2, "Ade's Adventure",
            "lorem jasgjagdahh jasdghjagahj uhaskj")
        )
        data.add(
            BukuModel(R.drawable.book4, "Mermaid To Rescue",
            "lorem jasgjagdahh jasdghjagahj uhaskj")
        )

        val adapter = AdapterHome(data)

        rvBuku.adapter = adapter
    }
}