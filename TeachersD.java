import java.util.Scanner;

class person{
    String name;
    String gender;
    String address;
    int age;

    person(String name,String gender,String address,int age){
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;
    }
}

class Employee extends person{
    int empid;
    String cmpname;
    String qualification;
    double salary;

    Employee(String name,String gender,String address,int age,int empid,String cmpname,String qualification,double salary){
        super(name,gender,address,age);
        this.empid=empid;
        this.cmpname=cmpname;
        this.qualification=qualification;
        this.salary=salary;
    }
}

class Teacher extends Employee{
    String subject;
    String depart;
    int teacherid;

    Teacher(String name,String gender,String address,int age,int empid,String cmpname,String qualification,double salary,String subject,String depart,int teacherid){
        super(name, gender, address, age, empid, cmpname, qualification, salary);
        this.subject=subject;
        this.depart=depart;
        this.teacherid=teacherid;
    }

    void display(){
        System.out.println("Teacher Details:");
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Address:"+address);
        System.out.println("Age:"+age);
        System.out.println("Employee id:"+empid);
        System.out.println("Company name:"+cmpname);
        System.out.println("Qualification:"+qualification);
        System.out.println("Salary:"+salary);
        System.out.println("Subject:"+subject);
        System.out.println("Department:"+depart);
        System.out.println("Teacher id:"+teacherid);
    }
}


public class TeachersD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of teacher:");
        int n = sc.nextInt();
        Teacher[] t = new Teacher[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
        System.out.println("Teacher Details"+(i+1)+":");
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Gender:");
        String gender = sc.nextLine();
        System.out.println("Address:");
        String address = sc.nextLine();
        System.out.println("Age:");
        int age =sc.nextInt();
        System.out.println("Employee id:");
        int empid = sc.nextInt();
        sc.nextLine();
        System.out.println("Company name:");
        String cmpname = sc.nextLine();
        System.out.println("Qualification:");
        String qualification = sc.nextLine();
        System.out.println("Salary:");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Subject:");
        String subject = sc.nextLine();
        System.out.println("Department:");
        String depart = sc.nextLine();
        System.out.println("Teachers ID:");
        int teacherid = sc.nextInt();
        sc.nextLine();

        t[i]=new Teacher(name,gender,address,age,empid,cmpname,qualification,salary,subject,depart,teacherid);

        }

        System.out.println("Display teachers Details:");
        for(Teacher teach:t){
            teach.display();
        }
        sc.close();
    }
}
