import java.util.Scanner;
public class vc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the text:");
        String text = sc.nextLine().toLowerCase();

        int vowels=0,conconants=0;

        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }else{
                conconants++;
            }
        }
        System.out.println("Vowels are:"+vowels);
        System.out.println("Consonants are:"+conconants);
        sc.close();
    }
    
}
