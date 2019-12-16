import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThrowNew {
    public  static void vote(Citizen citizen){
        if (citizen.getAge()<18){
            throw new ArithmeticException(citizen.getName()+" is not eligible for voting");
        }
            System.out.println(citizen.getName()+" is eligible for voting");

    }

    public static void main(String[] args) {
      //  throw new RuntimeException();
       //  throw new IllegalArgumentException("invalid input");
     /*   vote(new Citizen("esma",35));
        try {
            vote(new Citizen("es", 17));
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }   */
      //  System.out.println(new Citizen("yu",45));
        List<Citizen> voters= new ArrayList<>();
        voters.add(new Citizen("ayse",40));
        voters.add(new Citizen("Ahmet",37));
        voters.add(new Citizen("Fatih",10));
        voters.add(new Citizen("Veysel",33));
        voters.add(new Citizen("meryem",13));
        voters.add(new Citizen("Hafize",60));

        for (Citizen each: voters) {
            try {
                vote(each);
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }

        }


    }
}
