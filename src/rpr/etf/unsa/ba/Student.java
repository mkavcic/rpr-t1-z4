package rpr.etf.unsa.ba;

public class Student {
    private String ime, prezime;
    private int br_indexa;
    public Student(String ime, String prezime, int br_indexa){
        this.ime=ime;
        this.prezime=prezime;
        this.br_indexa=br_indexa;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojIndexa() {
        return br_indexa;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setBrojIndexa(int br_indexa) {
        this.br_indexa = br_indexa;
    }
    public String toString() {
        System.out.println(ime + " " + prezime + " " + "(" + br_indexa + ")");
        return "";
    }
    public Student izbrisiStudenta(){
        return null;
    }
}
