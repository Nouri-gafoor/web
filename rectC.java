import java.util.Scanner;

public class rectC {
    double length;
    double width;

    rectC(double l,double w){
        length = l;
        width = w;
    }

    void calculateArea(double l,double w){
        double area = length * width;
        System.out.println("Area is:"+area);
    }
    void calculatePerimeter(double l,double w){
        double perimeter = 2*length*width;
        System.out.println("The perimeter:"+perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        int length = sc.nextInt();
        System.out.println("Enter the width:");
        int width = sc.nextInt();

        rectC obj = new rectC(length,width);
        obj.calculateArea(length, width);
        obj.calculatePerimeter(length, width);
        sc.close();
    }
}
