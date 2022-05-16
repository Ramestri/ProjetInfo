/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.maquiaba.treillisa8.projet.treillis.info;

/**
 *
 * @author maqui
 */
public class Vecteur2D {
    private double vx;
    private double vy;   
    
    public double getVx (){
        return this.vx;
    }
    
    public void setVx (double x){
        this.vx=x;
    }
    
    public double getVy (){
        return this.vy;
    }
    
    public void setVy (double y){
        this.vy=y;
    }
    
    public Vecteur2D(double x,double y) {
        this.vx = x;
        this.vy = y;
    }
    
    public static void main(String[] args) {
        Vecteur2D v1,v2,v3;
        v1 = new Vecteur2D(2.541,3);
        System.out.println(v1);
        v2 = new Vecteur2D(4,5);
        System.out.println(v2);
        v3 = v1;
        System.out.println(v3);
    }
    
    public String toString(){
        return "La coordonnée x est "+ getVx() 
                +" et la coordonnée y est "+ getVy() +".";
    }
    
    

   
}
