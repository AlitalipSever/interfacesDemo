package com.company;

public abstract class GameController {
    public abstract void oyunSec(String oyun);
    public abstract void oyunBaslat(String oyun);
    public abstract void oyunSonlandir(String oyun);

    public final void oyunKaydet(){
        System.out.println("Oyun kaydedildi");
    }
}
