/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] makanan = {"0", "Soto", "Sop", "Rawon"};
        int[] hargaMakanan = {0, 8000, 7000, 12000};
        
        System.out.println ("--- Menu Restoran ---");
        System.out.println ("Makanan :");
        for (int i = 1; i < makanan.length; i++){
            System.out.println(i+". "+makanan[i]+" => "+hargaMakanan[i]);
        }
        System.out.print("Masukkan no pilihan Anda : ");
        int pilihan1 = input.nextInt();
        
        if (pilihan1 == 1 || pilihan1 == 2 || pilihan1 ==3){
            String[] minuman = {"0", "Es Jeruk", "Es Teh", "Es Kelapa Muda"};
            int[] hargaMinuman = {0, 5000, 4000, 8000};
        
            System.out.println ("\nMinuman :");
            for (int i = 1; i < minuman.length; i++){
                System.out.println(i+". "+minuman[i]+" => "+hargaMinuman[i]);
            }   
            System.out.print("Masukkan no pilihan Anda : ");
            int pilihan2 = input.nextInt();
            
            if (pilihan2 == 1 || pilihan2 == 2 || pilihan2 ==3){
                int totalHarga = hargaMakanan[pilihan1] + hargaMinuman[pilihan2];
                System.out.println("\nTotal harga = "+totalHarga);
                
                System.out.print("\nSilahkan masukkan uang anda : ");
                int uang = input.nextInt();
                
                if (uang > totalHarga){
                    System.out.println("Kembalian Anda : "+(uang - totalHarga));
                }else if (uang == totalHarga){
                    System.out.println("Terimakasih sudah makan disini");
                }else
                    System.out.println("Mohon maaf, uang Anda kurang");
            }else
                System.out.println("\nMohon Maaf, Pilihan tidak ditemukan");
            
        }else
            System.out.println("\nMohon Maaf, Pilihan tidak ditemukan");
    }
    
}
