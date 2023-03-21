/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yurddisicikisprogrami;
public class YurtDisiCikisProgrami {

   
    public static void main(String[] args) throws InterruptedException {
       
         System.out.println("Sabiha Gokcen Havalimanına Hoşgeldiniz....");
        
        String sartlar = "Yurtdisi cikis Kurallari...\n"
                         +"Herhangi bir siyasi yasaginizin bulunmamasi gerekiyor...\n"
                         +"15 Tl harç bedelinizi tam olarak yatirmaniz gerekiyor...\n"
                         +"Gideceginiz ulkeye vizenizin bulunmasi gerekiyor...";
        String message = "Yurtdisi sartlarından hepsini saglamaniz gerekiyor";
        
        
        while(true) {
            System.out.println("*******************************************");
            System.out.println(sartlar);
            System.out.println("*******************************************");
            
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harç Bedeli Kontrol Ediliyor...");
            
            Thread.sleep(3000);
            if (yolcu.yurtdisiHarciKontrol() == false) {
                
                System.out.println(message);
                continue;
            }
            
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);
            
            if (yolcu.siyasiYasakKontrol() == false) {
                System.out.println(message);
                continue;
            }
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000);
            
            if (yolcu.vizeDurumuKontrol() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz Tamam ! Yurtdışına çıkabilirsiniz...");
            break;
            
            
        }
            
        
    }
    
}
