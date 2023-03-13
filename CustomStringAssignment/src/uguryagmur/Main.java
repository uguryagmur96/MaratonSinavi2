package uguryagmur;

public class Main {
	
	public static void main(String[] args) {
		
		CustomString csString=new CustomString();
		
		System.out.println(csString.uzunluk());
		
		System.out.println(csString.belirtilenSiradakikiKarakteriDon(4));
		
		System.out.println(csString.belirtilenKarakterinIlkHangiSiradaGectiginiBul("Mar"));
		
		System.out.println(csString.belirtilenSiraNumaralarindakiKarakterVeyaKelimeyiYazdir(3, 6));
		
		System.out.println(csString.kelimedekiBosluklariSilme());
		
		System.out.println(csString.metinHarflerinHepsiniBuyukYaz());
		
		System.out.println(csString.metinHarflerinHepsiniKucukYaz());
		
		System.out.println(csString.metindekiHarfVeyaKelimeleriDegistir("o", "k"));
		
		System.out.println(csString.metninBelirtilenKarakterVeyaKelimeyleBasladiginiOgrenme("B"));
		
		System.out.println(csString.metninBelirtilenKarakterVeyaKelimeyleBittiginiOgrenme("i"));
		
		
	}

}
