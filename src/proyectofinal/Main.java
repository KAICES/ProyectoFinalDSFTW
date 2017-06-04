package proyectofinal;
import java.util.Scanner;


/**
 *
 * @author KAICES
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    
    static int select = -1;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        //opción elegida del usuario
        //Mientras la opción elegida sea 0, preguntamos al usuario
        
       
        
		while(select != 0){
			//Try catch para evitar que el programa termine si hay un error
			try{
				System.out.println("(｡◕‿◕｡) ***PROYECTO FINAL DISEÑO DE SOFTWARE***(｡◕‿◕｡)  \n"+
                                                   "Elige una opción:\n"+
                                                "1.- Ecuación polinómica por biseccion (Dividir y vencer)\n" +
						"2.- Problema de las varillas (Programción Dinamica)\n" +
						"3.- Solitarion de mesa Continental(Vuelta atrás)\n" +
						"0.- Salir");
				//Recoger una variable por consola
				select = Integer.parseInt(scanner.nextLine()); 
	
				//Ejemplo de switch case en Java
				switch(select){
				case 1: 
					        
                                            Scanner leer = new Scanner(System.in);	

                                            double a , b ;

                                            System.out.println("Numero del extremo izquierdo : ");
                                            a = leer.nextInt();
                                            System.out.println("Numero del extremo derecho : ");
                                            b = leer.nextInt();

                                            DividirVencer dvc = new DividirVencer(a,b);
                                            dvc.biseccion();
                                            
                                            
                                            break;
                                            
				case 2: 
                                    
                                            Scanner datos = new Scanner(System.in);	
                                            int varilla, cantidad ;

                                            System.out.print("Ingrese tamaño de la varilla: ");
                                            varilla = datos.nextInt();
                                            System.out.print("Ingrese cantidad de datos: ");
                                            cantidad = datos.nextInt();

                                            varillas var = new varillas(varilla,cantidad);
                                            var.dinamica();
					
					break;
				case 3: 
					//***///
					break;
				
				case 0: 
					System.out.println("Adios!");
					break;
				default:
					System.out.println("Número no reconocido");break;
				}
				
				System.out.println("\n"); //Mostrar un salto de línea en Java
				
			}catch(Exception e){
				System.out.println(" Error!");
			}
		}

	}
    }
        

    

