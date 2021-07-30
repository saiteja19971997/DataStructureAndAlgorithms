import java.util.Scanner;

class DArray{
    
    int[][] arr;
    int lastans;
    DArray(int N){
    	arr = new int[N][];
        for(int i=0;i<N;i++){
            arr[i]=new int[3];
        }
    }
    
    public void printArray(int N)
    {
    	int temp[][]=this.arr;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<3;j++){
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int Q= sc.nextInt();
        DArray da = new DArray(N);
        da.printArray(N);
        
        
        
        
    }
}