import java.util.*;
public class NumberOfDigits{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Count=0;
        while(num>0){
            num=num/10;
            ++Count;
        }
        System.out.println("Number of Digits is : " + Count);
    }
}