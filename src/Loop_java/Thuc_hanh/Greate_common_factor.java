package Loop_java.Thuc_hanh;

import java.util.Scanner;

public class Greate_common_factor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a  = scanner.nextInt();
        System.out.print("Enter b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if( a == 0 || b ==0) {
            System.out.println("No greatest common factor");
        }

        while (a !=b) {
            if( a>b)
                a -= b;
            else
                b-= a;
        }
        System.out.println("Greatest common fcotr: " + a);
    }
}
