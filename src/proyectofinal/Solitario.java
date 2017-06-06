/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author KAICES
 */
public class Solitario {
    
 int m = 31; //(* numero maximo de movimientos *)
 int n = 7; //(* tamano del tablero *)
String ESTADO = ""; //(libre,ocupada,novalida);(* tipo de casilla *)
 int TABLERO [][] ; // OF ESTADO;
  int  x,y ; // (* coordenadas *)
 String SALTO = "" ;// origen,destino,comido:PAR END;
 int SOLUCION [1] ;// OF SALTO;
public int Continental(int k:CARDINAL;VAR t:TABLERO,boolean encontrado:BOOLEAN;VAR sol:SOLUCION){
    

 VAR i,j:CARDINAL;

 if ( Fin(k,t) THEN encontrado:=TRUE
 ELSE
 for( i=1;i< n; i++)
    for( j=1;j< n; j++)
        if (i,j,1,t=encontrado) 
        
        THEN(* a la izquierda *)
 INC(k);
 sol[k].origen.x:=i;
 sol[k].origen.y:=j;
 sol[k].destino.x:=i;
 sol[k].destino.y:=j-2;
 sol[k].comido.x:=i;
 sol[k].comido.y:=j-1;
 NuevaTabla(t,i,j,1); (* actualiza el tablero *)
 Continental(k,t,encontrado,sol)
 END;
 IF Valido(i,j,2,t,encontrado) THEN (* hacia arriba *) 
VUELTA ATRÁS 241
 INC(k);
 sol[k].origen.x:=i;
 sol[k].origen.y:=j;
 sol[k].destino.x:=i-2;
 sol[k].destino.y:=j;
 sol[k].comido.x:=i-1;
 sol[k].comido.y:=j;
 NuevaTabla(t,i,j,2);(* actualiza el tablero *)
 Continental(k,t,encontrado,sol)
 END;
 IF Valido(i,j,3,t,encontrado) THEN (* a la derecha *)
 INC(k);
 sol[k].origen.x:=i;
 sol[k].origen.y:=j;
 sol[k].destino.x:=i;
 sol[k].destino.y:=j+2;
 sol[k].comido.x:=i;
 sol[k].comido.y:=j+1;
 NuevaTabla(t,i,j,3);(* actualiza el tablero *)
 Continental(k,t,encontrado,sol)
 END;
 IF Valido(i,j,4,t,encontrado) THEN (* hacia abajo *)
 INC(k);
 sol[k].origen.x:=i;
 sol[k].origen.y:=j;
 sol[k].destino.x:=i+2;
 sol[k].destino.y:=j;
 sol[k].comido.x:=i+1;
 sol[k].comido.y:=j;
 NuevaTabla(t,i,j,4);(* actualiza el tablero *)
 Continental(k,t,encontrado,sol)
 END;
 END
 END;
 IF NOT encontrado THEN (* cancelar anotacion *)
 RestaurarTabla(t,k,sol);
 AnularSalida(sol,k);
 DEC(k)
 END
 END
END Continental; 
    
}  
}
