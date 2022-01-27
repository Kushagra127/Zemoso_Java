package Assignment_7;

public class Hamster extends PrintInformation implements Rodent{
    public Hamster(){
        super(Hamster.class.getSimpleName(),"class");
    }
    @Override
    public void tail() {
        System.out.println("Very Thin Tail");
    }

    @Override
    public void location() {
        System.out.println("Western Countries");
    }

    @Override
    public void eat() {
        System.out.println("Eat Plants");
    }
}
