import java.util.Scanner;
public class symmatric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the matrix");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matirx is:");
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
           }
           System.out.println();
        }
        //Symmatric check
        int flag=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] != arr[j][i]){
                    flag=0;
                    break;
                }
            }
        }
        if(flag==1){
            System.out.println("Matrix is Symmatric");
        }else{
            System.out.println("Matrix is not symmatric");
        }
        sc.close();
    }
    
}
