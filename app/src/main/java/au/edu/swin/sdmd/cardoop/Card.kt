package au.edu.swin.sdmd.cardoop

class Card(val rank: String, val suit: String, var faceUp: Boolean = true) {
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
            return "$rank $suit"
        } else {
            return "------"
        }
    }
}