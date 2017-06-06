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

     private int varilla;
     private int cantidad ;

    public varillas(int varilla, int cantidad) {
        this.varilla = varilla;
        this.cantidad = cantidad;
       
    }

    public int getVarilla() {
        return varilla;
    }

    public void setVarilla(int varilla) {
        this.varilla = varilla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    		
    public int [][] dinamica () {

        
		int[] longitudes = new int[cantidad];
		int[] precios = new int[cantidad];
		
		Scanner datos = new Scanner(System.in);	
		
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

	    //Rellenamos la 1ª fila de longitudes de varilla
	    for(int i = 0; i < varilla; i++){
	    	matriz_resultados[0][i] = i+1; 
	    }
	    //Rellenamos la 1ª columna de unos
	    for(int i = 0; i < longitudes.length; i++){
	    	matriz_resultados[i][0] = 1;   
	    }
	    
	    for(int f = 1; f < longitudes.length ; f++){
	    	for(int c = 1; c < varilla; c++){
                    
                    if(c > matriz_resultados [c][f] ){
                        matriz_resultados[f][c] = matriz_resultados[c-1][f]+1; 
                    }    
                    if ( c < matriz_resultados [c][f-1] ){
                        matriz_resultados[f][c] =  matriz_resultados[c][f-1];
                    }                    
                    if ( c == f ){
                        matriz_resultados[f][c] = precios[c];
                        
                    }                    
                   
//                    else if(c > matriz_resultados [c][f] ){
//                         matriz_resultados[f][c] = matriz_resultados[c-1][f]+1;                     
//                    }

	    	
	    
           
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
           
           
           for (int l = 0; l <= matriz_resultados.length; l++)
	    {
        	if(l<=varilla){
	        	for (int m = 0; m <=matriz_resultados.length; m++)
	    	    {
	        		if(l==varilla && m==varilla){
	        			System.out.println();
	        			System.out.println("El precio maximo de una de las varillas es : "+matriz_resultados[m-1][l-1]+" de un largo "+ l +" y un corte " + m);
	        		
	        		
	    	    }
	    	}
	    }
           
            }
           
        
            

        
        }  
             return matriz_resultados;
}
}

