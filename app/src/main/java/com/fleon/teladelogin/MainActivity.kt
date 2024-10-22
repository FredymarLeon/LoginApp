package com.fleon.teladelogin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val button: Button by lazy { findViewById(R.id.button) }
    private val etName: EditText by lazy { findViewById(R.id.etName) }
    private val etPassword: EditText by lazy { findViewById(R.id.etPassword) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupLogin()
    }

    private fun setupLogin() {

        val senhaCorreta = "127.6"
        val usuarioCorreto = "Fredymar"

        button.setOnClickListener {
            if (etName.text.toString() != usuarioCorreto) {
                Toast.makeText(this, "Usuario incorreto", Toast.LENGTH_SHORT).show()
            } else if (etPassword.text.toString() != senhaCorreta) {
                Toast.makeText(this, "Senha incorreta", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login exitoso", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
