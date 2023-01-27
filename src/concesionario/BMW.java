package concesionario;
import java.util.Scanner;
    public class BMW extends Coche{
    
        Scanner sc = new Scanner(System.in);
        
        int peso;
                
        public BMW(int velocidad, double precio, String color, int peso){
        
            super(velocidad, precio, color);
            this.peso=peso;
        }
                
        @Override
        double cogerPrecioVenta(){
            
            System.out.println("Que precio tiene el cohe");
            precio = sc.nextInt();
                        
            if(peso > 2000){
                precio = (precio * 10) / 100;//El descuento
                System.out.println("El descuento es de " + precio);
            }else{
                precio = (precio * 20) / 100;//El descuento
                System.out.println("El descuento es de " + precio);                
            }
            
            return precio;            
        }       
}
