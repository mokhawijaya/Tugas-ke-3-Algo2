/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.tugas.pkg2.algos2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Nomor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String data[]={"Galileo","Archimedes","Alkhawarizmi","Aljabar","Mokhamad Akbar Wijaya","Tesla"};
        String key;
        System.out.println("Isi Data Adalah : ");
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
        System.out.print("Masukkan Data Yang akan dicari : ");
        key = input.nextLine();
        for (int i=0;i<data.length;i++){
            if(key.equalsIgnoreCase(data[i])){
                System.out.println("Data "+key+"Berada di Indeks ke : "+i);
                break;
            }
        }
        
    }
    
}
