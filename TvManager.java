package com.company;

public class TvManager implements ArayuzTV, IKumanda {
    @Override
    public void sesAc() {
        System.out.println("Ses Acildi");
    }

    @Override
    public void sesKapat() {
        System.out.println("Ses Kapandi");
    }

    @Override
    public void uykuModu() {
        System.out.println("Uyku moduna girdi");
    }

    @Override
    public void sesAcKumanda() {
        System.out.println("Ses Açıldı");
    }

    @Override
    public void sesKapatKumanda() {
        System.out.println("Ses kapandı");
    }

    @Override
    public void kanalDegistirKumanda() {
        System.out.println("Kanal değişti");
    }
}
