package au.edu.swin.sdmd.cardoop

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun flip_card() {
        val c = Card("ACE", "HEARTS")
        c.flip()
        assertEquals(c.getDetails(), "------")
    }
}