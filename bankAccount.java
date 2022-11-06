import java.util.Scanner;

public class bankAccount{

    public static void main(String[] args) {
        
        Scanner inp = new Scanner (System.in) ;

        int select , trynum=3 ;

        double price , amount = 0 ;

        String pass , userID ;

        System.out.println("Kullanıcı adınızı giriniz ");

        userID=inp.nextLine();

        System.out.println("Şifrenizi Giriniz ") ;

        pass=inp.nextLine();


        while( trynum >= 0 ){

        if(pass.equals("sifre") && userID.equals("kullaniciadi")){

            System.out.println("Yapmak istediğiniz işlemi seçiniz\n"+
            "1-Para yatırma\n"+
            "2-Para çekme\n"+
            "3-Bakiye sorgulama\n"+
            "4-Çıkış yap");

            select=inp.nextInt();

            if(select > 0 && select <=4){
           
                    switch(select){

                        case 1:

                        System.out.print("Yatırılacak tutarı giriniz: ");

                        price=inp.nextDouble();

                        amount += price;

                        System.out.println("Yatırılan Tutar: "+price+"TL");
                        System.out.println("Bakiyeniz: "+amount+"TL");

                        break;

                        case 2:

                        System.out.println("Çekeceğiniz tutarı giriniz: ");

                        price=inp.nextDouble();

                        amount -= price;

                        System.out.println("Çekilen Tutar: "+price+"TL");
                        System.out.println("Bakiyeniz: "+amount+"TL");
                        
                        break;

                        case 3:

                        System.out.println("Bakiyeniz: "+amount+"TL");

                        break;

                        case 4:

                        System.out.println("Yine bekleriz");

                        break;
                    }
                    break;
                        
            }
            else {

                System.out.println("Hatalı işlem seçimi");
            }
            
        }
        else{
            trynum --;
            switch(trynum){

                case 3:
                System.out.println("Hatalı kullanıcı adı veya şifre ");

                System.out.println("Kalan deneme hakkınız: "+trynum );

                System.out.print("Kullanıcı adınızı giriniz: ");

                userID=inp.nextLine();
        
                System.out.println("Şifrenizi Giriniz ") ;
        
                pass=inp.nextLine();

                break;
                
                case 2:
                System.out.println("Hatalı kullanıcı adı veya şifre ");

                System.out.println("Kalan deneme hakkınız: "+trynum );

                System.out.print("Kullanıcı adınızı giriniz: ");

                userID=inp.nextLine();
        
                System.out.println("Şifrenizi Giriniz ") ;
        
                pass=inp.nextLine();

                break;

                case 1:
                System.out.println("Hatalı kullanıcı adı veya şifre ");

                System.out.println("Kalan deneme hakkınız: "+trynum );

                System.out.print("Kullanıcı adınızı giriniz: ");

                userID=inp.nextLine();
        
                System.out.println("Şifrenizi Giriniz ") ;
        
                pass=inp.nextLine();

                break;

                case 0:

                System.out.println("Hesabınız bloke edildi!!\nMüşteri temsilciniz ile görüşün");

                break;
            }
        }

        }
    
     }
}