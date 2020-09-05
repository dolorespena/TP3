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
class PuntoGeometrico {
    
    private int x;
    private int y;
    
    public PuntoGeometrico(){
        this.x = 0;
        this.y = 0;
    }
    public PuntoGeometrico(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
     public void desplazamiento(int desp1, int desp2){ //void porque modifica solamente
         this.x += desp1;
         this.y += desp2;
    }
    public double distancia (PuntoGeometrico punto2){
        return Math.sqrt(Math.pow(this.x-punto2.getX(), 2) + Math.pow(this.y-punto2.getY(), 2));
    }
    
   
    
}
