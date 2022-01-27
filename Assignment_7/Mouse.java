package Assignment_7;

public class Mouse extends PrintInformation implements Rodent{
    public Mouse(){
        super(Mouse.class.getSimpleName(),"class");
    }
    @Override
    public void location() {
        System.out.println("All countries");
    }

    @Override
    public void eat() {
        System.out.println("Seeds and insects");
    }

    @Override
    public void tail() {
        System.out.println("Small Tail");
    }
}
