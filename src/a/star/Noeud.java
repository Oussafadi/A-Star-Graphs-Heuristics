/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.star;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fadio
 */
public class Noeud {
    
    public String nom;  
    public Noeud parent = null;
    public List<Lien> Voisins;   
    public int f = 100;
    public int g = 100;   
    public int h; 

    Noeud(int h,String nom){
          this.h = h;
          this.nom = nom;
          this.Voisins = new ArrayList<>();
    }

    public static class Lien {
          Lien(int c, Noeud n){
                this.cout = c;
                this.noeud = n;
          }

          public int cout;
          public Noeud noeud;
    }

    public void addLien(int weight, Noeud node){
          Lien newLien = new Lien(weight, node);
          Voisins.add(newLien);
    }

    public int getH(){
          return this.h;
    }
    
    }
