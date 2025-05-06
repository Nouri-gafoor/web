import java.util.Scanner;

public class rect{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the legnth:");
        int l = sc.nextInt();
        System.out.println("Enter the breadth:");
        int b = sc.nextInt();
        
        int area = l * b;
        int perimeter = 2 * l * b;

        System.out.println("The area of the rectangle is:"+area);
        System.out.println("The perimeter of the rectangle:"+perimeter);
        sc.close();
    }
}
