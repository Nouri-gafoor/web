import java.util.Scanner;

public class studentC {
    int studentID;
    String name;
    double marks;

    studentC(int stid,String namee,double mark){
        studentID = stid;
        name = namee;
        marks = mark;
    }

    void displayDetails(){
        System.out.println("Student ID :"+studentID);
        System.out.println("Name of the student :"+name);
        System.out.println("Mark of the student :"+marks);
    }

    void isPassed(double marks){
        if(marks >= 40){
            System.out.println("Status : Passed");
        }else{
            System.out.println("Status : Failed");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int std = sc.nextInt();

        for(int i=1;i<=std;i++){
        System.out.println("Enter the StudentID:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the student name:");
        String name = sc.nextLine();
        System.out.println("Enter the mark:");
        double mark = sc.nextDouble();

        studentC obj = new studentC(id,name,mark);
        obj.displayDetails();
        obj.isPassed(mark);
        }
        sc.close();
    }
}
