package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    ArrayList<Artikl> listaArtikalaUSupermarketu = new ArrayList<Artikl>(1000);

    public Artikl[] getArtikli() {
        Artikl[] artikli = new Artikl[50];
        int i = 0;
        for(Artikl a : listaArtikalaUSupermarketu) {
            artikli[i] = a;
            i = i + 1;
        }
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (Artikl a : listaArtikalaUSupermarketu) {
            if (a!=null && a.getKod().equals(kod)) {
                listaArtikalaUSupermarketu.remove(a);
                return a;
            }
        }
        return null;
    }

    public void dodajArtikl(Artikl a) {
        if (listaArtikalaUSupermarketu.size()<1000) {
            listaArtikalaUSupermarketu.add(a);
        }
    }
}
