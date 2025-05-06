import java.util.Scanner;;

public class Stringpalindorm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the text");
        String text = sc.nextLine().toLowerCase();

        String reverse = new StringBuilder(text).reverse().toString();

        if(text.equals(reverse)){
            System.out.println("Text is palindrome");
        }else{
             System.out.println("Text is not Palindrome");
        }
        sc.close();
    }
    
}
