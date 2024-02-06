 import java.util.Scanner;
public class array_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bhai aapko kitna size chahiyee");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Bhiya Number dalo "+n+"BHAiya aapka number hai ");
        for(int i = 0;i <arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
