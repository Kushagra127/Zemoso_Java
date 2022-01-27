package Assignemnt_10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SList<String> sl = new SList<>();
        System.out.println(sl);
        SListIterator<String> Iter = sl.iterator();
        int choice;
        Scanner sc = new Scanner(System.in);
        String input;
        outer:while(true){
            System.out.println("enter 1 to insert element :");
            System.out.println("enter 2 to remove element :");
            System.out.println("enter 3 to move to next element :");
            System.out.println("enter 4 to check it has element :");
            System.out.println("enter 5 to get the element at specific position :");
            System.out.println("enter 6 to print the element of list :");
            System.out.println("enter anythings integer(>6) to get out or press" +"^C");
            System.out.println("Enter your desired input: ");
            choice= sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("enter the  element you want to be inserted in the list");
                    input = sc.nextLine();
                    Iter.insert(input);
                    break;
                case 2:
                    System.out.println("one element is removed");
                    Iter.remove();
                    break;
                case 3:
                    Iter.Next();
                    break;
                case 4:
                    System.out.println(Iter.hasNext());
                    break;
                case 5:{
                    System.out.println("enter the position to excess that element (only integer less than no in list)");
                    int index=sc.nextInt();
                    sc.nextLine();
                    System.out.println("At given index: " +Iter.currentElement(index));
                    break;
                }
                case 6:
                    System.out.println("list: " + sl);
                    break;
                default:
                    System.out.println("Thank You for your time");
                    break outer;

            }

        }

    }
}