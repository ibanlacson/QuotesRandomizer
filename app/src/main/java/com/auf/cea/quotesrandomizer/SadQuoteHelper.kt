package com.auf.cea.quotesrandomizer

import android.util.Log
import kotlin.random.Random

class SadQuoteHelper {
    companion object {
        private fun getNumber():Int {
            return Random.nextInt(1,11)
        }

        fun displaySadQuote():String{
            val malungQuotes = mapOf(
                Pair(1,"Some people are going to leave, but that’s not the end of your story. That’s the end of their part in your story. \n- Faraaz Kazi"),
                Pair(2,"It’s amazing how someone can break your heart and you can still love them with all the little pieces. \n- Ella Harper"),
                Pair(3,"Since I can’t be with you right now I will have to be content just dreaming about when we will be together again. \n- Susan Polis Schutz"),
                Pair(4,"You see, I usually find myself among strangers because I drift here and there trying to forget the sad things that happened to me.  – F. Scott Fitzgerald"),
                Pair(5,"I have learned now that while those who speak about one's miseries usually hurt, those who keep silence hurt more. \n – C.S. Lewis"),
                Pair(6,"So it's true, when all is said and done, grief is the price we pay for love. \n– E.A. Bucchianeri"),
                Pair(7,"To have been loved so deeply, even though the person who loved us is gone, will give us some protection forever.  \n– J.K. Rowling"),
                Pair(8,"The walls we build around us to keep sadness out also keep out the joy. \n- Jim Rohn"),
                Pair(9,"Breathing is hard. When you cry so much, it makes you realize that breathing is hard. \n- David Levithan"),
                Pair(10,"Sometimes you got to hurt something to help something. Sometimes you have to plow under one thing in order for something else to grow.  \n– Ernest J. Gaines")
            )
            return when (getNumber().toInt()) {
                (1) -> { malungQuotes[1].toString() }
                (2) -> { malungQuotes[2].toString() }
                (3) -> { malungQuotes[3].toString() }
                (4) -> { malungQuotes[4].toString() }
                (5) -> { malungQuotes[5].toString() }
                (6) -> { malungQuotes[6].toString() }
                (7) -> { malungQuotes[7].toString() }
                (8) -> { malungQuotes[8].toString() }
                (9) -> { malungQuotes[9].toString() }
                (10) -> { malungQuotes[10].toString() }
                else -> { malungQuotes[1].toString() }
            }
        }

    }
}