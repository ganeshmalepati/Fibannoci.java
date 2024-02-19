import java.util.Scanner;

public class Fibannoci {
    static int Fib(int n){
        if(n<=1){
            return n;
        }
        return Fib(n-1) + Fib(n-2);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int r=Fib(i);                    //By declaring it to the var and accessing it.
            System.out.println(r);
            //System.out.println(Fib(i));      // we can directly access through the method Fib..
        }
    }
}


/*class Fibannoci{
    static void Fiba(int N){
        int n1=0;
        int n2=1;
        int cnt=0;
        while(cnt<N){
           System.out.println(n1);
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            cnt++;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Fiba(N);
    }
}
*/
