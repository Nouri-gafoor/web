import java.util.Scanner;

public class emsalary {
    public static void main(String[] args) {
        double salary = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("1)Manager\n2)Developer\n3)Intern");
        System.out.println("Enter your role(1,2,3):");
        int role = sc.nextInt();

        switch (role) {
            case 1:
                salary = 50000;
                break;
            case 2:
                salary = 30000;
                break;
            case 3:
                salary = 15000;
                break;
            default:
                System.out.println("Invalid role ,Please enter a valid role(1,2,3)");
                break;
        }

        System.out.println("Enter the year of experience");
        int yr = sc.nextInt();
 
        if(yr >= 3 && yr <=5){
            salary = (salary*10)/100 + salary;
            System.out.println("Salary is:"+salary);
        }else if(yr > 5){
            salary = (salary*20)/100 + salary;
            System.out.println("Salary is:"+salary);
        }else{
            System.out.println("Salary is:"+salary);
        }
        sc.close();
    }
}
