import java.util.Scanner;

public class studentegb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mark for Maths:");
        double maths = sc.nextInt();
        System.out.println("Mark for Physics:");
        double phy = sc.nextInt();
        System.out.println("Mark for Chemistry:");
        double chem = sc.nextInt();
        double total = maths + phy + chem;
        double total_two = maths + phy;

        System.out.println("The total mark for three subject:"+total);
        System.out.println("The total mark for maths and physics:"+total_two);
        
        //eligibility check 

        if(maths >= 60 && phy >= 50 && chem >= 40 && total >= 200 || total_two >= 150){
                    System.out.println("The student got eligible mark");
                }else{
                    System.out.println("The student not got eligible mark");
                }
        sc.close();
    }
}

