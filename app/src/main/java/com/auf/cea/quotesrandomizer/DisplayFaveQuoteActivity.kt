package com.auf.cea.quotesrandomizer

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.auf.cea.quotesrandomizer.databinding.ActivityDisplayFaveQuoteBinding
import com.auf.cea.quotesrandomizer.databinding.ActivityDisplayQuoteBinding

class DisplayFaveQuoteActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding : ActivityDisplayFaveQuoteBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayFaveQuoteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences = getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

        // Retrieve Data from SharedPreferences
        val faveQuoteString = sharedPreferences.getString(FAVORITE_QUOTE,"Fave Quote")
        val timestamp = sharedPreferences.getString(TIMESTAMP,"time ngayon")

        // Display Strings
        binding.txtFavoriteQuote.text = faveQuoteString.toString()
        binding.txtTimeStamp.text = timestamp.toString()
        binding.btnRemoveFave.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        //Clear Data stored in SharedPreferences
        sharedPreferences.edit().clear().apply()
        finish()
    }
}