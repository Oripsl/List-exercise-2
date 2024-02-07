import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListExercise2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Carlo", 14),
                new Student("Piero", 15),
                new Student("Pino", 17),
                new Student("Andromeda", 12),
                new Student("Francesco", 13),
                new Student("Filippo", 18),
                new Student("Aurelie", 19),
                new Student("Colinne", 13),
                new Student("Jeanne", 12),
                new Student("Claire", 19),
                new Student("Samantha", 14),
                new Student("Carla", 16)
        ));

        System.out.println("Array before sorting");
        System.out.println(students);

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("Array after sorting by name");
        System.out.println(students);


        students.sort(Comparator.comparingInt(Student::getAge));


        System.out.println("Array after sorting by age");
        System.out.println(students);

    }
}
