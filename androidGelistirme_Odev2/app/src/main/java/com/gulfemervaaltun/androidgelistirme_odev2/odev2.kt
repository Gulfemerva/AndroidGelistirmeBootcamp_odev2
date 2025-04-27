package com.gulfemervaaltun.androidgelistirme_odev2


class odev2 {
    //Celcius girilen dereceyi fahrenheit e çeviren metot
    fun fahrenheit(celcius: Double):Double{
        return celcius*1.8+32
    }

    //Dikdörtgenin kısa ve uzun kenar bilgisini parametre olarak alıp çevre hesaplayan metot
    fun dikdortgenCevre(kısaKenar:Int, uzunKenar:Int):Int{
        return 2*(kısaKenar+uzunKenar)
    }

    //Girilen sayının faktöriyelini hesaplayan metot
    fun faktoriyel(sayi:Int):Int{
        var result=1
        for (i in 1..sayi){
            result *=i
        }
        return result
    }

    //Girilen kelimenin içinde kaç tane "a" harfi olduğunu hesaplayan metot
    fun aHarfi(kelime:String):Int{
        var sayi=0
        for (char in kelime){
            if (char.lowercaseChar()== 'a'){
                sayi++
            }
        }
        return sayi
    }

    //Kenar sayısı girilen çokgenin iç açılarının toplamını hesaplayan metot
    fun icAci(kenar: Int):Int{
        return (kenar-2)*180
    }

    //Çalışılan güne göre maaş hesabı yapan metot
    fun maas(gun:Int):Int{
        var saat = gun*8  //her gün 8 saat çalışabilir
        var maas=0
        if (saat >=160){  //160 saaten fazlası mesaidir : 20TL
            maas= 160*10+(saat-160)*20
        }else{            //normal 1 saatlik ücret : 10TL
            maas=saat*10
        }
        return maas
    }

    //Kotaya göre ücret hesabı yapan metot
    fun ucret(kota:Int):Int{
        var ucret=0
        //50 nin altında 100TL dir
        if(kota<=50){
            ucret=100
        }else{  //50'nin üstündeki her 1GB için 4 Tl ücretlendirme yapılır
            ucret=100+(kota-50)*4
        }
        return ucret
    }
}