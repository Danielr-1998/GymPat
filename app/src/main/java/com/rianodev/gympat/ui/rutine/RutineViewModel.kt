package com.rianodev.gympat.ui.rutine

import androidx.lifecycle.ViewModel
import com.rianodev.gympat.domain.model.RutineInfo
import com.rianodev.gympat.domain.model.RutineInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class RutineViewModel @Inject constructor():ViewModel(){

    private var _rutine = MutableStateFlow<List<RutineInfo>>(emptyList())
    val rutine:StateFlow<List<RutineInfo>> = _rutine

    init {
        _rutine.value = listOf(
            ApPoleas, Aperturas, CurlBarra, CurlBiceps, EleFrontal, Flexiones, PatTriceps, Pectoral, PesoMuerto, PressBanca, PressFrances,
            Press, PressSentado, Remo, SenBarra, SenBulgara, Zancada
        )
    }

}