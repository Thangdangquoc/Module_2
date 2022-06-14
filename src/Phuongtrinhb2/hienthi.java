package Phuongtrinhb2;

import java.util.Scanner;

public class hienthi {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập giá trị a: ");
        double a = sr.nextDouble();
        System.out.println("Nhập giá trị b: ");
        double b = sr.nextDouble();
        System.out.println("Nhập giá trị c: ");
        double c = sr.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("Phương trình có 2 nghiệm phân biệt là x1= "+ quadraticEquation.getRoot1()+"x2="+quadraticEquation.getRoot2() );
        } else if (quadraticEquation.getDiscriminant()==0) {
            System.out.println( "Phương trình có 1 nghiệm là "+ quadraticEquation.getRoot1());
        }else {
            System.out.println("Phương trình vô nghiệm!");
        }

    }

}
