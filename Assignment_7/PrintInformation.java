package Assignment_7;

public class PrintInformation {
    public PrintInformation(String name,String mode){
        switch (mode) {
            case "class" -> System.out.println(name + " class generated");
            case "location" -> System.out.println("The location is " + name);
            case "eat" -> System.out.println("It eats " + name);
            case "tail" -> System.out.println("The tail type is " + name);
            default -> System.out.println("Information not available");
        }
//        public  PrintInformation() {
//            System.out.println("Welcome to Print Information Class");
//        }
    }
}
