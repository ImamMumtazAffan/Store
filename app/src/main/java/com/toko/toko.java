package com.toko;
/**
 *
 * @author IMAM
 */
import java.util.Scanner;
public class toko {

  public static void main(String[] args) {
   Scanner masukan=new Scanner(System.in);
   
   int pass;
   String imam;
        do{
        System.out.print("Username : ");
        imam=masukan.nextLine();
        }while(!(imam.equals("Imam")));
        
        do{
        System.out.print("Password : ");
        pass=masukan.nextInt();
        }while(!(pass==(1234)));
        System.out.println("== Login Success ==");
       
       int produk,produk1,produk2,produk3,jumlah;
        System.out.println();
        System.out.println("Pilihlah jenis barang !");
        System.out.println("1. Sampo");
        System.out.println("2. Pasta Gigi");
        System.out.println("3. Sabun");
        System.out.print("Pilihan anda : ");
        produk=masukan.nextInt();
        System.out.println();
        
        switch(produk){
            case 1:
                System.out.println("Pilihlah mereknya !");
                System.out.println("1. Lifebouy = Rp 1500");
                System.out.println("2. Rejoice = Rp 2500");
                System.out.println("3. Pantene = Rp 3000");
                System.out.print("Pilihan anda : ");
                produk1=masukan.nextInt();
System.out.println();

                switch(produk1){
                    case 1:
                    System.out.println("Barang : Sampo~Lifebouy");
                    System.out.print("jumlah barang yang ingin anda beli : ");
                     jumlah = masukan.nextInt();
                     System.out.println("Total harga : Rp "+ jumlah*1500);
System.out.println("== Pembelian Success ==");
                     break;
                     
                     case 2:
                    System.out.println("Barang : Sampo~Rejoice");
                    System.out.print("jumlah barang yang ingin anda beli : ");
                     jumlah = masukan.nextInt();
                     System.out.println("Total harga : Rp"+ jumlah*2500);
System.out.println("== Pembelian Success ==");
                     break;
                     
                     case 3:
                    System.out.println("Barang : Sampo~Pantene");
                    System.out.print("jumlah barang yang ingin anda beli : ");
                     jumlah = masukan.nextInt();
                     System.out.println("Total harga : Rp "+ jumlah*3000);
System.out.println("== Pembelian Success ==");
                     break;
                }
                break;
                
            case 2:
                System.out.println("Pilihlah mereknya !");
                System.out.println("1. Formula = Rp 4500");
                System.out.println("2. Pepsodent = Rp 1500");
                System.out.println("3. Kodomo = Rp 3000");
                System.out.print("Pilihan anda : ");
                produk2=masukan.nextInt();
System.out.println();

                switch(produk2){
                    case 1:
                    System.out.println("Barang : Pasta Gigi~Formula");
                    System.out.print("jumlah barang yang ingin anda beli : ");
                     jumlah = masukan.nextInt();
                     System.out.println("Total harga : Rp "+ jumlah*4500);
System.out.println("== Pembelian Success ==");
                     break;
                     
                     case 2:
                    System.out.println("Barang : Pasta Gigi~Pepsodent");
                    System.out.print("jumlah barang yang ingin anda beli : ");
                     jumlah = masukan.nextInt();
                     System.out.println("Total harga : Rp "+ jumlah*1500);
System.out.println("== Pembelian Success ==");
                     break;
                     
                     case 3:
                    System.out.println("Barang : Pasta Gigi~Kodomo");
                    System.out.print("jumlah barang yang ingin anda beli : ");
                     jumlah = masukan.nextInt();
                     System.out.println("Total harga : Rp "+ jumlah*3000);
System.out.println("== Pembelian Success ==");
                     break;
                }
                break;
                
            case 3:
                System.out.println("Pilihlah mereknya !");
                System.out.println("1. Lux = Rp 6500");
                System.out.println("2. Dove = Rp 5000");
                System.out.println("3. Lifebouy = Rp 4500");
                System.out.print("Pilihan anda : ");
produk3=masukan.nextInt();
System.out.println();

                switch(produk3){
                    case 1:
                    System.out.println("Barang : Sabun~Lux");
                    System.out.print("jumlah barang yang ingin anda beli : ");
                     jumlah = masukan.nextInt();
                     System.out.println("Total harga : Rp "+ jumlah*6500);
System.out.println("== Pembelian Success ==");
                     break;
                     
                     case 2:
                    System.out.println("Barang : Sabun~Dove");
                    System.out.print("jumlah barang yang ingin anda beli : ");
                     jumlah = masukan.nextInt();
                     System.out.println("Total harga : Rp "+ jumlah*5000);
System.out.println("== Pembelian Success ==");
                     break;
                     
                     case 3:
                    System.out.println("Barang : Sabun~Lifebouy");
                    System.out.print("jumlah barang yang ingin anda beli : ");
                     jumlah = masukan.nextInt();
                     System.out.println("Total harga : Rp "+ jumlah*4500);
System.out.println("== Pembelian Success ==");
                     break;
                }
                break;
        }
  }
}
