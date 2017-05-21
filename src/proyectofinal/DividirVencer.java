package proyectofinal;


import javax.swing.*;
import java.math.*;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author KAICES
 */
public class DividirVencer {
    
        
    private double a ;
    private double b ;

 



    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    public DividirVencer(double a, double b) {
        this.a = a;
        this.b = b;
               

        
        
    }
     
    public double [] biseccion ( ) {
    


////************* INGRESO DE LOS COEFICIENTES***********************////
    Scanner leer = new Scanner(System.in);    
    int cantCoeficientes  ;
    System.out.print("Cuantos coeficientes quiere ingresar ? : ");
    cantCoeficientes = leer.nextInt();  
    
    double[]coeficientes =new double [cantCoeficientes];
    
        for (int i = 0; i < coeficientes.length ; i++){    
        System.out.print("Digite el numero a ingresar \n");
        coeficientes[i] =leer.nextDouble();
        }
        
        System.out.println("Coeficientes de la funcion polinomica"); 
        for (int j = 0; j < coeficientes.length ; j++){    
            System.out.print(coeficientes[j]+"  ");
            
        }
        
     double[]coeficientesA =new double [cantCoeficientes];
     for (int k = 0; k < coeficientesA.length ; k++){    
        coeficientesA[k] =coeficientes[k];
        }
     
     double[]coeficientesB =new double [cantCoeficientes];
     for (int l = 0; l < coeficientesA.length ; l++){    
        coeficientesB[l] =coeficientes[l];
        }
     
////************* OPERACION DE LA FUNCION POLINOMICA PARA SACAR LA BISECCION***********************////       
        

        int nveces ;
        System.out.println("cuantas veces necesita ver la biseccion?");
        nveces = leer.nextInt();

        double fA = a ;
        double fB = b ;
        int veces = 0 ;
        double pA = cantCoeficientes;
        double pB = cantCoeficientes;
        
        while ( nveces != veces ) {
            
            double acumA = 0;       
            for ( int n = 0; n <= fA ; n++ ){
                acumA = coeficientesA[n] * Math.pow(a,pA)+acumA;
                pA--;
            }

            System.out.print( " \n Extremo derecho n "+veces+" : " + acumA + "\n" );


            double acumB = 0;      
            for ( int n = 0; n <= fB ; n++ ){
                acumB = coeficientesA[n] * Math.pow(a,pB)+acumB;
                pB--;
            }

            System.out.print( " \n Extremo izquierdo n "+veces+" : " + acumB +"\n");

            double c ;

            c = (acumA+acumB)/2;
            System.out.print( " \n Punto medio n "+veces+" : " + c + "\n");
            

            if( acumA > 0 && c > 0 ) {

                pB = c ;

            }
            else {
                pA = c ;
            }

            veces++;
        
        }
        return coeficientes;    
    }
}
