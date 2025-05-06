import java.util.Scanner;

class InvalidGradeException extends Exception{
    InvalidGradeException(String message){
        super(message);
    };
}

public class Sgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Grade between (A-F) :");
        char grade = sc.next().toUpperCase().charAt(0);
        try{
            if(grade < 'A' || grade > 'F'){
                throw new InvalidGradeException("Grade must be between A and F");
            }else{
                System.out.println("Valid grade");
            }
        }catch(InvalidGradeException e){
            System.out.println("Invalid Grade:"+e.getMessage());
        }
        sc.close();

    }
    
}
