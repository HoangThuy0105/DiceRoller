package hoangthuy.dmt.happybirthday

import android.app.Activity
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
//            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
//            toast.show()
            val resultTextView: TextView = findViewById(R.id.button)
            resultTextView.text ="9"
        }
    }
    private fun rollDice(){
        val dice = Dice(6)
        val diceRoll = dice.roll()
//        val resultTextView: TextView = findViewById(R.id.button)
//        resultTextView.text = diceRoll.toString()
        val diceImage: ImageView = findViewById(R.id.imageView2)

        when (diceRoll){
            1 -> diceImage.setImageResource(R.drawable.dice_six)
            2 -> diceImage.setImageResource(R.drawable.perspective_dice_six_faces_five)
            3 -> diceImage.setImageResource(R.drawable.perspective_dice_six_faces_four)
            4 -> diceImage.setImageResource(R.drawable.perspective_dice_six_faces_one)
            5 -> diceImage.setImageResource(R.drawable.perspective_dice_six_faces_three)
            else -> R.drawable.perspective_dice_six_faces_two

        }

    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

        rollDice()
    }
    class Dice (val numSides:Int){
        fun roll(): Int{
            return (1..numSides).random()
        }
    }
}