package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Artikl a = new Artikl("biciklo", 500, "1");
        Artikl b = new Artikl("romobil", 350, "12");
        Artikl c = new Artikl("auto", 10000, "123");
        Korpa k = new Korpa();
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        k.dodajArtikl(c);
        Artikl[] artikli = {a, b, c};
        assertArrayEquals(artikli, k.getArtikli());
    }

    @Test
    void getArtikli() {
        Artikl a = new Artikl("biciklo", 500, "1");
        Artikl b = new Artikl("romobil", 350, "12");
        Artikl c = new Artikl("auto", 10000, "123");
        Korpa k = new Korpa();
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        k.dodajArtikl(c);
        Artikl[] artikli = {a, b, c};
        assertArrayEquals(artikli, k.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Artikl a = new Artikl("biciklo", 500, "1");
        Artikl b = new Artikl("romobil", 350, "12");
        Artikl c = new Artikl("auto", 10000, "123");
        Korpa k = new Korpa();
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        k.dodajArtikl(c);
        k.izbaciArtiklSaKodom("12");
        Artikl[] artikli = {a, c};
        assertArrayEquals(artikli, k.getArtikli());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Artikl a = new Artikl("biciklo", 500, "1");
        Artikl b = new Artikl("romobil", 350, "12");
        Artikl c = new Artikl("auto", 10000, "123");
        Korpa k = new Korpa();
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        k.dodajArtikl(c);
        assertEquals(10850, k.dajUkupnuCijenuArtikala());
    }
}