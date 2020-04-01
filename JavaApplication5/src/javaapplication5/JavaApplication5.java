/*
Arabanin km basina yaktigi benzin miktarini
ve kac km gidilecegini alarak
ne kadarlik benzin eklemek gerektigini hesaplayan program
 */
package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {


    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Araciniz 100 km icin kac litre yakit harciyor (orn 4.8) = ");
        double lt = scanner.nextDouble();
       
        System.out.print("Kac km gideceksiniz = ");
        double km = scanner.nextDouble();
        
        double ykt = (km * lt) / 100;
        
        System.out.println("Almaniz gereken yakit miktari = " + ykt + " litre" );
        
        System.out.print("Yakitin guncel litre fiyati (orn 4.8) = ");
        double ltf = scanner.nextDouble();
       
        double ucrt = ykt * ltf ;
        
        System.out.println("Almaniz gereken yakit miktari = " + ucrt + " lira" );
    }
    
}
