//so the question will be

/*public class test{
    public static void main(String[] arr){
        int num1 = 100;
        int num2 = 100;
        int num3 = 500;
        int num4 = 500;
          
        if(num1==num2){
            System.out.println("num1 == num2");
        }
        else{
            System.out.println("num1 != num2");
        }
        if(num3 == num4){
            System.out.println("num3 == num4");
        }
        else{
            System.out.println("num3 != num4");
        }
    }
}
*/

import java.util.*;
public class test {
    public static void main(String[] args)
    {
        int num1 = 100;
        int num2 = 100;
        int num3 = 500;
        int num4 = 500;
        String result;

        result = (num1 != num2 && num3 != num4) ? "true" : "false";
        System.out.println(result);
    }
}