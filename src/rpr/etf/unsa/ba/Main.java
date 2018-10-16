package rpr.etf.unsa.ba;

public class Main {

    public static void main(String[] args) {
    Student s= new Student("Mirna", "Kavcic", 17925);
    Predmet p= new Predmet("RPR", 12, 3);
    p.upisi(s);
    System.out.println(p);
    Student s1= new Student ("A", "Bc", 12365);
    p.upisi(s1);
    System.out.println(p);
    Student s2= new Student ("Sven", "Hrbenic", 19889);
    p.upisi(s2);
    System.out.println(p);
    Student s3= new Student ("Student", "Cetiri", 19829);
    Predmet p1= new Predmet("PLS", 13, 4);
    p1.upisi(s);
    p1.upisi(s1);
    p1.upisi(s2);
    p1.upisi(s3);
    System.out.println(p1);
    p.ispisi(s);
    p1.ispisi(s2);
    System.out.println(p);
    System.out.println(p1);
    }
}
