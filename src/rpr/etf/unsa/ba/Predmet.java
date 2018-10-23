package rpr.etf.unsa.ba;

public class Predmet {
    Student[] niz;
    String naziv_predmeta;
    int sifra_premdeta, max_br;

    public void upisi(Student s){
        for(int i=0; i<max_br; i++){
            if(niz[i]==null){
                niz[i]=s;
                break;
            }
        }
    }
    public void ispisi(Student s){
        for(int i=0; i<max_br; i++){
            if(niz[i].equals(s)){
                niz[i]=null;
                break;
            }
        }
    }

    public String getNazivPredmeta() {
        return naziv_predmeta;
    }

    public int getSifraPredmeta() {
        return sifra_premdeta;
    }

    public int getMaxBrojStudenata() {
        return max_br;
    }

    public void setNazivPredmeta(String naziv_predmeta) {
        this.naziv_predmeta = naziv_predmeta;
    }

    public void setSifraPredmeta(int sifra_premdeta) {
        this.sifra_premdeta = sifra_premdeta;
    }

    public Predmet(String naziv_predmeta, int sifra_premdeta, int max_br) {
        this.naziv_predmeta = naziv_predmeta;
        this.sifra_premdeta = sifra_premdeta;
        this.max_br = max_br;
        niz=new Student[max_br];
    }
    public String toString(){
        int brojac=0;
        for(int i=0; i<max_br; i++){
            if(niz[i]!=null) brojac++;
        }
        int j = 0;
        for(int i=0; i<max_br; i++) {
            if (niz[i] != null) {
                System.out.print(j + 1);
                System.out.print(". ");
                System.out.print(niz[i]);
                j++;
            }
        }
        System.out.println("");
        return "";
    }
    public Predmet izbrisiPredmet(){
        return null;
    }
}
