package com.example.recycleviewkotlinlatihan4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.hulk,
                "hulk",
                "sosok pahlawan super fiktif dari Marvel Comics. Memiliki musuh besar bernama Salwi Ackerman dan Baron Zemo, Rogers adalah tentara AS yang tidak memiliki kemampuan sama sekali. Berkat bantuan Dr. Joshef Reinstein dengan serum super soldiernya. Pahlawan yang lahir pada tahun 1920 ini menjadi pahlawan perang Amerika Serikat saat menghadapi sekutu NAZI yang dipimpin oleh Adolf Hitler. Dibuat oleh komikus Joe Simon dan Jack Kirby, karakter pertama kali muncul di Captain America Comics # 1 (cover Maret 1941) dari Timely Comics, pendahulu dari Marvel Comics."
            ),
            Superhero(
                R.drawable.flash,
                "flash",
                " sebuah film superhero Amerika Serikat yang dirilis pada 17 Juli 2015. Film ini merupakan film kedua belas di Marvel Cinematic Universe. Film ini dibintangi oleh Paul Rudd, Evangeline Lilly, Corey Stoll, Bobby Cannavale, Michael Peña, Judy Greer, Tip \"T.I\" Harris, David Dastmalchian, Wood Harris, Jordi Mollà, dan Michael Douglas."
            ),
            Superhero(
                R.drawable.batman,
                "batman",
                " sebuah film superhero Amerika Serikat yang dirilis pada 17 Juli 2015. Film ini merupakan film kedua belas di Marvel Cinematic Universe. Film ini dibintangi oleh Paul Rudd, Evangeline Lilly, Corey Stoll, Bobby Cannavale, Michael Peña, Judy Greer, Tip \"T.I\" Harris, David Dastmalchian, Wood Harris, Jordi Mollà, dan Michael Douglas."
            ),
            Superhero(
                R.drawable.aquaman,
                "aquaman",
                " sebuah film superhero Amerika Serikat yang dirilis pada 17 Juli 2015. Film ini merupakan film kedua belas di Marvel Cinematic Universe. Film ini dibintangi oleh Paul Rudd, Evangeline Lilly, Corey Stoll, Bobby Cannavale, Michael Peña, Judy Greer, Tip \"T.I\" Harris, David Dastmalchian, Wood Harris, Jordi Mollà, dan Michael Douglas."
            ),
            Superhero(
                R.drawable.superman,
                "Superman",
                " sebuah film superhero Amerika Serikat yang dirilis pada 17 Juli 2015. Film ini merupakan film kedua belas di Marvel Cinematic Universe. Film ini dibintangi oleh Paul Rudd, Evangeline Lilly, Corey Stoll, Bobby Cannavale, Michael Peña, Judy Greer, Tip \"T.I\" Harris, David Dastmalchian, Wood Harris, Jordi Mollà, dan Michael Douglas."
            ),
            Superhero(
                R.drawable.thor,
                "thor",
                " sebuah film superhero Amerika Serikat yang dirilis pada 17 Juli 2015. Film ini merupakan film kedua belas di Marvel Cinematic Universe. Film ini dibintangi oleh Paul Rudd, Evangeline Lilly, Corey Stoll, Bobby Cannavale, Michael Peña, Judy Greer, Tip \"T.I\" Harris, David Dastmalchian, Wood Harris, Jordi Mollà, dan Michael Douglas."
            ),
            Superhero(
                R.drawable.spiderman,
                "spiderman",
                " sebuah film superhero Amerika Serikat yang dirilis pada 17 Juli 2015. Film ini merupakan film kedua belas di Marvel Cinematic Universe. Film ini dibintangi oleh Paul Rudd, Evangeline Lilly, Corey Stoll, Bobby Cannavale, Michael Peña, Judy Greer, Tip \"T.I\" Harris, David Dastmalchian, Wood Harris, Jordi Mollà, dan Michael Douglas."
            ),

            )

        val recyclerView= findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent(this,DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}