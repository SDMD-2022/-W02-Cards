package au.edu.swin.sdmd.cardoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val c = Card("ACE", "HEARTS")
        var c = Card(Rank.ACE, Suit.HEARTS)

        val flip = findViewById<Switch>(R.id.flip)

        update(c, flip.isChecked)

        flip.setOnCheckedChangeListener { _, isChecked ->
           update(c, isChecked)
        }

        val random = findViewById<Button>(R.id.random)
        random.setOnClickListener {
            c = Card()
            update(c, flip.isChecked)
        }

    }

    fun update(card: Card, flipped: Boolean)
    {
        card.faceUp = flipped
        val rankSuit = findViewById<TextView>(R.id.rank_suit)
        rankSuit.text = card.getDetails()
    }
}