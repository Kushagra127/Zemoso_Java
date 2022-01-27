// Java program for ping using sub-process
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Assignment_3
{
    static int calculateMedian(ArrayList<Integer> timeTakenToPing)
    {
        int length=timeTakenToPing.size();
        if(length==0) return -1;
        Collections.sort(timeTakenToPing);
        if(length%2==1) {
            return timeTakenToPing.get(length/ 2);
        }
        return (timeTakenToPing.get(length / 2) + timeTakenToPing.get((length / 2) - 1))/2;

    }
//    method to fetch ping time for each ping request

    static int fetchPingTime(String request) {
        int time=0;
        int i=request.length()-1;
        while(i>=0 && request.charAt(i)!='=') {
            i--;
        }
        i++;
        while(i<request.length() && request.charAt(i)!='m')
        {
            int digit=request.charAt(i)-'0';
            time=time*10+digit;
            i++;
        }
        return time;
    }

    // method for finding the ping statics of website
    static void commands(ArrayList<String> commandList)throws Exception
    {
        // creating the sub process, execute system command
        ProcessBuilder build = new ProcessBuilder(commandList);
        Process process = build.start();

        // to read the output
        BufferedReader input = new BufferedReader(new InputStreamReader
                (process.getInputStream()));
        BufferedReader Error = new BufferedReader(new InputStreamReader
                (process.getErrorStream()));
        String s = null;

        System.out.println("Standard output: ");
        ArrayList<Integer> timeTakenForPing=new ArrayList<Integer>();
        while((s = input.readLine()) != null)
        {
            System.out.println(s);
            if(s.length()>0 && s.charAt(0)=='R' && s.charAt(2)=='p')
            {
                int time=fetchPingTime(s);
                timeTakenForPing.add(time);
            }
        }
        System.out.println("error (if any): ");
        while((s = Error.readLine()) != null)
        {
            System.out.println(s);
        }

        int median=calculateMedian(timeTakenForPing);
        if(median==-1) System.out.println("Unable to reach the host");
        else System.out.println("Median time taken to ping the host is " + median);
    }

    // Driver method
    public static void main(String args[])throws Exception
    {
        // creating list for commands
        ArrayList<String> commandList = new ArrayList<>();

        commandList.add("ping");
        // can be replaced by IP
        commandList.add("www.google.com");

        Assignment_3.commands(commandList);
    }
}