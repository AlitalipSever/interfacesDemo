package com.company;

public class Main {

    public static void main(String[] args) {
	TvManager tvManager = new TvManager();
	SonicManager sonicManager = new SonicManager();
	MarioManager marioManager = new MarioManager();

	tvManager.sesAc();
	tvManager.sesKapat();
	tvManager.uykuModu();
	tvManager.kanalDegistirKumanda();
	tvManager.sesAcKumanda();
	tvManager.sesKapatKumanda();

	sonicManager.oyunSec(sonicManager.Oyun);
	sonicManager.oyunBaslat(sonicManager.Oyun);
	sonicManager.oyunSonlandir(sonicManager.Oyun);
	sonicManager.oyunKaydet();

	marioManager.oyunSec(marioManager.Oyun);
	marioManager.oyunBaslat(marioManager.Oyun);
	marioManager.oyunSonlandir(marioManager.Oyun);
	marioManager.oyunKaydet();
    }
}
