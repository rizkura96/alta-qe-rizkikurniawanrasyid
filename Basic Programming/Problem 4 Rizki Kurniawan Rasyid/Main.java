import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan bulat :");
        int bil = input.nextInt();
        int cek = 0;


        for (int x=1; x<=bil; x++) {
            if ((bil % x) == 0) {cek++;
            }
        }
        if (cek ==2)
            System.out.println(bil+" merupakan bilang prima.");
        else
            System.out.println(bil+" bukan merupakan bilangan prima.");
    }
}