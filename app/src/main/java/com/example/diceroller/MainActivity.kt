package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 * This activity allows the user to roll a dice and view the result on the screen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.bt_dice_roll)
        rollButton.setOnClickListener {

            rollDice()
            val toast = Toast.makeText(this, "Dice rolled!", Toast.LENGTH_SHORT)
            toast.show()

        }
    }

    /**
     * Roll the dice and update the screen with the result
     */
    private fun rollDice() {
//      create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

//      update the screen with dice roll
        val resultTextView: TextView = findViewById(R.id.tv_dice_roll)
        resultTextView.text = diceRoll.toString()
    }
}

/**
 *
 */

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}

