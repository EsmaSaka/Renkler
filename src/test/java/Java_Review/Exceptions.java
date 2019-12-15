package Java_Review;

class ExceptionsReview {
    public static void main(String[] args) {

       try {
            String str[] = {"one", "two", "four"};
           System.out.println(str[3]);
       }catch(Exception e){
            e.getStackTrace();
           System.out.println("Wrong index");
       }
        System.out.println("after array");
    try {
        int a = 100;
        int b = a / 0;
        System.out.println(b);
    }catch (ArithmeticException e){
        System.out.println(e.getMessage());
    }

    }





}
