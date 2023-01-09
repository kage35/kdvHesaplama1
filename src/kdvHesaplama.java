import java.util.Scanner;
public class kdvHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen para miktarını giriniz");
        double para=input.nextDouble();
        double kdv=para*18/100;
        double toplam=para+kdv;
        System.out.println("KDV'siz fiyat"+ para+"\n"+"KDV'li fiyat "+ toplam  +"\n"+ "KDV tutarı "+kdv );
    }
}
