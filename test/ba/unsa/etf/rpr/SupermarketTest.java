package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void getArtikli() {
        Artikl a = new Artikl("biciklo", 500, "1");
        Artikl b = new Artikl("romobil", 350, "12");
        Artikl c = new Artikl("auto", 10000, "123");
        Supermarket s = new Supermarket();
        s.dodajArtikl(a);
        s.dodajArtikl(b);
        s.dodajArtikl(c);
        Artikl[] artikli = {a, b, c};
        assertArrayEquals(artikli, s.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Artikl a = new Artikl("biciklo", 500, "1");
        Artikl b = new Artikl("romobil", 350, "12");
        Artikl c = new Artikl("auto", 10000, "123");
        Supermarket s = new Supermarket();
        s.dodajArtikl(a);
        s.dodajArtikl(b);
        s.dodajArtikl(c);
        s.izbaciArtiklSaKodom("12");
        Artikl[] artikli = {a, c};
        assertArrayEquals(artikli, s.getArtikli());
    }

    @Test
    void dodajArtikl() {
        Artikl a = new Artikl("biciklo", 500, "1");
        Artikl b = new Artikl("romobil", 350, "12");
        Artikl c = new Artikl("auto", 10000, "123");
        Supermarket s = new Supermarket();
        s.dodajArtikl(a);
        s.dodajArtikl(b);
        s.dodajArtikl(c);
        Artikl[] artikli = {a, b, c};
        assertArrayEquals(artikli, s.getArtikli());

    }
}