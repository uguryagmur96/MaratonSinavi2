package uguryagmur;

public class CustomString {
	
	private String word;

	public CustomString() {
		
		this.word = "BoostMaratonSinavi";
	}
	
	public int uzunluk() {
		int toplam=this.word.length();
		
		return toplam;
	}
	
	public char belirtilenSiradakikiKarakteriDon(int index) {
		char letter=this.word.charAt(index);
		
		return letter;
	}
	
	public int belirtilenKarakterinIlkHangiSiradaGectiginiBul(String word) {
		
		int n=this.word.indexOf(word);
		
		return n;
		
	}
	
	public String belirtilenSiraNumaralarindakiKarakterVeyaKelimeyiYazdir(int n,int m) {
		String word=this.word.substring(n,m);
		
		return word;
	}
	
	public String kelimedekiBosluklariSilme() {
		
	String word=this.word.trim();
		
		return word;
	}
	
	public String metinHarflerinHepsiniBuyukYaz() {
		String word=this.word.toUpperCase();
		return word;
	}
	
	public String metinHarflerinHepsiniKucukYaz() {
		String word=this.word.toLowerCase();
		return word;
	}
	
	public String metindekiHarfVeyaKelimeleriDegistir(String o,String n) {
		String word=this.word.replace(o,n );
		
		return word;
	}
	
	public boolean metninBelirtilenKarakterVeyaKelimeyleBasladiginiOgrenme(String s) {
		
		return this.word.startsWith(s);
	}
	
public boolean metninBelirtilenKarakterVeyaKelimeyleBittiginiOgrenme(String s) {
		
		return this.word.endsWith(s);
	}
	
	
	
	
	
	
	
	
	
	
	

}
