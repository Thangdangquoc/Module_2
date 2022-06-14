package Phuongtrinhb2;

public class QuadraticEquation {
    private  double a, b, c;
    double delta = Math.pow(b,2)-4*a*c;
    public QuadraticEquation(double a, double b, double c ){
        this.a =a;
        this.b =b;
        this.c =c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
     return delta = b*b - 4*a*c;
    }
    public  double getRoot1(){
        return (-b+Math.sqrt(delta))/ (2*a);
    }
    public  double getRoot2(){
        return (-b-Math.sqrt(delta))/ (2*a);
    }
}
