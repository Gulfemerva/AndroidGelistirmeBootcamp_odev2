package com.gulfemervaaltun.androidgelistirme_odev2

fun main() {
    //Nesne oluşturuldu
    val odev=odev2()

    //Metotlar çalıştırıldı
    println("100 celcius ${odev.fahrenheit(100.0)} fahrenheittir.")

    println("Dikdortgenin cevresi =${odev.dikdortgenCevre(12,14)}")

    println("3!= ${odev.faktoriyel(3)}");

    println("Ankara kelimesinin icinde ${odev.aHarfi("Ankara")} tane 'a' harfi vardir.")

    println("Altigenin ic aciları toplami= ${odev.icAci(6)}")

    println("10 gun calisanin maasi=${odev.maas(10)}")
    println("30 gun calisanin maasi=${odev.maas(30)}")

    println("30 kotanin ucreti=${odev.ucret(30)}TL")
    println("60 kotanin ucreti=${odev.ucret(60)}TL")


}