import java.util.Scanner;

public class Login {

     public static  final  String USERID="googleuser";
     public static  final  String PASSWORD="JAVA";
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter Id : ");
        String userId= scanner.next();
        System.out.println("enter pw : ");
        String pw= scanner.next();
        if(! userId.equalsIgnoreCase(USERID)){
            throw new RuntimeException("user id does not match : "+userId);
        }
        if(! pw.equals(PASSWORD)){
            throw new RuntimeException("pw does not match:" +pw);
        }
        System.out.println("all done. Welcome google user : "+userId);


    }
}
