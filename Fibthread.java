import java.util.Scanner;

class Fibanocci implements Runnable{
    private int n;

    public Fibanocci(int n){
        this.n = n;
    }

    @Override
    public void run(){
        int f1=0,f2=1,f3;
        System.out.println("Fibanocci series:");
        System.out.print(f1+" "+f2);
        for(int i=0;i<n-2;i++){
            f3=f1+f2;
            System.out.print(" " +f3);
            f1=f2;
            f2=f3;

            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println("Fibanocci generation interrupted");
                return;
            }
        }
        System.out.println();
    }
}

class Even implements Runnable{
    private int start;
    private int end;

    public Even(int start,int end){
        this.start=start;
        this.end=end;
    }

    @Override
    public void run(){
        System.out.println("Even number in the range:"+start+"  to "+end);
        for(int i=start;i<=end;i++){
            if(i%2==0){
                System.out.print(i+ " ");
            }
            try{
                Thread.sleep(150);
            }catch(InterruptedException e){
                System.out.println("Even number generation interrupted");
                return;
            }
        }
        System.out.println();
    }
}

public class Fibthread {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the limit for fibanocci:");
        int limit = sc.nextInt();
        System.out.println("Enter the starting range for even number:");
        int start=sc.nextInt();
        System.out.println("Enter the ending range for even number");
        int end=sc.nextInt();
        
        Fibanocci obj1 = new Fibanocci(limit);
        Even obj2 = new Even(start, end);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        try{
            t1.start();
            t1.join();

            t2.start();
            t2.join();
            
            System.out.println("Both threads have finished");
        }catch(InterruptedException e){
        System.out.println("Main thread interrupted");
    }finally{
        sc.close();
    }
    }
    
}
