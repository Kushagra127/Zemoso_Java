package Assignment_7;

public class RandomAssigner {
    public Rodent Assigner(){
        int randomNO=(int)(Math.random()*2)+1;
        return switch(randomNO){
            case 0 ->new Mouse();
            default ->new Hamster();
        };
    }
}
