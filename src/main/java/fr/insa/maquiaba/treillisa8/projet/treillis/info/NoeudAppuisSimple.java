/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.maquiaba.treillisa8.projet.treillis.info;

/**
 *
 * @author maqui
 */

    public class NoeudAppuisSimple extends NoeudAppuis {
    
    public NoeudAppuisSimple (double x,double y,Vecteur2D f,double i){
        super(x,y,f,i);
    }
    
    public NoeudAppuisSimple (double x,double y,Vecteur2D f){
        super(x,y,f);
    }
    
    @Override
    public String toString(){
        return "Le noeud simple a pour abscisse "+ this.getNx() +
                ", pour ordonnée "+ this.getNy() +
                ", a une force possédant les coordonnées "+
                this.getforce().getVx() +", "+ this.getforce().getVy() +
                " et a pour identifiant "+ getId() +".";
    }
}
    
