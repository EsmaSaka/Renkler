public class tryFinally {
    int abc() {


    int a = 10;
        try

    {
        ++a;
    }finally

    {
        a++;
    }
        return a;
}

    public static void main(String[] args) {
        System.out.println(new tryFinally().abc());
        System.out.println("rolex".toUpperCase());
    }
}
