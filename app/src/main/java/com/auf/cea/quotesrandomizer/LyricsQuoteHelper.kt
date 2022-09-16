package com.auf.cea.quotesrandomizer

import kotlin.random.Random

class LyricsQuoteHelper {
    companion object {
        private fun getNumber():Int {
            return Random.nextInt(1,11)
        }

        fun displayLyricsQuote():String{
            val lyricsQuote = mapOf(
                Pair(1,"You're my end and my beginning. Even when I lose, I'm winning. \n— All of Me, John Legend"),
                Pair(2,"Time is my friend until this life ends. There's nothing that it cannot mend. \n— My Favourite Clothes, RINI"),
                Pair(3,"I'm in love with you and all these little things. \n— Little Things, One Direction"),
                Pair(4,"I fell in, I'm falling, I'm for you. \n— Better, Zayn Malik"),
                Pair(5,"I've never been a fan of change, but I'd follow you to any place. \n— Late Night Talking, Harry Styles"),
                Pair(6,"And you are the answer to questions that I didn't know my soul was asking. \n— Too Good, Christian Kuria"),
                Pair(7,"And in this crazy life, and through these crazy times, it's you. \n— Everything, Michael Bublé"),
                Pair(8,"Heartbreaks, headaches; the doctor says I'm diagnosed with shit days, mistakes, but I'll be fine. \n— Painkiller, Ruel"),
                Pair(9,"I can't save us, my Atlantis. We built it up to pull it down. \n— Atlantis, Seafret"),
                Pair(10,"And you're my survival, you're my living proof that my love is alive and not dead. \n— I’ll Be, Edwin McCain"),
            )
            return when (getNumber()) {
                (1) -> { lyricsQuote[1].toString() }
                (2) -> { lyricsQuote[2].toString() }
                (3) -> { lyricsQuote[3].toString() }
                (4) -> { lyricsQuote[4].toString() }
                (5) -> { lyricsQuote[5].toString() }
                (6) -> { lyricsQuote[6].toString() }
                (7) -> { lyricsQuote[7].toString() }
                (8) -> { lyricsQuote[8].toString() }
                (9) -> { lyricsQuote[9].toString() }
                (10) -> { lyricsQuote[10].toString() }
                else -> { lyricsQuote[1].toString() }
            }
        }
    }
}