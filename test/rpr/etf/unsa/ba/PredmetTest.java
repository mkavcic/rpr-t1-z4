package rpr.etf.unsa.ba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void testKonstruktora() {
        Predmet p = new Predmet ("RPR", 999, 9);
        assertAll ("konstruktor",
                () -> assertEquals("RPR", p.getNazivPredmeta()),
                () -> assertEquals(999, p.getSifraPredmeta()),
                () -> assertEquals(9, p.getMaxBrojStudenata())
        );
    }
    @Test
    void upisi() {
        Predmet p = new Predmet ("RPR", 999, 9);
        Student s = new Student ("Mirna", "Kavcic", 17901);
        p.upisi(s);
        assertEquals("1. Kavcic Mirna (17925)", p.toString());
        Student S = new Student ("A", "B", 17000);
        p.upisi(S);
        assertEquals("1. Kavcic Mirna (17925)\n2. B A (17000)", p.toString());
    }

    @Test
    void ispisi() {
        Predmet p = new Predmet ("RPR", 999, 9);
        Student s = new Student ("Mirna", "Kavcic", 17925);
        p.upisi(s);
        p.ispisi(s);
        assertEquals("", p.toString());
        p.upisi(s);
        Student S = new Student ("A", "B", 18000);
        p.upisi(S);
        p.ispisi(s);
        assertEquals("1. B A (17000)", p.toString());
    }

    @Test
    void setNazivPredmeta() {
        Predmet p = new Predmet ("", 18, 5);
        p.setNazivPredmeta("RPR");
        assertEquals("RPR", p.getNazivPredmeta());
    }

    @Test
    void setSifraPredmeta() {
        Predmet p = new Predmet ("RPR", 89, 9);
        p.setSifraPredmeta(9);
        assertEquals(9, p.getSifraPredmeta());
    }

    @Test
    void getNazivPredmeta() {
        Predmet p = new Predmet ("RPR", 9, 9);
        assertEquals("RPR", p.getNazivPredmeta());
    }

    @Test
    void getSifraPredmeta() {
        Predmet p = new Predmet ("RPR", 9, 9);
        assertEquals(9, p.getSifraPredmeta());
    }

    @Test
    void getMaxBrojStudenata() {
        Predmet p = new Predmet ("RPR", 9, 9);
        assertEquals(9, p.getMaxBrojStudenata());
    }
}
