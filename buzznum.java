import java.util.*;
public class buzznum {
    public static void main(String[] args){
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter the number to be checked:");
    int num = ob.nextInt();
    
    if (num%10 == 7 || num%7 == 0) {
        System.out.println(num + " number is a buzz number.");

}
else
 {
    System.out.println(num + " number is not a buzz number.");
 }
}

 }

 
