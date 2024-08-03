import java.util.Scanner;

public class FuncS {

    public static int calMulti(int a,int b){
     
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Multi is: "+calMulti(a, b));
    }
}