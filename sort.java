import java.util.Arrays;
import java.util.Scanner;
public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of string");
        int n = sc.nextInt();
        sc.nextLine();
        String[] array = new String[n];
        System.out.println("Enter the text to be sort");
        for(int i=0;i<n;i++){
            array[i] = sc.nextLine();
        }
        Arrays.sort(array);
        System.out.println("Sorted array");
        for(String word : array){
            System.out.println(word);
        }
        sc.close();
    }
    
}
