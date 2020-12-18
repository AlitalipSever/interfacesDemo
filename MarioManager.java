package com.company;

public class MarioManager extends GameController {

    public String Oyun = "Mario";
    @Override
    public void oyunSec(String oyunx) {
        System.out.println( oyunx + " Secildi.");
    }

    @Override
    public void oyunBaslat(String oyunx) {
        System.out.println( oyunx + " baslatildi.");
    }

    @Override
    public void oyunSonlandir(String oyunx) {
        System.out.println( oyunx + " sonlandiridildi.");
    }
}
