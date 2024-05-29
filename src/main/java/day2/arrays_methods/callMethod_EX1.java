package day2.arrays_methods;

import java.util.Scanner;

public class callMethod_EX1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter mark and fullmark: ");
        double mark = sc.nextDouble();
        double fullMark = sc.nextDouble();

        double ptc = MyMethods_EX1.calculatePCT(mark, fullMark);
        String status = MyMethods_EX1.getPCT(ptc);

        System.out.println("your ptc"+ +ptc + ", " + status);


    }
}
