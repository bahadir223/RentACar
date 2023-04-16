import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusteriAracBilgileri extends AracTalebi{

    List<AracTalebi> aracList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    long odenecekToplamGun;
    long toplamUcret;
    public void aracTalep(){

        AracTalebi araba = new AracTalebi();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen teslim alacaginiz sehri giriniz");
        araba.alinaacakSehir = scan.next();
        System.out.println("Lutfen edilecek sehri giriniz");
        araba.teslimEdilecekSehir = scan.next();
        System.out.println("Lutfen alinacak gunu giriniz (yyyy-MM-dd): ");
        araba.alinacakGun = scan.next();
        System.out.println("Lutfen teslim gunu giriniz (yyyy-MM-dd): ");
        araba.teslimGunu = scan.next();

        System.out.println("Lutfen alinacak saati giriniz");
        araba.alisSaati = scan.next();
        System.out.println("Lutfen teslim saatini giriniz");
        araba.teslimSaati = scan.next();

        // Kullanıcıdan alınan tarihler

        LocalDate alinacakTarih = LocalDate.parse(araba.alinacakGun);
        LocalDate teslimTarihi = LocalDate.parse(araba.teslimGunu);

        // Tarihler arasındaki farkı bulma
        odenecekToplamGun = ChronoUnit.DAYS.between(alinacakTarih, teslimTarihi);

        if(odenecekToplamGun<0){
            System.out.println("Teslim tarihi alis tarihinden once olamaz.Lutfen Tekrar Deneyiniz");
            aracTalep();
        }
        // Farkı ekrana yazdırma
        System.out.println("Tarihler arasındaki fark: " + odenecekToplamGun + " gün");

        AracTalebi arac1 = new AracTalebi("Mercedes","c180","Dizel","manuel",500);
        AracTalebi arac2 = new AracTalebi("Audi","A8","Dizel","manuel",700);
        AracTalebi arac3 = new AracTalebi("Bmw","5.20","Benzin","manuel",800);
        AracTalebi arac4 = new AracTalebi("Opel","c180","Dizel","manuel",1000);

        aracList.add(arac1);
        aracList.add(arac2);
        aracList.add(arac3);
        aracList.add(arac4);

        int counter=1;

        for (AracTalebi arac : aracList) {
            System.out.println(counter+".arac   "+arac);
            counter++;

        }
        getAraba();

    }

    public void getAraba() {

        System.out.println("Lutfen secmek istediginiz arac nosunu giriniz");
        int secim = scan.nextInt();
        toplamUcret = aracList.get(secim-1).gunlukUcret * odenecekToplamGun;
        System.out.println(toplamUcret);
        System.out.println("Arabayi kiralamak istiyor musunuz?(Evet ya da Hayir)");
        String onay=scan.next().toLowerCase();
        if(onay.equals("hayir")){
            System.out.println("Iyi gunler");
        }

        musteriBilgileri();


    }
    protected void musteriBilgileri(){


        System.out.println("Lutfen Adinizi Giriniz: ");
        String name=scan.next();
        System.out.println("Lutfen Adinizi Giriniz: ");
        String lastname= scan.next();
        System.out.println("Lutfen ID'inizi Giriniz: ");
        int id=scan.nextInt();
        System.out.println("Lutfen Yasinizi Giriniz: ");
        int age = scan.nextInt();
        System.out.println("Lutfen Telefon Numaranizi Giriniz: ");
        int phone = scan.nextInt();
        odemeBilgileri();


    }

    protected void odemeBilgileri(){
        System.out.println("*****Odeme Ekrani***** \n Odemeniz gereken tutar = " +
                toplamUcret);
        System.out.println("Kart No giriniz");
        String kartNo = scan.next();
        if (kartNo.length() != 16) {
            System.out.println("Hatali giris yaptiniz");
            odemeBilgileri();
        }
        System.out.println("Odemeniz basari ile gerceklesti");
    }

}