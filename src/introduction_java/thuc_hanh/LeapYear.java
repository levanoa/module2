package introduction_java.thuc_hanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year");
        year = Integer.parseInt(scanner.nextLine());
        boolean isLeapYear = false;
        if ( year %4 == 0 ){
            if(year %100 == 0) {
                if( year %400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
          if ( isLeapYear) {
              System.out.printf(" %d is a leap year", year);
        } else {
              System.out.printf(" %d is NOT  a leap year",year);
          }
    }
}
