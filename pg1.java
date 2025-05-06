import java.util.Scanner;

public class pg1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the radius:");
        int radius = sc.nextInt();
        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;
        System.out.println("The area of the circle is:"+area);
        System.out.println("The perimeter of the circle is:"+perimeter);
        sc.close();
    }
}