/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.maquiaba.treillisa8.projet.treillis.info;

import java.util.ArrayList;

/**
 *
 * @author maqui
 */
    public class Treillis {
    private ArrayList<Barre> barres;
    private ArrayList<Noeud> noeuds;
    
    public ArrayList<Barre> getBarres(){
        return this.barres;
    }
    
    public void setBarres (ArrayList<Barre> b){
        this.barres = b;
    }
    
    public ArrayList<Noeud> getNoeuds(){
    return this.noeuds;
    }
    
    public void setNoeuds (ArrayList<Noeud> n){
        this.noeuds = n;
    }
    
    public Treillis (ArrayList<Barre> b,ArrayList<Noeud> n){
        this.barres = b;
        this.noeuds = n;
    }
    public Treillis (){
        this(new ArrayList<>(),new ArrayList<>());
    }
    
    public double maxIdNoeud (){
        double id;
        int i;
        id = 0;
        for (i=0; i<this.noeuds.size(); i++){
            if (id < this.noeuds.get(i).getId()){
                id = this.noeuds.get(i).getId();
            }
        }
        return id;
    }
    
    public double maxIdBarre (){
        double id;
        int i;
        id = 0;
        for (i=0; i<this.barres.size(); i++){
            if (id < this.barres.get(i).getid()){
                id = this.barres.get(i).getid();
            }
        }
        return id;
    }
    public void ajouteNoeud (Noeud n){
        int i;
        boolean erreur;
        erreur = false;
        for (i=0; i<this.noeuds.size(); i++){
            if (n == this.noeuds.get(i)){
                erreur = true;
            }
        }
        if (erreur == true){
            System.out.println("Erreur, votre noeud se situe déjà dans ce treillis.");
        } else{
            n.setId(this.maxIdNoeud()+1);
            noeuds.add(n);
        }
    }
    
    public void ajouteBarre (Barre b){
        int i;
        boolean erreur;
        erreur = false;
        for (i=0; i<this.barres.size(); i++){
            if (b == this.barres.get(i)){
                erreur = true;
            }
        }
        if (erreur == true){
            System.out.println("Erreur, votre barre se situe déjà dans ce treillis.");
        } else {
            ajouteNoeud(b.getnDépart());
            ajouteNoeud(b.getnArrivée());
            b.setid(this.maxIdBarre()+1);
            barres.add(b);
        }
    }
    
    public static Treillis treilliTest(){
        NoeudSimple n1 = new NoeudSimple(50, 50, new Vecteur2D(0, 0));
        NoeudSimple n2 = new NoeudSimple(150, 50, new Vecteur2D(0, 0));
        Barre b = new Barre(0,0,0,n1,n2,1);
        Treillis res = new Treillis();
        res.ajouteNoeud(n1);
        res.ajouteNoeud(n2);
        res.ajouteBarre(b);
        return res;
        
    }
        
    }
    

