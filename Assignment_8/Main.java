package Assignment_8;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExceptionJava exp=new ExceptionJava();
        Scanner sc=new Scanner(System.in);
        String int_var;
        while(true)
        {
            int_var=sc.nextLine();
            if(is_Integer(int_var))
                break;
            else{
                System.out.println("Enter a digit between 1 and 3");
            }
        }
        try {
            exp.through(Integer.parseInt(int_var));
        }
        catch (Exception ex){
            System.out.println("Exception Caught");
            System.out.println(ex);
        }
        finally {
            System.out.println("Block Exceuted");
        }
    }

    private static boolean is_Integer(String int_var) {
        try {
            Integer.parseInt(int_var);
            if(Integer.parseInt(int_var)>3)
            {
                return false;
            }
            return true;
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number Format Exception");
            return false;
        }
    }
}
