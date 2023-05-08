import java.util.Scanner;
public class KDVHesaplama{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double para,kdvTutar,kdvliTutar, kdvOrani;

        System.out.print("Lütfen ücret tutarını giriniz: ");
        para = sc.nextDouble();

        kdvOrani = (para > 1000) ? 0.08 : 0.18;
        kdvTutar = para * kdvOrani;
        kdvliTutar = para + kdvTutar;
        System.out.println("KDV'siz Fiyat: "+para);
        System.out.println("KDV'li Fiyat: "+kdvliTutar);
        System.out.println("KDV Tutarı: "+kdvTutar);
    }
}

