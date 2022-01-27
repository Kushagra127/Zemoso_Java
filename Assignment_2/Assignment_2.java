import java.util.Scanner;
//Time Complexity:- O(n)
//Space Complexity:- O(1)

public class Assignment_2 {
    public static boolean checkAll_AlphabetsPresent(String str)
    {
        boolean characterFlagArray[]=new boolean[26];
        int distinctCharacterCounter=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ') continue;
            int index=str.charAt(i)-'a';
            if(!characterFlagArray[index]) {
                characterFlagArray[index]=true;
                distinctCharacterCounter++;
            }
        }
        return distinctCharacterCounter == 26;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(checkAll_AlphabetsPresent(str.toLowerCase())) {
            System.out.println("All Characters Present");
        }
        else{
            System.out.println("All Characters Not Present");
        }

    }
}