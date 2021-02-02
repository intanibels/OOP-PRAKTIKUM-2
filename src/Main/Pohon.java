package Main;
import java.util.Scanner;
public class Pohon {
    // mendifinisikan atribut 
    String nama;
    int tinggi;
    //membuat scanner
    Scanner a = new Scanner(System.in);
    //membuat method void setNama
    void setNama(){
        //menerima masukan user
        System.out.print("Masukkan Nama   : ");
        nama = a.nextLine();
    }
    //membuat method void setTinggi
    void setTinggi(){
        //menerima masukan user
        System.out.print("Masukkan Tinggi : ");
        tinggi = a.nextInt();
    }
    //membuat method void getNama
    void getNama(){
        //menampilkan hasil output
        System.out.println("Nama Pohon   : "+nama);
    }
    //membuat method void getTinggi
    void getTinggi(){
        //menampilkan hasil output
        System.out.println("Tinggi Pohon : "+tinggi);
    }
}