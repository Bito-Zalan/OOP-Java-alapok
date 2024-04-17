package oopgyak1;


public class OOPGyak1 {

    
    public static void main(String[] args) {
        Monitor elso = new Monitor();
        elso.hz = 60;
        elso.marka = "AOC";
        elso.allapot = true;
        
        Monitor masodik = new Monitor();
        masodik.hz = 140;
        masodik.marka = "Samsung";
        masodik.allapot = false;
        
        Monitor harmadik = new Monitor();
        harmadik.hz = 160;
        harmadik.marka = "ASUS";
        harmadik.allapot = false;
        
        masodik.mukodes();
       
    }

    
    
}
