package com.example.act6adrianaranda

data class Pregunta(
    var pregunta:String,
    var resposta1:String,
    var resposta2:String,
    var resposta3:String,
    var correcta:String,
    var respostaUsuari:String?
)

var preguntes = ArrayList<Pregunta>()
fun omplirPreguntes():ArrayList<Pregunta>{
    preguntes.add(
        Pregunta(
            "Pregunta 1: Quins tipus de variables tenim en Kotlin?",
            "Solament variables mutables",
            "Solament variables inmutables",
            "Variables mutables i inmutables",
            "Variables mutables i inmutables",
            null
        )
    )
    preguntes.add(
        Pregunta(
            "Pregunta 2: ¿Qué es la seguridad nula en Kotlin?",
            "Permite que los programas reduzcan NullPointerExceptions durante el tiempo de ejecución",
            "Permiteix que ningú pugui accedir al nostre programa",
            "No te protecció contra atacs",
            "Permite que los programas reduzcan NullPointerExceptions durante el tiempo de ejecución",
            null
        )
    )
    preguntes.add(
        Pregunta(
            "Pregunta 3: ¿Kotlin permite llamar a funciones de Java?",
            "Si",
            "No",
            "NS/NC",
            "Si",
            null
        )
    )
    preguntes.add(
        Pregunta(
            "Pregunta 4: Quins tipus de variables tenim en Kotlin?",
            "Solament variables mutables",
            "Solament variables inmutables",
            "Variables mutables i inmutables",
            "Variables mutables i inmutables",
            null
        )
    )
    preguntes.add(
        Pregunta(
            "Pregunta 5: Quins tipus de variables tenim en Kotlin?",
            "Solament variables mutables",
            "Solament variables inmutables",
            "Variables mutables i inmutables",
            "Variables mutables i inmutables",
            null
        )
    )
    return preguntes
}

