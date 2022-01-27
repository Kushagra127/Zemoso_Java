import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Assignment_11 {
    public static void main(String[] args) {
        Scanner infile;
        try {
            infile=new Scanner(new File("Assignment 11/input.txt"));
            PrintWriter pw=new PrintWriter("Assignment 11/output.txt");
            HashMap<Character,Integer> mp=new HashMap<>();
            char input;
            while(infile.hasNext()){
           input=infile.next().charAt(0);
//                int count = mp.containsKey(input) ? mp.get(input) : 0;
//                mp.put(input, count + 1);
                mp.merge(input,1,Integer::sum);
            }
            pw.print(mp);
            infile.close();
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("file not found");
        }
    }
}
