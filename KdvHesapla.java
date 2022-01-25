import java.util.Scanner;

public class KdvHesapla {
    public static void main(String[] args) {

        double deger,kdvhesap=1.18,sonuc;

        Scanner input = new Scanner(System.in);
        System.out.print("KDVsiz tutari giriniz: ");
        deger = input.nextInt();

        if(deger>0 && deger<1000){
            kdvhesap=1.18;
            sonuc = deger * kdvhesap;
        }else if(deger>=1000){
            kdvhesap=1.08;
            sonuc = deger * kdvhesap;
        }else{
            sonuc =0; //eksi deger icin.
        }

        System.out.println("KDV orani("+kdvhesap+") , KDV'li tutar : " +sonuc );
    }
}
