package oopgyak1;


public class Monitor {
    int hz;
    String  marka;
    boolean allapot; 
    
    public void mukodes(){
        System.out.printf("Monitor állapota: %s",allapot ? "bekapcsolva" : "kikapcsolva");
    }
}
