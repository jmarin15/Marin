package concesionario;
import java.util.Scanner;
    public class FORD extends Coche{
        
        Scanner sc = new Scanner(System.in);    
        
        int anio;
        int descuentoFactura;
        
        public FORD(int velocidad, double precio, String color, int anio, int descuentoFactura){
        
            super(velocidad, precio, color);
            this.anio = anio;
            this.descuentoFactura = descuentoFactura;
        
        }
        
        
        @Override
        double cogerPrecioVenta(){
            
            System.out.println("Que descuento hay que aplicarle");
            descuentoFactura = sc.nextInt();
            
            System.out.println("Precio del coche");
            precio = sc.nextInt();
            
            precio = precio - descuentoFactura;
            System.out.println("Precio final " + precio);
             
            return precio;            
        }
}
