import java.util.Scanner;;

abstract class Employee{
    String name;
    int id;

    Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

    abstract double calculatesalary();

    void display(){
        System.out.println("Name of the employee:"+name);
        System.out.println("ID of the employee:"+id);
    }
}

    class FullTimeEmployee extends Employee{
        double monthlysalary;

        FullTimeEmployee(String name,int id,double monthlysalary){
            super(name,id);
            this.monthlysalary = monthlysalary;
        }

        double calculatesalary(){
        return monthlysalary;
        }
    }
        class PartTimeEmployee extends Employee{
            double hourlyrate;
            int hourWorked;

            PartTimeEmployee(String name,int id,double hourlyrate,int hourWorked){
                super(name,id);
                this.hourlyrate = hourlyrate;
                this.hourWorked = hourWorked;
            }

            double calculatesalary(){
                return hourlyrate * hourWorked;
            }
        }

public class Emply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Full time Employee
            System.out.println("Enter the Full time Employee details");
            System.out.println("Enter the name:");
            String name1 = sc.nextLine();
            System.out.println("Enter the id:");
            int id1 = sc.nextInt();
            System.out.println("Monthly Salary:");
            double salary1 = sc.nextDouble();

            FullTimeEmployee obj1 = new FullTimeEmployee(name1, id1, salary1);

        //Part time Employee
           System.out.println("Enter the Part time employee Details");
            sc.nextLine();
             System.out.println("Enter the name:");
             String name2 = sc.nextLine();
             System.out.println("ID:");
             int id2 = sc.nextInt();
             System.out.println("Hourly rated:");
             double rate = sc.nextDouble();
             System.out.println("Hourly Worked");
             int hour = sc.nextInt();

             PartTimeEmployee obj2 = new PartTimeEmployee(name2, id2, rate, hour);

             System.out.println("Full Employee Details:");
             obj1.display();
             System.out.println("Salary:\n"+obj1.calculatesalary());

             System.out.println("Part time Employee Details:");
             obj2.display();
             System.out.println("Salary:"+obj2.calculatesalary());

             sc.close();
    }
}
