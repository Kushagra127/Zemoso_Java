import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String currentRegex="^[A-Z]+[a-zA-Z0-9._ ]*[.]+";
        Pattern pattern=Pattern.compile(currentRegex);
        Matcher matcher=pattern.matcher(input);
        boolean matchFound=matcher.find();
        if(matchFound){
            System.out.println("Match Found");
        }
        else{
            System.out.println("Match Not Found");
        }
    }
}
