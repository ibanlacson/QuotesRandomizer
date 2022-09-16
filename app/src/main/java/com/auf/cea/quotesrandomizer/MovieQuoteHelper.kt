package com.auf.cea.quotesrandomizer

import kotlin.random.Random

class MovieQuoteHelper {
    companion object {
        private fun getNumber():Int {
            return Random.nextInt(1,11)
        }

        fun displayMovieQuote():String{
            val movieQuotes = mapOf(
                Pair(1,"I deserve an explanation! I need an acceptable reason! \n- Starting Over Again (2014)"),
                Pair(2,"She loved me at my worst. You had me at my best. At binalewala mo lahat yun. \n- One More Chance (2007)"),
                Pair(3,"Akala mo lang wala pero meron, meron, meron! \n- Bata, Bata, Paano Ka Ginawa? (1998)"),
                Pair(4,"My brother is not a pig! Ang kapatid ko ay tao, hindi baboy damo! \n- Minsa’y Isang Gamu-gamo (1976)"),
                Pair(5,"Negosyo o kalayaan? Bayan o sarili? Pumili ka! \n- Heneral Luna (2015)"),
                Pair(6,"Dahil nga ang mundo ay isang malaking Quiapo. Maraming snatcher. Maagawan ka, lumaban ka! \n- No Other Woman (2011)"),
                Pair(7,"May mali ba sa akin? Pangit ba ako? \n– My Ex and Whys (2017)"),
                Pair(8,"Come back to the young and beautiful you. \n- Beauty in a Bottle (2014)"),
                Pair(9,"Connections that you don’t have. \n- It Takes a Man and a Woman (2013)"),
                Pair(10,"May mga bagay na kailangan mong paghirapan bago mo makuha. \n- Kita-Kita (2017)")
            )
            return when (getNumber()) {
                (1) -> { movieQuotes[1].toString() }
                (2) -> { movieQuotes[2].toString() }
                (3) -> { movieQuotes[3].toString() }
                (4) -> { movieQuotes[4].toString() }
                (5) -> { movieQuotes[5].toString() }
                (6) -> { movieQuotes[6].toString() }
                (7) -> { movieQuotes[7].toString() }
                (8) -> { movieQuotes[8].toString() }
                (9) -> { movieQuotes[9].toString() }
                (10) -> { movieQuotes[10].toString() }
                else -> { movieQuotes[1].toString() }
            }
        }

    }
}