package rpr.etf.unsa.ba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testKonstruktoraSaIspisom() {
        Student s = new Student("Mirna", "Kavcic", 17925);
        assertEquals("Kavcic Mirna (17925)", s.toString());
    }

    @Test
    void getIme() {
        Student s = new Student("Mirna", "Kavcic", 17925);
        assertEquals("Mirna", s.getIme());
    }

    @Test
    void getPrezime() {
        Student s = new Student("Mirna", "Kavcic", 17925);
        assertEquals("Kavcic", s.getPrezime());
    }

    @Test
    void getBrojIndexa() {
        Student s = new Student("Mirna", "Kavcic", 17925);
        assertEquals(17925, s.getBrojIndexa());
    }

    @Test
    void setIme() {
        Student s = new Student("", "Kavcic", 17925);
        s.setIme("Mirna");
        assertEquals("Mirna", s.getIme());
    }

    @Test
    void setPrezime() {
        Student s = new Student("Mirna", "", 17925);
        s.setPrezime("Kavcic");
        assertEquals("Kavcic", s.getPrezime());
    }

    @Test
    void setBrojIndexa() {
        Student s = new Student("Mirna", "Kavcic", 0);
        s.setBrojIndexa(17925);
        assertEquals(17925, s.getBrojIndexa());
    }
}
