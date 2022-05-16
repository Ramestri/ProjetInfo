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
public abstract class Noeud {   
   private double nx;
    private double ny;
    private Vecteur2D force;
    private double id;
    private ArrayList<Barre> barresDepart;
    private ArrayList<Barre> barresArrivee;
    
    public void setNx (double x){
        this.nx=x;
    }
    
    public void setNy(double y){
        this.ny=y;
    }
    
    public double getNx(){
        return this.nx;
    }
    
    public double getNy(){
        return this.ny;
    }
    
    public void setId (double i){
        this.id=i;
    }
    
    public double getId(){
        return this.id;
    }
     public Vecteur2D getforce(){
        return this.force;
    }
    
    public void setforce (Vecteur2D f){
        this.force=f;
    }
    
    public ArrayList<Barre> getBarreDepart() {
        return this.barresDepart;
    }
    
    public ArrayList<Barre> getBarreArrivee() {
        return this.barresArrivee;
    }
    public Noeud (double x,double y,Vecteur2D f, double i){
        this.nx = x;
        this.ny = y;
        this.force = f;
        this.id = i;
        this.barresArrivee = new ArrayList<Barre>();
        this.barresDepart = new ArrayList<Barre>();
    }
    
    public Noeud (double x,double y,Vecteur2D f){
        this(x,y,f,-1);
    }
    public Noeud(double x,double y){
        this(x,y,new Vecteur2D (0,0),-1);
    }
     @Override
    public String toString (){
        return "Le Noeud a pour coordonnées "+ this.getNx() +
                ", "+ getNy() +", a une force possédant les coordonnées "+
                this.getforce().getVx() +", "+ this.getforce().getVy() +" et a pour identifiant "+ getId() +".";
    }
    
    public static Noeud entreeNoeud(){
        double x;
        double y;
        double i;
        double vx;
        double vy;
        Vecteur2D f;
        System.out.println("quelle est l'abscisse de votre Noeud?");
        x=Lire.d();
        System.out.println("Quelle est l'ordonnée de votre Noeud?");
        y=Lire.d();
        System.out.println("Quel est l'identifiant de votre Noeud?");
        i=Lire.d();
        System.out.println("Quelle est l'abscisse de votre Force?");
        vx=Lire.d();
        System.out.println("Quelle est l'ordonnée de votre force?");
        vy=Lire.d();
        f = new Vecteur2D (vx, vy);
        System.out.println("type de noeud (1 pour un noeud simple, 2 pour un appuis simple ou 3 pour un appuis double.");
        int rep = Lire.i();
        Noeud res;
        while ((rep >3)||(rep < 1)){
            System.out.println("réponse incorecte, veuillez réessayer.");
            rep = Lire.i();
        while ((rep >3)||(rep < 1)){
            System.out.println("réponse incorecte, veuillez réessayer.");
            rep = Lire.i();
        
        }
        }
        res = switch (rep) {
                case 1 -> new NoeudSimple(x, y, f, i);
                case 2 -> new NoeudAppuisSimple(x,y,f,i);
                default -> new NoeudAppuisDouble(x,y,f,i);
            };
        
    
        return res;
    }
    
    public static void main (String[] args){
        Noeud n;
        n = entreeNoeud();
        System.out.println("n = "+ n.toString());
    }
    
    public ArrayList<Barre> barresIncidentes() {
        ArrayList<Barre> rep = new ArrayList<Barre>();
        int i;
        for (i=0; i<=this.barresDepart.size(); i++){
            rep.add(this.barresDepart.get(i));
        }
        rep.addAll(this.barresArrivee);
        return rep;
    }
}
   
