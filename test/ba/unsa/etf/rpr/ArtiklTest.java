package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    private Artikl artikl;

    @BeforeEach
    void setUp() {
        artikl = new Artikl("auto", 15000, "1234");
    }

    @Test
    void getNaziv() {
       assertEquals(artikl.getNaziv(),"auto");
    }

    @Test
    void getCijena() {
        assertEquals(artikl.getCijena(),15000);
    }

    @Test
    void getKod() {
        assertEquals(artikl.getKod(),"1234");
    }
}