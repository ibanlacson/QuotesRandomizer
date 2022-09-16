package com.auf.cea.quotesrandomizer

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.auf.cea.quotesrandomizer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding : ActivityMainBinding
    private lateinit var sharedPreferences: SharedPreferences
    private var faveQuote = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        sharedPreferences = getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
        setContentView(binding.root)
        supportActionBar?.hide()

        // DISPLAY RANDOM QUOTE
        val categoryNumber = MainHelper.getCategory()
        binding.txtRandomQuote.text = MainHelper.getRandomQuote(categoryNumber)

        // CHECK WHETHER THERE IS FAVE QUOTE
        faveQuote = sharedPreferences.getString(FAVORITE_QUOTE,"isEmpty").toString()
        isFaveEmpty(faveQuote)

        // BUTTON BINDING
        binding.btnLyricsQuotes.setOnClickListener(this)
        binding.btnMovieQuotes.setOnClickListener(this)
        binding.btnSadQuote.setOnClickListener(this)
        binding.btnFaveQuote.setOnClickListener(this)
    }

    override fun onResume() {
        super.onResume()
        faveQuote = sharedPreferences.getString(FAVORITE_QUOTE,"isEmpty").toString()
        isFaveEmpty(faveQuote)
    }

    private fun isFaveEmpty(faveQuoteStr:String){
        binding.btnFaveQuote.isEnabled = faveQuoteStr != "isEmpty"
    }

    override fun onClick(p0: View?) {
        when (p0!!.id){
            (R.id.btn_SadQuote) -> {
                val intent = Intent(this, DisplayQuoteActivity::class.java)
                intent.putExtra(CATEGORY,1)
                startActivity(intent)
            }

            (R.id.btn_LyricsQuotes) -> {
                val intent = Intent(this, DisplayQuoteActivity::class.java)
                intent.putExtra(CATEGORY,2)
                startActivity(intent)
            }

            (R.id.btn_MovieQuotes) -> {
                val intent = Intent(this, DisplayQuoteActivity::class.java)
                intent.putExtra(CATEGORY,3)
                startActivity(intent)
            }

            (R.id.btn_FaveQuote) -> {
                val intent = Intent(this, DisplayFaveQuoteActivity::class.java)
                startActivity(intent)
            }

        }
    }
}