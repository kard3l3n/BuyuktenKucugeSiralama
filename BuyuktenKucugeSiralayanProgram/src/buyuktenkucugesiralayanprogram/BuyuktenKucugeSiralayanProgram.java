package buyuktenkucugesiralayanprogram;
import java.util.Scanner;
import java.math.*;
public class BuyuktenKucugeSiralayanProgram {
    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Birinci sayıyı giriniz:");
        sayi1=input.nextInt();
        
        System.out.println("İkinci sayıyı giriniz:");
        sayi2=input.nextInt();
        
        System.out.println("Üçüncü sayıyı giriniz:");
        sayi3=input.nextInt();
        
       if(sayi1>sayi2){
           if(sayi2>sayi3){
               System.out.println(sayi1+" "+sayi2+" "+sayi3);
           }
           else if(sayi3>sayi2 && sayi3<sayi1){
               System.out.println(sayi1+" "+sayi3+" "+sayi2);
           }
       }
       if(sayi2>sayi1){
           if(sayi1>sayi3){
               System.out.println(sayi2+" "+sayi1+" "+sayi3);
           }
           else if(sayi3>sayi1 && sayi3<sayi2){
               System.out.println(sayi2+" "+sayi3+" "+sayi1);
           }
       }
        if(sayi3>sayi2){
           if(sayi2>sayi1){
               System.out.println(sayi3+" "+sayi2+" "+sayi1);
           }
           else if(sayi1>sayi2 && sayi1<sayi3){
               System.out.println(sayi3+" "+sayi1+" "+sayi2);
           }
       }
       
        
      
        
    }
    
}
