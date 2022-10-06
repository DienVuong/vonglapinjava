import java.util.Scanner;

public class SNT {
    public static void main(String[] args) {
        Scanner snt = new Scanner(System.in);
        System.out.print("Enter a number");
        int number = snt.nextInt();
        if(number < 2){
            System.out.println(number + " is not a prime");
        }else{
            int i = 2;
            boolean check = true;
//            SNT chi sét đến căn bậc 2 của i
            while ( i < number) {
                if( number % i ==0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check)
                System.out.println(number + " is a prime");
            else
                System.out.println(number + "is not a prime");
        }
    }
}
