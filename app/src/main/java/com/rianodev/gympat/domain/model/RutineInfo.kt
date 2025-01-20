package com.rianodev.gympat.domain.model

import com.rianodev.gympat.R

sealed class RutineInfo (val img:Int,val name:Int ){
    object ApPoleas : RutineInfo(R.drawable.ap_poleas, R.string.ap_poleas)
    object Aperturas : RutineInfo(R.drawable.aperturas_man, R.string.aperturas)
    object CurlBarra : RutineInfo(R.drawable.ap_poleas, R.string.curl_barra)
    object CurlBiceps : RutineInfo(R.drawable.aperturas_man, R.string.curl_biceps)
    object EleFrontal : RutineInfo(R.drawable.ele_frontales, R.string.ele_frontales)
    object Flexiones : RutineInfo(R.drawable.flexiones, R.string.flexiones)
    object PatTriceps : RutineInfo(R.drawable.pat_triceps, R.string.pat_triceps)
    object Pectoral : RutineInfo(R.drawable.pectoral_maq, R.string.pectoral)
    object PesoMuerto : RutineInfo(R.drawable.peso_muerto, R.string.peso_muerto)
    object PressBanca : RutineInfo(R.drawable.press_de_banca, R.string.press_banca)
    object PressFrances : RutineInfo(R.drawable.press_frances, R.string.press_frances)
    object Press : RutineInfo(R.drawable.press_man, R.string.press_man)
    object PressSentado : RutineInfo(R.drawable.press_sentado, R.string.press_sentado)
    object Remo : RutineInfo(R.drawable.remo, R.string.remo)
    object SenBarra : RutineInfo(R.drawable.sen_barra, R.string.sen_barra)
    object SenBulgara : RutineInfo(R.drawable.sen_bulgara, R.string.sen_bulgara)
    object Zancada : RutineInfo(R.drawable.zan_lunge, R.string.zan_lunge)

}