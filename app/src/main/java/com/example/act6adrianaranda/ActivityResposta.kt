package com.example.act6adrianaranda

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.act6adrianaranda.databinding.ActivityRespostaBinding

class ActivityResposta : AppCompatActivity() {
    private lateinit var binding:ActivityRespostaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        val nota:Int
        val usuari = intent.getStringExtra("nom")
        binding = ActivityRespostaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        omplirPregResp()
        nota = compararPreguntes()

        binding.usuari.text = "Usuari: $usuari"
        binding.puntuacio.text = "Puntuació: $nota / ${preguntes.size}"
    }

    fun omplirPregResp(){
        binding.pregunta1.text = preguntes[0].pregunta
        binding.resposta1.text = preguntes[0].respostaUsuari

        binding.pregunta2.text = preguntes[1].pregunta
        binding.resposta2.text = preguntes[1].respostaUsuari

        binding.pregunta3.text = preguntes[2].pregunta
        binding.resposta3.text = preguntes[2].respostaUsuari

        binding.pregunta4.text = preguntes[3].pregunta
        binding.resposta4.text = preguntes[3].respostaUsuari

        binding.pregunta5.text = preguntes[4].pregunta
        binding.resposta5.text = preguntes[4].respostaUsuari
    }

    fun compararPreguntes():Int{

        var nota = 0
        if(preguntes[0].correcta.equals(preguntes[0].respostaUsuari))
        {
            binding.resposta1.setBackgroundColor(Color.GREEN)
            nota++
        }else{
            binding.resposta1.setBackgroundColor(Color.RED)
        }

        if(preguntes[1].correcta.equals(preguntes[1].respostaUsuari))
        {
            binding.resposta2.setBackgroundColor(Color.GREEN)
            nota++
        }else{
            binding.resposta2.setBackgroundColor(Color.RED)
        }
        if(preguntes[2].correcta.equals(preguntes[2].respostaUsuari))
        {
            binding.resposta3.setBackgroundColor(Color.GREEN)
            nota++
        }else{
            binding.resposta3.setBackgroundColor(Color.RED)
        }

        if(preguntes[3].correcta.equals(preguntes[3].respostaUsuari))
        {
            binding.resposta4.setBackgroundColor(Color.GREEN)
            nota++
        }else{
            binding.resposta4.setBackgroundColor(Color.RED)
        }

        if(preguntes[4].correcta.equals(preguntes[4].respostaUsuari))
        {
            binding.resposta5.setBackgroundColor(Color.GREEN)
            nota++
        }else{
            binding.resposta5.setBackgroundColor(Color.RED)
        }

        return nota
    }


}