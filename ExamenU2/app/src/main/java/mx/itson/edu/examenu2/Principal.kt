package mx.itson.edu.examenu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        setupButtonClickListener(R.id.btn_detalles, "detalles")
        setupButtonClickListener(R.id.btn_globos, "globos")
        setupButtonClickListener(R.id.btn_peluches, "peluches")
        setupButtonClickListener(R.id.btn_regalos, "regalos")
        setupButtonClickListener(R.id.btn_tazas, "tazas")
    }

    private fun setupButtonClickListener(buttonId: Int, action: String) {
        findViewById<Button>(buttonId).setOnClickListener {
            val intent = Intent(this, Regalos::class.java).apply {
                putExtra("click", action)
            }
            startActivity(intent)
        }
    }
}
