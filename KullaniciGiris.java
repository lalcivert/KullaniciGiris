package day01;
import java.util.Scanner;
public class KullaniciGiris {
    public static void main(String[] args) {

        String isim,sifre2,sifre;
        Scanner input=new Scanner(System.in);

        String secim;

        System.out.println("Kullanıcı adınızı giriniz: ");
        isim=input.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        sifre=input.nextLine();

        if(isim.equals("lalcivert") && sifre.equals("1234") ){
            System.out.println("Giriş başarılı.");
        }else {
            System.out.println("sifreniz yanlış, şifrenizi değiştirmek istermisiniz ");
            secim=input.nextLine();
            if(secim.equals("evet")){
                System.out.println("yeni şifre giriniz: ");
                sifre2=input.nextLine();
                if(sifre==sifre2){
                    System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz..");
                }else{
                    System.out.println("Şifre oluşturuldu...");
                }

            }
        }
    }
}
