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
        vote(new Citizen("esma",35));
        try {
            vote(new Citizen("es", 17));
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
      //  System.out.println(new Citizen("yu",45));
    }
}
