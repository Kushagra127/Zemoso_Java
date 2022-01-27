////use file related methods
//import java.io.File;
//import java.util.Scanner;
//
//public class Assignment_1{
//
//    private void findFile()
//    {
//        File file = new File("");
//        String str ;
//        Scanner in = new Scanner(System.in);
//        do{
//            int ab =0;
//            System.out.println("ENTER THE NAME OF FILE OR FOLDER");
//            str =in.nextLine();
//            String files[] = file.list();
//            //continous check each file or folder
//            for (String string : files){
//                //check the name of file present or not and store in boolean str1
//                Boolean str1 = str.equals(string);
//                // str1 is true than print the following
//                if (str1){
//                    ab = 1;
//                    System.out.println("File Found : ");
//                    System.out.println(string);
//                    //print the address of the file
//                    System.out.println("Path : "+ file.getAbsolutePath());
//                }
//            }
//            //if file not found
//            if(ab == 0)
//            {
//                System.out.println("File not find : Reenter the name of the file.");
//            }
//        } while(true);
//    }
//
//    //declared main()
//    public static void main(String[] args){
//        //object of Demo class is created
//        Assignment_1 obj =new Assignment_1();
//        //calling the findFile()
//        obj.findFile();
//    }
//}
import java.io.File;
import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        File file=new File("Assignment 11");
        Scanner in=new Scanner(System.in);
        String str;
        boolean flag=false;
        do{
            System.out.println("ENTER THE NAME OF FILE OR FOLDER");
            str=in.nextLine();
            String [] files=file.list();

            for(String name:files)
            {
                boolean found=name.toLowerCase().contains(str.toLowerCase());
                if(found) {
                    System.out.println(name + " found at " + file.getAbsolutePath());
                    flag=true;
                }
            }
            if(!flag) {
                System.out.println("file not found");
                System.out.println("Reenter the name and try again");
            }

        }while(true);
    }
}