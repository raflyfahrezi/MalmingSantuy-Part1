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
import java.util.Scanner;

public class malmingsantuy {
    double sisi;
            
    double hitungluas(){
        return sisi * sisi;
    }
    
    public static void main(String[] args) {
        malmingsantuy persegi1 = new malmingsantuy();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Sisi : ");
        
        persegi1.sisi = input.nextDouble();
        
        System.out.println("Luas Persegi adalah " + persegi1.hitungluas());
        
    }
}
