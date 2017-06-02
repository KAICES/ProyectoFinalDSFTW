/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.Scanner;

/**
 *
 * @author cesar.ramirez
 */
public class varillas {

	public static void main(String[] args) {
		
		int varilla;
		
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Ingrese tamaño de la varilla: ");
		varilla = datos.nextInt();
		
		System.out.print("Ingrese cantidad de datos: ");
		int cantidad = datos.nextInt();
		int[] longitudes = new int[cantidad];
		int[] precios = new int[cantidad];
		
		
		
		for (int i = 0; i < cantidad; i++)
	    {
			
			longitudes[i] = (i+1);
//			longitudes[i+cantidad] = longitudes[i];
			
			System.out.print("Ingrese Precio del corte "+(i+1)+": ");
			precios[i] = datos.nextInt();
//			precios[i+cantidad] = precios[i];
		
	    }
		
		//Creamos la matriz de devoluciones
	    int[][]  matriz_resultados = new int[longitudes.length][cantidad];

	    //Rellenamos la 1ª fila de ceros
	    for(int i = 0; i < varilla; i++){
	    	matriz_resultados[0][i] = i+1; 
	    }
	    //Rellenamos la 1ª columna de ceros
	    for(int i = 0; i < longitudes.length; i++){
	    	matriz_resultados[i][0] = 1;   
	    }
	    
	    for(int j = 1; j < longitudes.length ; j++){
	    	for(int c = 1; c < varilla; c++){
	    		if(c <  longitudes[j-1] ){
	    			matriz_resultados[j][c] = matriz_resultados[j-1][c]; 
	    		}else{
	    			if(matriz_resultados[j-1][c] > matriz_resultados[j-1][c-longitudes[j-1]]+ precios[j-1]){
	    				matriz_resultados[j][c] = matriz_resultados[j-1][c];
	    			}else{
	    				matriz_resultados[j][c] = matriz_resultados[j-1][c-longitudes[j-1]]+precios[j-1];
	    			}
	    		}
	    		//System.out.println(matriz_resultados[j][c]);
	    	}
	    }
           
        for (int i = 0; i < matriz_resultados.length; i++)
	    {
        	if(i<=varilla){
	        	for (int j = 0; j < matriz_resultados.length; j++)
	    	    {
	        		if(i==varilla && j==varilla){
	        			System.out.println();
	        			System.out.println("El precio maximo de una de las varillas es : "+matriz_resultados[j*j][i]);
	        		}
	        		
	    	    }
	    	}
	    }
        
        int i, j ; 
                       
           for (i=0;i < matriz_resultados.length; i ++ ){
                System.out.print("|");
               for(j=0; j < matriz_resultados[i].length; j ++ ) {                    
                    System.out.print( matriz_resultados[i][j]);
                    if (j!= matriz_resultados[i].length-1) 
                        System.out.print("\t") ;
                   
                    }
               System.out.println("|");
                }                           
            }
        
        
     }