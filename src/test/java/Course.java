public class Course {
    String courseName;
    Course(){
        Course c= new Course();
        c.courseName="Oracle";
    }
}

class e{
    public static void main(String[] args) {
        Course c= new Course();
        c.courseName="java";
        System.out.println(c.courseName);

    }
}
