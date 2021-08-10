package au.edu.swin.sdmd.cardoop

fun main() {
    val c = Card("ACE", "HEARTS")

    c.printDetails()
    c.flip()
    c.printDetails()

}