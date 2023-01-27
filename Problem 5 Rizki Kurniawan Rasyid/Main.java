import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Program Java mendeteksi apakah sebuah kata jika dibalik akan sama atau tidak");
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("Masukkan sebuah kata");
        String kata = input.nextLine();
        String balikkata = "";

        for (int i=kata.length()-1;i>=0;i--){
            char temp = kata.charAt(i);
            balikkata += String.valueOf(temp);

        }
        if (kata.equals(balikkata)) {
            System.out.println("Kata ini termasuk Polindrom");
        }
        else {
            System.out.println("Kata ini bukan termasuk Polindrom");
        }


    }
}