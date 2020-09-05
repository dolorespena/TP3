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
public class Rectangulo {
    
    private PuntoGeometrico puntoA;
    private PuntoGeometrico puntoB;
    private PuntoGeometrico puntoC;
    private PuntoGeometrico puntoD;

    public PuntoGeometrico getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(PuntoGeometrico puntoA) {
        this.puntoA = puntoA;
    }

    public PuntoGeometrico getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(PuntoGeometrico puntoB) {
        this.puntoB = puntoB;
    }

    public PuntoGeometrico getPuntoC() {
        return puntoC;
    }

    public void setPuntoC(PuntoGeometrico puntoC) {
        this.puntoC = puntoC;
    }

    public PuntoGeometrico getPuntoD() {
        return puntoD;
    }

    public void setPuntoD(PuntoGeometrico puntoD) {
        this.puntoD = puntoD;
    }
   
    
    public Rectangulo(PuntoGeometrico puntoA, PuntoGeometrico puntoB, PuntoGeometrico puntoC,PuntoGeometrico puntoD){
        this.puntoA = puntoA;
        this.puntoB = puntoB;
        this.puntoC = puntoC;
        this.puntoD = puntoD;
    }
    
    public boolean esRectangulo(){
        if((puntoA.getX()==puntoB.getX())||(puntoA.getY()==puntoB.getY())){
            if(puntoA.getX()==puntoB.getX()){
                if((puntoC.getY()==puntoA.getY())||(puntoC.getY()==puntoB.getY())){
                    if(puntoC.getY()==puntoA.getY()){
                        if((puntoD.getX()==puntoC.getX())&&(puntoD.getY()==puntoB.getY())){
                            return true;
                        }
                    }else{
                        if((puntoD.getX()==puntoC.getX())&&(puntoD.getY()==puntoA.getY())){
                            return true;
                        }
                    }
                }
            }else{
                if((puntoC.getX()==puntoA.getX())||(puntoC.getX()==puntoB.getX())){
                    if(puntoC.getX()==puntoA.getX()){
                        if((puntoD.getY()==puntoC.getY())&&(puntoD.getX()==puntoB.getX())){
                            return true;
                        }
                    }else{
                        if((puntoD.getX()==puntoA.getX())&&(puntoD.getY()==puntoC.getY())){
                            return true;
                        }
                    }
                }
            }
        }else{
            if((puntoC.getX()==puntoA.getX())||(puntoC.getY()==puntoA.getY())){
                if(puntoC.getX()==puntoA.getX()){
                    if((puntoC.getY()==puntoB.getY())&&(puntoD.getY()==puntoA.getY())&&(puntoD.getX()==puntoB.getX())){
                        return true;
                    }
                }else{
                    if((puntoC.getX()==puntoB.getX())&&(puntoD.getX()==puntoA.getX())&&(puntoD.getY()==puntoB.getY())){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void desplazarRectangulo(int x, int y){
       puntoA.setX(puntoA.getX()+x);
       puntoA.setY(puntoA.getY()+y);
       
       puntoB.setX(puntoB.getX()+x);
       puntoB.setY(puntoB.getY()+y);
       
       puntoC.setX(puntoC.getX()+x);
       puntoC.setY(puntoC.getY()+y);
       
       puntoD.setX(puntoD.getX()+x);
       puntoD.setY(puntoD.getY()+y);
    }
    
}
