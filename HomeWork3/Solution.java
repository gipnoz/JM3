package HomeWork3;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {

        Date startDate = new Date();
        Course[] course = new Course[6];
        course[0] = new Course("Lesson0", 20, "RoyRobson");
        course[1] = new Course("Lesson1", 20, "McDean");
        course[2] = new Course("Lesson2", 120, "Rory");
        course[3] = new Course("Lesson3", 200, "HollyMolly");
        course[4] = new Course("Lesson4", 2000, "Hendricks");
        course[5] = new Course(startDate, "Lesson5");


        Student st1 = new Student("Harry", "Smith", 200);

        Student st2 = new Student("MacDonald", course);



        CollegeStudent CS1 = new CollegeStudent("John", "Connor", 2);
        CollegeStudent CS2 = new CollegeStudent("Stevenson", 22, 222);
        CollegeStudent CS3 = new CollegeStudent("Not enough fantasy", course);



        SpecialStudent SS1 = new SpecialStudent("Lloyd", "Buck", 220);
        SpecialStudent SS2 = new SpecialStudent("Moose", course);
        SpecialStudent SS3 = new SpecialStudent(200000);

    }
}