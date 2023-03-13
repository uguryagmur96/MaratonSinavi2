package uguryagmur;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EcoYolcu extends Yolcu {
	Random rand =new Random();

	private Map<String,Integer>biletlerEco;
	private final int EKONOMI_FIYAT=100;
	
	
	
	
	public EcoYolcu(int id, String ad, String soyAd) {
		super(id, ad, soyAd);
		biletlerEco=new HashMap<>();
		
	}




	@Override
	public void checkinYap() {
		if(!isCheckin()) {
			setCheckin(true);
			System.out.println("Check in yapılmıştır. İyi uçuşlar!");
		} else {
			System.out.println("Check in daha öncesinde yapılmış. Uçağa binebilirsiniz.");
		}
		
	}




	@Override
	public void ucagaBin() {
		if (isCheckin()) {
			System.out.println(getKoltukNo() + " numaralı koltuğa geçiniz lütfen!");
		} else {
			System.out.println("Öncelikle check in işleminizi yapmanız gerekmektedir");
		}
		
	}




	@Override
	public void biletAl(EfirmaAdi eFirmaAdi) {
		int fiyat=EKONOMI_FIYAT+getBASE_FIYAT();
		if(biletlerEco.containsKey(eFirmaAdi.toString())) {
			biletlerEco.put(eFirmaAdi.toString(), biletlerEco.get(eFirmaAdi.toString()+fiyat));
			System.out.println(getAd() + " adlı yolcu " + eFirmaAdi.toString() + " firmasından bilet satın aldınız");
		} else {
			biletlerEco.put(eFirmaAdi.toString(), fiyat);
			System.out.println(getAd() + " adlı yolcu " + eFirmaAdi.toString() + " firmasından bilet satın aldınız");
		}
		int sayi =rand.nextInt(1,176);
		setKoltukNo(biletNumaralari.get(sayi));
		biletNumaralari.remove(sayi);
		
	}




	@Override
	public void yolcuBilgileri() {
		System.out.println("Bilgiler: "  + getAd() + "Bilet: " + biletlerEco);
		
	}

}
