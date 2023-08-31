import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluşturalım
        int mat,fizik,kimya,turkce,tarih,muzik;


        //Scanner sınıfımızı tanımladık

        Scanner inp =new Scanner(System.in);

        //Kullanıcıdan gelecek verileri alalım

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik =inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya =inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce =inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam/6;

        boolean kosul1 = sonuc > 60;
        boolean kosul2 = sonuc < 60;

        String str = kosul1 ? "Sınıfı Gectiniz" : "Sınıfta Kaldınız";



        System.out.println("Ortalamanız:  " +sonuc  +" " +str);

        //System.out.println("Sınıfı Geçtiniz" +kosul1);
        //System.out.println("Sınıfta Kaldınız" +kosul2);


















    }
}
