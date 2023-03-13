package uguryagmur;

public class Main {

	public static void main(String[] args) {	
		Yolcu yolcu = new EcoYolcu(15, "Kürşat", "Pisi");	
		Yolcu yolcu2 = new BusinessYolcu(123, "Hamur", "Kuçu", false);	
		
		System.out.println("***Business Yolcu VIP***");
		yolcu.biletAl(EfirmaAdi.ADJ);
		yolcu.biletAl(EfirmaAdi.THY);
		System.out.println("***");
		yolcu.ucagaBin();
		yolcu.checkinYap();
		yolcu.checkinYap();
		yolcu.ucagaBin();
		yolcu.yolcuBilgileri();
		
		System.out.println("***Ekonomi Yolcu***");
		yolcu2.biletAl(EfirmaAdi.ADJ);
		yolcu2.biletAl(EfirmaAdi.THY);
		yolcu2.biletAl(EfirmaAdi.THY);
		yolcu2.biletAl(EfirmaAdi.THY);
		System.out.println("***");
		yolcu2.ucagaBin();
		yolcu2.checkinYap();
		yolcu2.checkinYap();
		yolcu2.ucagaBin();
		yolcu2.yolcuBilgileri();

	}

}
