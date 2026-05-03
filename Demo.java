

class Student
{
    int rollno;
    String name;
    int marks;
}
                                        //array of objects
public class Demo
{
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.rollno = 1;
        s1.name = "Harsh";
        s1.marks = 100;

          Student s2 = new Student();

        s2.rollno = 2;
        s2.name = "Harsh";
        s2.marks = 100;

          Student s3 = new Student();

        s3.rollno = 1;
        s3.name = "Harsh";
        s3.marks = 100;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        System.out.println(s1.name +" : "+s1.marks);

         for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name+":"+students[i].marks);
        }

        /* int num[] = new int[6];
        num[0] = 2;
        num[1] = 3;
        num[2] = 5;
        num[3] = 4;
        num[4] = 5;

        */

    }
}