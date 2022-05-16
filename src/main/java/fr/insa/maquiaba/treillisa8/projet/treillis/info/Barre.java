/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package fr.insa.maquiaba.treillisa8.projet.treillis.info;

/**
 *
 * @author maqui
 */
public class Barre {  
    private double id;
    private Noeud nDépart;
    private Noeud nArrivée;
    private double tractionMax;
    private double compressionMax;
    private double prix;
    
    public Barre(double tm,double cm,double p,Noeud nD, Noeud nA, double i){
        this.tractionMax=tm;
        this.compressionMax=cm;
        this.prix=p;
        this.nDépart=nD;
        this.nArrivée=nA;
        this.id=i;
        }
    
    public void setid(double i){
        this.id=i;
    }
    
    public double getid (){
        return this.id;
    }
    
    public void setnDépart(Noeud nD){
        this.nDépart=nD;
    }
    
    public Noeud getnDépart(){
        return this.nDépart;
    }
    
    public void setnArrivée(Noeud nA){
        this.nArrivée=nA;
    }
    
    public Noeud getnArrivée(){
        return this.nArrivée;
    }
    
    public void settractionMax(double tm){
        this.tractionMax=tm;
    }
    
    public double gettractionMax(){
        return this.tractionMax;
    }
    
    public void setcompressionMax(double cm){
        this.compressionMax=cm;
    }
    
    public double getcompressionMax(){
        return this.compressionMax;
    }
    
    public void setprix(double p){
        this.prix=p;
    }
    
    public double getprix(){
        return this.prix;
    }
    
public String ToString (){
    return "Identifiant:"+this.getid()
            +"Noeud de départ:"+this.getnDépart()
            +"Noeud d'arrivée:"+this.getnArrivée()
            +" Traction maximal:"+this.gettractionMax()
            +" Compression maximal:"+this.getcompressionMax()
            +"prix au mettre:"+this.getprix()+"."; 
}

  public Noeud noeudOpposé (Noeud n) {
      if(n==this.nDépart){
          return this.nArrivée;
      }else if(n==this.nArrivée){
          return this.nDépart;
      }else{
          throw new Error ("Erreur, le noeud saisi ne correspond ni au noeud de départ ni au noeud d'arrivée.");
          
      }  
    }
  
    public static void main(String[] args){
        Noeud n1;
        Noeud n2;
        Noeud n3;
        double a;
        Barre b;
        n1 = Noeud.entreeNoeud();
        n2 = Noeud.entreeNoeud();
        b = new Barre(0.0,0.0,1.0,n1,n2,1.0);
        n3 = b.noeudOpposé(n1);
        System.out.println(n3);
        a = b.angle();
        System.out.println(a);
    }
    
     public double angle(){
        double a;
        double b;
        int rep;
        Noeud n1;
        Noeud n2;
        System.out.println("Voulez-vous l'angle à partir du Noeud de départ (tapez 1) ou d'arrivée (tapez 2)?");
        rep = Lire.i();
        while ((rep >2)||(rep < 1)) {
            System.out.println("La réponse est incorrecte, réessayez.");
        }
        if (rep == 1){
            n1=getnDépart();
            n2=getnArrivée();
        } else {
            n1=getnArrivée();
            n2=getnDépart();
        }
        if (n1.getNy()<n2.getNy()){
            b = n2.getNy() - n1.getNy();
            a = n2.getNx() - n1.getNx();
        } else {
            b = n1.getNy() - n2.getNy();
            a = n1.getNx() - n2.getNx();
        }
        return Math.atan2(b, a);
    }
     
}


    

