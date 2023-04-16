public class AracTalebi {

    String marka;
    String model;
    String yakitTipi;
    String vites;
    int gunlukUcret;

    AracTalebi(){

    }
    public AracTalebi(String marka, String model, String yakitTipi, String vites, int gunlukUcret) {
        this.marka = marka;
        this.model = model;
        this.yakitTipi = yakitTipi;
        this.vites = vites;
        this.gunlukUcret = gunlukUcret;
    }

    String alinaacakSehir;
    String alinacakGun;
    String teslimSaati;
    String alisSaati;
    String teslimGunu;
    String teslimEdilecekSehir;

    public AracTalebi(String alinaacakSehir, String teslimEdilecekSehir,String alinacakGun, String teslimSaati, String alisSaati, String teslimGunu) {
        this.alinaacakSehir = alinaacakSehir;
        this.teslimEdilecekSehir=teslimEdilecekSehir;
        this.alinacakGun = alinacakGun;
        this.teslimSaati = teslimSaati;
        this.alisSaati = alisSaati;
        this.teslimGunu = teslimGunu;
    }

    @Override
    public String toString() {
        return
                "marka=" + marka +
                        "model=" + model +
                        "yakitTipi=" + yakitTipi  +
                        "vites=" + vites  +
                        "gunlukUcret=" + gunlukUcret;
    }
}