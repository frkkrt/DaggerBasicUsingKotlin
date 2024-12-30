package com.fkurt.daggerusingkotlin

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor (var adress:Adress ) {
    fun makeApplication()
    {
        Log.e("Sonuç","İnternet Başvurusu ${adress.adressInfo} adresine gönderildi.")
    }
}