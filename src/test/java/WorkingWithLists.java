import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    @Test
    public void createAndWorkWithLists() {
        Student valera = new Student();
        valera.setFirstName("Valera");
        valera.setLastName("The Tester");
        valera.setEmail("valerunchik@test.lv");
        valera.setPhone("+37123232323");

        Student liga = new Student("Liga", "Ivanova", "Liga@test.lv", "+37129885151");
        Student dimko = new Student("Dimko", "Skatinishe", "omg@test.lv", "911");
        Student artis = new Student("Artis", "GreatTest", "", "112");



        List<Student> students = new ArrayList<>();
        students.add(valera); //0
        students.add(liga);   //1
        students.add(dimko);  //2
        students.add(artis);  //3

        //---------------------------------------FOR---------------------------------
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getFirstName());
        }

        //-------------------------------------FOREACH-------------------------------
        for (Student s : students) {
//            System.out.println(s.getFirstName() + " " +s.getLastName());
            System.out.println(s.getFullName());
        }

        //----------------------FOREACH with IF---------------------------------------
        System.out.println("Printing students with phone nr starting with +371:");
        for (Student s : students) {
            if (s.getPhone().startsWith("+371")) {
                System.out.println(s.getFullName());
            }
        }
    }
}
