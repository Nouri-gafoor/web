import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        String grade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your garde in percentage:");
        int percent = sc.nextInt();

        if(percent>=90){
            grade = "A";
        }else if(percent>=80 && percent<89){
            grade = "B";
        }else if(percent>=70 && percent<79){
            grade = "C";
        }else if(percent>=60 && percent<69){
            grade = "D";
        }else{
            grade = "F";
        }

        switch(grade){

            case "A" : System.out.println("Excellent work");
            break;

            case "B" : System.out.println("Good job");
            break;
            
            case "C" : System.out.println("You can do better");
            break;

            case "D" : System.out.println("Work Harder");
            break;

            case "F" : System.out.println("Failed , Try again");
            break;
    }
    sc.close();
            
    }

    
}
    
