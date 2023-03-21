/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurddisicikisprogrami;

import java.util.Scanner;

public class Yolcu implements YurdDisiKurallari{
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
    
    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Yatirdiginiz Harc Bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Herhangi bir siyasi yasaginiz bulunuyor mu(evet ya da hayır) ? ");
        
        String cevap = scanner.nextLine();
        
        if (cevap.equals("evet")) {
            
            this.siyasiYasak = true;
        } 
        else {
            this.siyasiYasak = false;
        }
        System.out.print("Vizeniz bulunuyor mu ? (evet ya da hayır)");
        
        String cevap2 = scanner.nextLine();
        
        if (cevap2.equals("evet") ){
            this.vizeDurumu = true;
            
        }
        else {
            this.vizeDurumu = false;
        }
        
        
        
        
        
    }

    @Override
    public boolean yurtdisiHarciKontrol() {
        if (this.harc < 15) {
            
            System.out.println("Lutfen yurtdisi cikiş harcini tam yatirin...");
            return false;
        }
        else {
            System.out.println("Yurtdisi harci islemi tamam!");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        
        if (this.siyasiYasak == true) {
            System.out.println("Siyasi yasaginiz bulunuyor.Yurtdisina cikamazsiniz...");
            return false;
        }
        else {
            System.out.println("Siyasi yasaginiz bulunmuyor...");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurumu == true) {
            
            System.out.println("Vize islemleri tamam!");
            return true;
        }
        else {
            System.out.println("Vizeniz gideceginiz ulkeye bulunmamaktadir...");
            return false;
        }

    }
    
    
}
