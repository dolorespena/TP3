/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2;
/**
 *
 * @author Usuario
 */
public class Prog2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        PuntoGeometrico puntoA = new PuntoGeometrico(1,5);
        PuntoGeometrico puntoB = new PuntoGeometrico(5,1);
        PuntoGeometrico puntoC = new PuntoGeometrico(5,5);
        PuntoGeometrico puntoD = new PuntoGeometrico(1,1);
        
        Rectangulo rectangulo = new Rectangulo(puntoA, puntoB, puntoC, puntoD);
        
        System.out.println(rectangulo.esRectangulo());
        

    }
    
}
