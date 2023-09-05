///WAP to find whether a number is a perfect square or not.
import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Long a =  sc.nextLong();
        double l = Math.sqrt(a);
        System.out.println((l));
    }
}
