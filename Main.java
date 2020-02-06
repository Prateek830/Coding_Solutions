import java.util.Scanner;
public class Main
{
    void m(int n, int ar[]){
        int temp,i;
        temp=ar[0];
        for(i=0;i<n-1;i++){
            ar[i]=ar[i+1];
        }
        ar[i]=temp;
    }
    
    
    void m1(int n,int d,int ar[]){
        for(int i=0;i<d;i++){
            m(n,ar);
        }
    }
    
    void m2(int n,int ar[]){
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Main main=new Main();
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int ar[]=new int[n];
		    for(int j=0;j<n;j++){
		        ar[j]=sc.nextInt();
		    }
		    int d=sc.nextInt();
		    main.m1(n,d,ar);
		    main.m2(n,ar);
		}
	}
}
