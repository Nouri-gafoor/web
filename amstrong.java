import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int org = num;

        System.out.println("The number is:"+num);
        int result=0,rem=0;

        while(num!=0){
            rem=num%10;
            result+=Math.pow(rem, 3);
            num=num/10;
        }
        if(result==org){
            System.out.println("The number is amstrong");
        }else{
            System.out.println("The number is not amstrong");
        }
        sc.close();
    }
}
