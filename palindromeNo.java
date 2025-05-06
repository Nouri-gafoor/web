import java.util.Scanner;

public class palindromeNo {
    public static void main(String[] args) {
        int rem=0,rev=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int N=obj.nextInt(); 
        int org=N;

        while (N>0) {
            rem=N%10;
            rev=rev * 10 + rem;
            N=N/10;     
        }
        if(rev==org){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not plaindrome");
        }
        obj.close();
    }

}
    
