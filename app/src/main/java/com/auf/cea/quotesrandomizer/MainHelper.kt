package com.auf.cea.quotesrandomizer

import kotlin.random.Random

class MainHelper {
    companion object {
        fun getCategory ():Int {
            return Random.nextInt(1,4)
        }

        fun getRandomQuote (category:Int):String {
            return when (category) {
                1 -> {SadQuoteHelper.displaySadQuote()}
                2 -> {LyricsQuoteHelper.displayLyricsQuote()}
                3 -> {MovieQuoteHelper.displayMovieQuote()}
                else -> {SadQuoteHelper.displaySadQuote()}
            }
        }
    }
}