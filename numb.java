import java.util.Scanner;
public class numb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int max=0, min =0;
        
        System.out.println("Kaç sayı gireceksiniz ?:");
        int sayi = input.nextInt();
              
            
        for(int i=1; i <= sayi ; i++){
            System.out.println(i + ".sayıyı girin :");
            int user = input.nextInt();          

                                            
            if(i==1){
                max = user;
                min = user;
              
            }
            if (user > max){
                max = user;
            }
            if (user < min){
                min = user;
            } 
        }
        System.out.println("Girilen sayılardan en büyüğü :" + max + "\nGirilen Sayılardan en küçüğü :" + min);        
    }
    
}
/*int i=1; i <= sayi ; i++){
            System.out.print(i + ".sayıyı giriniz : ");
            int sayi = input.nextInt();*/ 
