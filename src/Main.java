import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("nhap so tien");
        double money = sc.nextDouble();
        System.out.println("nhap so thang");
        double moth = sc.nextDouble();
        System.out.println("ti le lai suat");
        double interesRate = sc.nextDouble();
        double resurl = 0 ;
        for ( int i=0; i < moth ; i++ ){
            resurl+= money * (interesRate/100)/12 ;
        }
        System.out.println("so tien lai phai tra la : " + resurl);
    }
}
