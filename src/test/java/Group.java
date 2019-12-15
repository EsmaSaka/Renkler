import java.util.Arrays;

public class Group {
    public static void main(String[] args) {
        Group var= new Group();
        var.ArrVa(args);

    }
    void ArrVa(String[] arr){
        try {
            System.out.println(Arrays.toString(arr));
           // System.out.println(arr[0]+":"+arr[1]);
        }catch (NullPointerException e){
            System.out.println("nilpoi");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Arra");
        }catch (IndexOutOfBoundsException e){
            System.out.println("index");
        }
    }
}
