/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raflyfahrezi;

/**
 *
 * @author Farhan R
 */
public class malmingmantul {
    double sisi;
    
    double hitungluas(){
        return sisi * sisi;
    }
    
    void setsisi(int s){
        sisi = s;
    }
    
    public static void main(String[] args) {
        malmingmantul persegi1 = new malmingmantul();
        malmingmantul persegi2 = new malmingmantul();
        
        persegi1.setsisi(2);
        persegi2.setsisi(5);
        
        System.out.println("Luas Persegi 1 : " + persegi1.hitungluas());
        System.out.println("Luas Persegi 2 : " + persegi2.hitungluas());
    }
}
