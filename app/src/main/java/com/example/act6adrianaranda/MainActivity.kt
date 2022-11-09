package com.example.act6adrianaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.act6adrianaranda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    binding.btmComenzar.setOnClickListener{
        var nom:String = binding.alumne.text.toString()
        goActivityPreguntes(nom)
    }

    }
    fun goActivityPreguntes(nom:String){
        if(nom.equals("")){
            Toast.makeText(this,"El nom no pot estar buit",Toast.LENGTH_SHORT).show()

        }else{
            val intent = Intent(this, ActivityPreguntes::class.java)
            intent.putExtra("nom", nom)
            startActivity(intent)
        }
    }
}