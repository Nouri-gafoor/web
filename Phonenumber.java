import java.util.Scanner;

class Phonevalidation{
   String number;

    Phonevalidation(String phone){
        number = phone;
    }

    void validation() throws Exception{

        if(number.length() !=10 || !number.matches("\\d{10}")){
            throw new Exception("Phone number shoud be 10 digits");
        }
        
    }

}

public class Phonenumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the phone number");
        String phn = sc.nextLine();

        Phonevalidation obj = new Phonevalidation(phn);
        
        try{
            obj.validation();
            System.out.println("Phonenumber is valid");
        }catch(Exception e){
            System.out.println("Invalid Phone number:"+e.getMessage());
        }
        sc.close();
    }
    
}
