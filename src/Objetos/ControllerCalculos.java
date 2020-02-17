/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;
import Objetos.Operaciones;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ROOT
 */
public class ControllerCalculos {
   private static Operaciones OperacionActual;
   private static List<Operaciones>listaOperacion
           =new ArrayList<>();
   
   public static void agregarOperacionLista(Operaciones operaciones){
       listaOperacion.add(operaciones);
   }
     public static Object[][] getListaOperacionComoArreglo(){
         Object arreglo[][]=new Object[listaOperacion.size()][3];
         
         int indice=0;
         
         
         for (Operaciones operacionesTmp : listaOperacion) {
             arreglo[indice][0]=operacionesTmp.getOperacion();
             arreglo[indice][1]=operacionesTmp.getResultado();
             arreglo[indice][2]=operacionesTmp.getSigno();
             indice++;
         }
         return arreglo;
}
    public ControllerCalculos() {
    }
   public static void configurarOperacionActual(Operaciones operaciones){
       OperacionActual=operaciones;
   }
    public static Operaciones getOperacionActual(){
        return OperacionActual;
    }
  public static int tamanoLista(){
        return listaOperacion.size();
    }
    
    public static void borrarOperacion(int fila){
        if(fila >= 0){
            listaOperacion.remove(listaOperacion.size()-(fila+1));
        }
    }
    
    public static void reescribirOperacion(int fila, ControllerCalculos OperacionesActual){
        if(fila >= 0){
            listaOperacion.set(listaOperacion.size()-(fila+1), OperacionActual);
           
        
        }
    }
            
}
