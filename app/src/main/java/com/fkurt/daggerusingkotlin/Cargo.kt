package com.fkurt.daggerusingkotlin

import android.util.Log
import javax.inject.Inject

class Cargo @Inject constructor (var adres:Adress ){
    fun send()
    {
        Log.e("Sonuç","Kargo ${adres.adressInfo} adresine gönderildi.")
    }
}