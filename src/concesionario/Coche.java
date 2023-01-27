package concesionario;
import java.util.Scanner;
    public class Coche {

        Scanner sc = new Scanner(System.in);
        
        int velocidad;
        double precio;
        String color;
        
        public Coche(int velocidad, double precio, String color){
        
            this.color=color;
            this.precio=precio;
            this.velocidad=velocidad;
            
        }
        
        double cogerPrecioVenta(){
            
            return precio;
            
        }
}    
