package com.example.act6adrianaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.act6adrianaranda.databinding.ActivityPreguntesBinding


class ActivityPreguntes : AppCompatActivity() {

    private lateinit var binding:ActivityPreguntesBinding
    val frag1 = FragmentP1()
    val frag2 = FragmentP2()
    val frag3 = FragmentP3()
    val frag4 = FragmentP4()
    val frag5 = FragmentP5()
    var actual = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPreguntesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        preguntes = omplirPreguntes()
        val nom = intent.getStringExtra("nom")

        for (a in 5 downTo 1){
            actual = a
            canviarFragment(escollirFragment())
        }

        binding.fb1.setOnClickListener{
            if(actual > 1){
                actual--
                canviarFragment(escollirFragment())
            }else{
                Toast.makeText(this,"Aquesta es la primera pregunta",Toast.LENGTH_SHORT).show()
            }
        }

        binding.fb2.setOnClickListener{
            if(actual < 5){
                actual++
                canviarFragment(escollirFragment())
            }else{
                Toast.makeText(this,"Aquesta es l'ultima pregunta",Toast.LENGTH_SHORT).show()
            }
        }

        binding.btmEnviar.setOnClickListener{
            preguntes[0] = frag1.setPregunta()
            preguntes[1] = frag2.setPregunta()
            preguntes[2] = frag3.setPregunta()
            preguntes[3] = frag4.setPregunta()
            preguntes[4] = frag5.setPregunta()

            val intent = Intent(this, ActivityResposta::class.java)
            intent.putExtra("nom", nom)
            startActivity(intent)
        }
    }

    fun escollirFragment(): Fragment{
        when(actual) {
            1 -> {
                frag1.getPregunta(preguntes[actual-1])
                return frag1
            }
            2 -> {
                frag2.getPregunta(preguntes[actual-1])
                return frag2
            }

            3 -> {
                frag3.getPregunta(preguntes[actual-1])
                return frag3
            }

            4 -> {
                frag4.getPregunta(preguntes[actual-1])
                return frag4
            }
            5 -> {
                frag5.getPregunta(preguntes[actual-1])
                return frag5
            }
        }
        return frag1
    }

    fun canviarFragment(frag:Fragment){
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()

        //Arguments
        val args = Bundle()
        frag.arguments = args
        transaction.replace(R.id.fc1, frag)
        transaction.addToBackStack(null)
        transaction.commit()
    }


}