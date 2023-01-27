package concesionario;
import java.util.Scanner;
    public class SEDAN extends Coche{
        
        Scanner sc = new Scanner(System.in);
        
        int largo;
        
        
        public SEDAN(int velocidad, double precio, String color, int largo){
        
            super(velocidad, precio, color);
            this.largo = largo;
        
        }
               
        @Override
        double cogerPrecioVenta(){
            
            System.out.println("Cuanto mide de largo el coche");
            largo = sc.nextInt();          
                        
            if(largo > 20){
                precio = precio * 5 / 100;//El descuento
                System.out.println("El descuento es de " + precio);
            }else{
                precio = precio * 10 / 100;//El descuento
                System.out.println("El descuento es de " + precio);                
            }
            
            return precio;            
        }
}
