package concesionario;
public class Concesionario {
    public static void main(String[] args) {
        // Concesionario
        
        BMW W = new BMW(100, 10000, "rojo", 52417);
        
        W.cogerPrecioVenta();
                
        
        FORD F = new FORD(100, 10000, "rojo", 1998, 369);
        
        F.cogerPrecioVenta();
        
        
        SEDAN S = new SEDAN(100, 10000, "rojo", 15);
        
        S.cogerPrecioVenta();
        
        
    }    
}
