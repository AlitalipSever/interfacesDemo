package com.company;

public class SonicManager extends GameController {

    public String Oyun = "Sonic";
    @Override
    public void oyunSec(String oyunx) {
        System.out.println(  oyunx + " Secildi");
    }

    @Override
    public void oyunBaslat(String oyunx) {
        System.out.println(  oyunx + " Baslatildi");
    }

    @Override
    public void oyunSonlandir(String oyunx) {
        System.out.println(oyunx + " Sonlandirildi");
    }
}
