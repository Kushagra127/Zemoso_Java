package Assignment_8;

public class ExceptionJava {
    public void through(int i) throws Exception1,Exception2,Exception3 {
        if(i==1){
            System.out.println("Exception1 is thrown");
            throw new Exception1();
        }
        else if(i==2){
            System.out.println("Exception2 is thrown");
            throw new Exception2();
        }
        else if(i==3){
            System.out.println("Exception3 is thrown");
            throw new Exception3();
        }
           else {
            System.out.println("i out of range");
            throw new NullPointerException();
        }
    }
}
