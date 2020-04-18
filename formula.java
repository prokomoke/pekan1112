
package week_12;

import java.util.Scanner;

public class formula {

    void volume (){  
    Scanner input = new Scanner (System.in);
    
    System.out.print("Menghitung Volume Kubus, Balok, Prisma, Limas dan Kerucut");
    
    
    System.out.print("Bangun Ruang = ");
    String bangunruang = input.nextLine ();
    System.out.print("Luas Alas = ");
    int luasalas = input.nextInt ();
    System.out.print("Tinggi = ");
    int tinggi = input.nextInt ();
    
    int vol1;
    vol1 = luasalas*tinggi;
    int vol2;
    vol2 = luasalas*tinggi/3;
        
        if (bangunruang == "kubus" ) {
            System.out.println("Volume = "+ vol1);
            if (bangunruang == "balok"){
                System.out.println("Volume = "+ vol1);
                if (bangunruang == "prisma"){
                    System.out.println("Volume = "+ vol1);
                }
            }
        }else {
            System.out.println("Volume = "+ vol2);
    }
    }
    
    void luas (){
    Scanner input = new Scanner (System.in);
    
    System.out.print("Menghitung Luas Persegi, Persegi Panjang, Jajargenjang, dan Segitiga");
    
    
    System.out.print("Bangun Datar = ");
    String bangundatar = input.nextLine ();
    System.out.print("Lebar/Alas = ");
    int base = input.nextInt ();
    System.out.print("Tinggi/lebar = ");
    int height = input.nextInt ();
    
    int luas1;
    luas1 = base*height;
    int luas2;
    luas2 = base*height/2;
    
    if (bangundatar == "persegi" ) {
            System.out.println("Luas = "+ luas1);
            if (bangundatar == "persegi panjang"){
                System.out.println("Luas = "+ luas1);
                if (bangundatar == "jajargenjang"){
                    System.out.println("Volume = "+ luas1);
                }
            }
        }else {
            System.out.println("Luas = "+ luas2);
    }
           
    }
}
   


