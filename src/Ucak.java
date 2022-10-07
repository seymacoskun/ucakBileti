import java.util.Scanner;

public class Ucak {
	public static void main(String[] args) {
		int mesafe, yas, secim;
		double perKM = 0.10, toplamFiyat = 0, indirimTutari, sonIndirim, indirimliFiyat;
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Mesafeyi km cinsinden giriniz: ");
		mesafe = inp.nextInt();
		
		if(mesafe < 0) {
			System.out.println("Hatalý deger girdiniz");
			System.exit(0);
		}
		
		System.out.println("Yasinizi giriniz: ");
		yas = inp.nextInt();
		
		if(yas < 0) {
			System.out.println("Hatali deger girdiniz");
			System.exit(0);
		}
		
		System.out.println("-------------");
		toplamFiyat = mesafe*perKM;
		System.out.println("Indirimsiz tutariniz: " +toplamFiyat);
		
		if(yas < 12) {
			indirimTutari = toplamFiyat*0.5;
			System.out.println("(0-12 yas) Indirim tutari: " +indirimTutari);
			indirimliFiyat = toplamFiyat - indirimTutari;
			System.out.println("Indirimli fiyat: " +indirimliFiyat);
			System.out.println("------------");
		}
		
		if(yas >= 12 && yas <= 24) {
			indirimTutari = toplamFiyat * 0.1;
			System.out.println("(12-24 yaþ) Indirim tutari: " +indirimTutari);
			indirimliFiyat = toplamFiyat - indirimTutari;
			System.out.println("Indirimli fiyat: " +indirimliFiyat);
			System.out.println("-----------");
		}
		
		if(yas >= 65) {
			indirimTutari = toplamFiyat * 0.3;
			System.out.println("Indirim tutari: " +indirimTutari);
			indirimliFiyat = toplamFiyat - indirimTutari;
			System.out.println("Indirimli fiyat: " +indirimliFiyat);
			System.out.println("------------");
		}
		
		System.out.println("*** BILET SATIN ALIMI ***");
		System.out.println("** 1 - Tek Yon **");
		System.out.println("** 2 - Gidis Donus **");
		System.out.println("Almak istediginiz bilet turunu seciniz");
		secim = inp.nextInt();
		
		switch(secim) 
		{
		case 1:
			System.out.println("----------------");
			indirimTutari = toplamFiyat * 1;
			indirimliFiyat = toplamFiyat - indirimTutari;
			System.out.println("Toplam odemeniz gereken miktar: " +indirimliFiyat);
			break;
		case 2:
			indirimTutari = toplamFiyat * 0.2;
			sonIndirim = toplamFiyat - indirimTutari;
			System.out.println("Toplam odemeniz gereken miktar: " +sonIndirim);
		}
	}

}
