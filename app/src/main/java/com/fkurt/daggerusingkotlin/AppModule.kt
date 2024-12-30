package com.fkurt.daggerusingkotlin

import dagger.Module
import dagger.Provides
@Module
class AppModule {
    @Provides
    fun provideAdress():Adress{
        return Adress("Osmangazi/BURSA")
    }
}