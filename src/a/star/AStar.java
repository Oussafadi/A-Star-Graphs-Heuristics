/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a.star;

/**
 *
 * @author Fadio
 */
public class AStar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Noeud s = new Noeud(5,"S");
//	    s.g = 0;
//
//	    Noeud a = new Noeud(2,"A");
//	    Noeud b = new Noeud(3,"B");
//	    Noeud c = new Noeud(1,"C");
//	    Noeud d = new Noeud(5,"D");
//	    Noeud e = new Noeud(0,"E");
//	        
//	    s.addLien(2, a);
//	    s.addLien(8, e);	    
//	    a.addLien(3, b);
//	    a.addLien(1, c);	    
//	    b.addLien(5, d);	    
//	    c.addLien(3, d);
//	    c.addLien(2, e);	    
//	    d.addLien(1, e);
//	    
//	    
//	 
//	    Noeud path = Chemin.aEtoile(s, e);
//	    Chemin.printPath(path);
//	    int cout=Chemin.leCout(s, e);
//	    System.out.println("Le cout du chemin : " + cout);
              Noeud a = new Noeud(10,"A");
	    a.g = 0;

	    Noeud b = new Noeud(8,"B");
	    Noeud c = new Noeud(5,"C");
	    Noeud d = new Noeud(7,"D");
	    Noeud e = new Noeud(3,"E");
	    Noeud f = new Noeud(6,"F");
            Noeud g = new Noeud(5,"G");
            Noeud h = new Noeud(3,"H");
            Noeud i = new Noeud(1,"I");
            Noeud j = new Noeud(0,"J");
	        
	    a.addLien(6, b);
	    a.addLien(3, f);	    
	    b.addLien(3, c);
	    b.addLien(2, d);	    
	    c.addLien(1, d);	    
	    c.addLien(5, e);
	    d.addLien(8, e);	    
	    e.addLien(5, j);
            f.addLien(1, g);
            f.addLien(7, h);
            h.addLien(2, i);
            i.addLien(3,j );
            g.addLien(3, i);
            
	    
	    
	    
	    Noeud path = Chemin.aEtoile(a, j);
	    Chemin.printPath(path);
	    int cout=Chemin.leCout(a, j);
	    System.out.println("Le cout du chemin : " + cout);

    }
    
}
