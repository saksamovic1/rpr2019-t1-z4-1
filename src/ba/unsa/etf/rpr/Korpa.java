package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    ArrayList<Artikl> listaArtikalaUKorpi = new ArrayList<>(50);

    public boolean dodajArtikl(Artikl a) {
        if (listaArtikalaUKorpi.size()<50) {
            listaArtikalaUKorpi.add(a);
            return true;
        }
        return false;
    }

    public Artikl[] getArtikli() {
        Artikl[] artikli = new Artikl[50];
        int i = 0;
        for(Artikl a : listaArtikalaUKorpi) {
            artikli[i] = a;
            i = i + 1;
        }
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (Artikl a : listaArtikalaUKorpi) {
            if (a!=null && a.getKod().equals(kod)) {
                listaArtikalaUKorpi.remove(a);
                return a;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijenaArtikala = 0;
        for (Artikl a : listaArtikalaUKorpi) {
            ukupnaCijenaArtikala = ukupnaCijenaArtikala + a.getCijena();
        }
        return ukupnaCijenaArtikala;
    }
}
