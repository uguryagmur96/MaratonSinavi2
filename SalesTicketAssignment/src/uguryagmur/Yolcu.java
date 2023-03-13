package uguryagmur;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Yolcu {
	
	private int id;
	private String ad;
	private String soyAd;
	private int koltukNo;
	private boolean checkin;
	private final int BASE_FIYAT=100;
	
	static List<Integer> biletNumaralari=new ArrayList<>();
	
	
	public Yolcu(int id, String ad, String soyAd) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyAd = soyAd;
		biletleriListeyeEkle();
	}
	
	public abstract void checkinYap();
	public abstract void ucagaBin();
	public abstract void biletAl(EfirmaAdi eFirmaAdi);
	public abstract void yolcuBilgileri();
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyAd() {
		return soyAd;
	}


	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}


	public int getKoltukNo() {
		return koltukNo;
	}


	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}


	public boolean isCheckin() {
		return checkin;
	}


	public void setCheckin(boolean checkin) {
		this.checkin = checkin;
	}

	public static List<Integer> getBiletNumaralari() {
		return biletNumaralari;
	}

	public static void setBiletNumaralari(List<Integer> biletNumaralari) {
		Yolcu.biletNumaralari = biletNumaralari;
	}
	
	
	
	public int getBASE_FIYAT() {
		return BASE_FIYAT;
	}

	private static void biletleriListeyeEkle() {
		for (int i = 1; i < 176; i++) {
			biletNumaralari.add(i);
	}


	}


	
	
	
	
	
	
	}

