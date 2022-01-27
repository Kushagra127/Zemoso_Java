package Assignment_7;

import java.util.ArrayList;

public class RodentMain {
    public static void main(String[] args) {
        ArrayList<Rodent>species=new ArrayList<>();
        for(int i=0;i<4;i++){
            species.add(new RandomAssigner().Assigner());
        }
        for (int i=0;i<4;i++){
            species.get(i).location();
            species.get(i).eat();
            species.get(i).tail();
            System.out.println();
        }
    }

}
