/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.maquiaba.treillisa8.projet.treillis.info;

/**
 *
 * @author maqui
 */
public abstract class NoeudAppuis extends Noeud{
    
    public NoeudAppuis (double x,double y,Vecteur2D f, double i) {
        super (x,y,f,i);    
    }  
    
    public NoeudAppuis (double x,double y,Vecteur2D f) {
        super (x,y,f);
    }
}
    

