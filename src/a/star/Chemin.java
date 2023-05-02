/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.star;
import java.util.*;

/**
 *
 * @author Fadio
 */
public class Chemin {
    
    public static Noeud aEtoile(Noeud noeudDepart, Noeud noeudArrive){
	    List<Noeud> frontiere = new ArrayList<>();
	    HashSet<Noeud> visites = new HashSet<>();
	    
	    noeudDepart.f = noeudDepart.g + noeudDepart.getH();
	    frontiere.add(noeudDepart);

	    while(!frontiere.isEmpty()){
	    	
	        Noeud courant = frontiere.get(0);
	       // trier pour avoir une priority queue 
	        for (Noeud eachNode : frontiere) {
				if(eachNode.f<courant.f)
					courant=eachNode;
			}
	        
	        if(courant == noeudArrive){ // Solution trouve
	            return courant;
	        }

	        for(Noeud.Lien lien : courant.Voisins){
	            Noeud voisin = lien.noeud;
	            
	            int distanceTotale = courant.g + lien.cout; // g  du noeud voisin

	            if(  !visites.contains(voisin)){
	            	voisin.parent = courant;
	            	voisin.g = distanceTotale;
	            	voisin.f = voisin.g + voisin.getH();
	                frontiere.add(voisin);
	            } else {
	                if(distanceTotale < voisin.g){
	                	voisin.parent = courant;
	                	voisin.g = distanceTotale;
	                	voisin.f = voisin.g + voisin.getH();
                                
	                        visites.remove(voisin);
	                        frontiere.add(voisin);
//	                    
	                }
	            }
	        }

	        frontiere.remove(courant);
	        visites.add(courant);
	    }
	    return null;
	}
    
    public static int leCout(Noeud noeudDepart,Noeud noeudArrive) {
    	List<String> listas=new ArrayList<>();
    	Noeud target=noeudArrive;
    	listas.add(noeudArrive.nom);
    	while(target!=noeudDepart) { // backtrack vers le noeud initiale
    		target=target.parent;
    		listas.add(target.nom);
    	}
    	
    	int x=0;
    	
    	for (int i = listas.size()-1; i > 0; i--) {
    		for (Noeud.Lien edge : noeudDepart.Voisins) {
    			if(edge.noeud.nom.equals(listas.get(i-1))){
    				x+=edge.cout;
    				noeudDepart=edge.noeud;
    			}
    			
			}
		}
    	return x;
    }

	public static void printPath(Noeud goalNode){
	    Noeud courant = goalNode;

	    if(courant==null)
	        return;

	    List<String> lista = new ArrayList<>();

	    while(courant.parent != null){
	        lista.add(courant.nom);
	        courant = courant.parent;
	    }
	    lista.add(courant.nom);
	    Collections.reverse(lista);
	    String s="";
	    for(String nom : lista){
	    	s+=nom + " -> ";
	    }
	    System.out.println("Path   : "+s.substring(0, s.length()-3));
	}
    
}
