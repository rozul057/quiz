package quiz1.pkg2;
import java.util.*;

class Hitung {

class pecahan{
    int pemb, peny;
    
}

    
public static void main(String[] args) {
        int a = 0,b=0;
        
        pecahan pp = new pecahan();
        pp.pemb=a;
        pp.peny=b;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan pembilang : ");
        a=input.nextInt();
        System.out.print("Masukkan penyebut  : ");
        b=input.nextInt();
        
        if (a==1){
            System.out.println("Pecahan sebelum disederhanakan  : "+a +"/"+b);
            System.out.println("pecahan sesudah disederhanakan  : "+a +"/"+b);
        }
        else if (a%2==0 && b%2!=0){
            System.out.println("Pecahan sebelum disederhanakan  : "+a +"/"+b);
            System.out.println("pecahan sesudah disederhanakan  : "+a +"/"+b);
        }
        else if(b%a==0){
            System.out.println("Pecahan sebelum disederhanakan  : "+a +"/"+b);
            System.out.println("pecahan sesudah disederhanakan  : "+a/a +"/"+b/a);
        }
        else if (a%2!=0){
            if(b%2!=0){
                System.out.println("Pecahan sebelum disederhanakan  : "+a +"/"+b);
                System.out.println("pecahan sesudah disederhanakan  : "+a +"/"+b);
            }
            else{
                System.out.println("Pecahan sebelum disederhanakan  : "+a +"/"+b);
                System.out.println("pecahan sesudah disederhanakan  : "+a +"/"+b);
            }
        }
        else if (a>b){
            System.out.println("Pecahan sebelum disederhanakan  : "+a +"/"+b);
            System.out.println("pecahan sesudah disederhanakan  : "+a/b);
        }
        else{
            System.out.println("Pecahan sebelum disederhanakan  : "+a +"/"+b);
            System.out.println("pecahan sesudah disederhanakan  : "+a +"/"+b);
        }
    }
}
    
