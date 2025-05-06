import java.util.Scanner;

public class fibanocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number limit:");
        int num = sc.nextInt();

        int fact1 = 0;
        int fact2 = 1;
        System.out.println("The Fibanocci are:");
        System.out.println(fact1);
        System.out.println(fact2);

        for(int i=0;i<num-2;i++){
            int fact3 = fact1 + fact2;
            System.out.println(fact3);
            fact1=fact2;
            fact2=fact3;
        }
        sc.close();
        }

        }
