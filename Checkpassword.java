import java.util.Scanner;

class Passwordvalidation{
    String password;

    Passwordvalidation(String password){
        this.password = password;
    }

    void password() throws Exception{
        int length = password.length();
        int numbercount = 0;
        int specialCcount=0;

        if(length<8){
            throw new Exception("Password must be at least 8 characters");
        }

        for(int i=0;i<length;i++){
            char ch = password.charAt(i);

            if(Character.isDigit(ch)){
                numbercount++;
            }

            if(ch=='$' || ch=='#' ||ch=='&' || ch==')'){
                specialCcount++;
            }
        }

        if(numbercount==0){
            throw new Exception("Password must be alteast one number");
        }
        if(specialCcount==0){
            throw new Exception("Password must be alteast one special character(#,$,&,)");
        }
        
    }

}

public class Checkpassword{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the password");
        String pass = sc.nextLine();

        Passwordvalidation obj = new Passwordvalidation(pass);
        
        try{
            obj.password();
            System.out.println("Password is valid");
        }catch(Exception e){
            System.out.println("Invalid password:"+e.getMessage());
        }
        sc.close();
    }
    
}
