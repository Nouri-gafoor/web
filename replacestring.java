import java.util.Scanner;

public class replacestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text");
        String text = sc.nextLine();

        System.out.println("Enter the patter to search");
        String patter = sc.nextLine();

        if(text.contains(patter)){
            System.out.println("The pattern is in the text");
        }else{
            System.out.println("The patter not is in the text");
            sc.close();
            return;
        }

        System.out.println("Enter the text to replace:");
        String replace = sc.nextLine();

        String result = text.replace(patter, replace);
        System.out.println("The replaced text is:"+result);
        sc.close();

    }
}
