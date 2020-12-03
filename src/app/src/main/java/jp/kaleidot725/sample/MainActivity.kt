package jp.kaleidot725.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fullScreenDialogButton = findViewById<Button>(R.id.fullscreen_dialog_fragment_button)
        fullScreenDialogButton.setOnClickListener {
            FullScreenDialogFragment().show(supportFragmentManager, "")
        }
    }
}
