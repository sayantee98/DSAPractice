///WAP to find whether a number is a perfect square or not, if perfect then return the value else return the floor value.
//https://practice.geeksforgeeks.org/problems/square-root/1?page=1&category[]=Binary%20Search&sortBy=submissions
import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Long a =  sc.nextLong();
        double l = Math.sqrt(a);
        System.out.println((l));
    }
}
