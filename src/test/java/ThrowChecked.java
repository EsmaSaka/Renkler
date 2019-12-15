import java.io.IOException;

public class ThrowChecked {

    public static void main(String[] args) {
        try{
            System.out.println("about");
            throw new IOException();
           // System.out.println("esma"); dead code
        }catch (Exception e){
            System.out.println("caught");
            e.printStackTrace();
        }
        System.out.println("After ++++++++++++++++");

    }

}
