package au.edu.swin.sdmd.cardoop

import kotlin.random.Random

enum class Suit
{
    HEARTS, DIAMONDS, CLUBS, SPADES
}

enum class Rank
{
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

class Card(var rank: Rank, var suit: Suit, var faceUp: Boolean = true) {
    constructor(): this (
        Rank.values()[Random.nextInt(0, 13)],
        Suit.values()[Random.nextInt(0, 4)]
    )

    fun flip() {
        faceUp = !faceUp
    }

    fun printDetails() {
        if (faceUp) {
            println("$rank $suit")
        } else {
            println("------")
        }
    }

    fun getDetails():String {
        if (faceUp) {
            return "$rank of $suit"
        } else {
            return "------"
        }
    }
}