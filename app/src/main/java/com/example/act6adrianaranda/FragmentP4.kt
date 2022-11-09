package com.example.act6adrianaranda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import com.example.act6adrianaranda.databinding.FragmentP4Binding

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentP4.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentP4 : Fragment() {
    private lateinit var pregunta:Pregunta
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentP4Binding
        binding = FragmentP4Binding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        binding.pregunta.text = pregunta.pregunta
        binding.rbresposta1.text = pregunta.resposta1
        binding.rbresposta2.text = pregunta.resposta2
        binding.rbresposta3.text = pregunta.resposta3
        binding.radioGroup.setOnCheckedChangeListener { radioGroup, i ->
            val radio = view?.findViewById<RadioButton>(i)
            var resposta = radio?.text.toString()
            pregunta.respostaUsuari = resposta

        }
        return binding.root

    }

    fun getPregunta(preg: Pregunta) {
        println("pregunta: " + preg.pregunta)
        pregunta = preg
    }

    fun setPregunta(): Pregunta {
        return pregunta
    }

}