import java.util.Scanner;

public class basitHesapMakinasi {
    public static void main(String[] args) {

      int num1, num2, select;
      Scanner input = new Scanner(System.in);

        System.out.print("ilk sayıyı giriniz: ");
        num1 =input.nextInt();

        System.out.print("ikinci sayıyı giriniz: ");
        num2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciniz: ");
        select = input.nextInt();

        System.out.println(select);

        if (select == 1){
            System.out.println("toplama işlenminiz: " + (num1 +num2));
        }else if(select == 2){
            System.out.println("çıkarma işleminiz: " + (num1 -num2));

        }else if(select == 3){
            System.out.println("çarpma işleminiz: "+ (num1 * num2));

        }else if(select == 4 ){
            System.out.println("bölme işleminiz: " + (num1/num2 ));


        }else{
            System.out.println("işleminiz geçersizidr.lütfen tekrar deneyiniz.");
        }

        // switch-case ile;

        //switch(select){
           // case 1:
                // System.out.println("toplama işleminiz: "+ (num1 + num2));
                //break;
           // case 2:
               // System.out.println("çıkarma işleminiz: "+ (num1 -num2));
                //break;
           // case 3:
                //System.out.println("çarpma işleminiz: "+ (num1 * num2));
               // break;
            //case 4:
                //System.out.println("bölme işleminiz: "+ (num1/num2));
                //break;

        }


    }

