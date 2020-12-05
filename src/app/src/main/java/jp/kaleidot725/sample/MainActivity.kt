package jp.kaleidot725.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val normalDialogFragmentButton = findViewById<Button>(R.id.normal_dialog_fragment_button)
        normalDialogFragmentButton.setOnClickListener {
            NormalDialogFragment().show(supportFragmentManager, "")
        }

        val fullScreenDialogButton = findViewById<Button>(R.id.fullscreen_dialog_fragment_button)
        fullScreenDialogButton.setOnClickListener {
            FullScreenDialogFragment().show(supportFragmentManager, "")
        }

        val backgroundDialogFragmentButton = findViewById<Button>(R.id.background_dialog_fragment)
        backgroundDialogFragmentButton.setOnClickListener {
            BackgroundDialogFragment().show(supportFragmentManager, "")
        }

        val positionDialogFragmentButton = findViewById<Button>(R.id.position_dialog_fragment)
        positionDialogFragmentButton.setOnClickListener {
            PositionDialogFragment().show(supportFragmentManager, "")
        }

        val roundedDialogFragmentButton = findViewById<Button>(R.id.rounded_dialog_fragment)
        roundedDialogFragmentButton.setOnClickListener {
            RoundedDialogFragment().show(supportFragmentManager, "")
        }

        val popUpDialogFragmentButton = findViewById<Button>(R.id.popup_dialog_fragment)
        popUpDialogFragmentButton.setOnClickListener {
            PopUpDialogFragment().show(supportFragmentManager, "")
        }
    }
}
