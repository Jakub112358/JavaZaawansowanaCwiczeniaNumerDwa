package Task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    // Na podstawie struktury klas uczniów w szkolę napisz mechanizm,
    // który zwróci wszystkich uczniów danej szkoły.
    // Każda szkoła zawierać ma listę klas szkolnych,
    // a każda klasa szkolna powinna zawierać listę uczniów.
    public static void main(String[] args) {
        //tworzenie klas szkolnych z uczniami:
        SchoolClass classIA = new SchoolClass();
        classIA.addStudent(new Student("Bob Dylan", 12));
        classIA.addStudent(new Student("John Travolta", 8));
        classIA.addStudent(new Student("Jan Kowalski", 8));

        SchoolClass classIB = new SchoolClass();
        classIB.addStudent(new Student("Grzegorz Brzęczyszczykiewicz", 9));
        classIB.addStudent(new Student("Will Smith", 9));
        classIB.addStudent(new Student("Arnold Schwarzenegger", 6));
        //tworzenie szkoły z klasami
        School school = new School();
        school.setSchoolClasses(new ArrayList<>(Arrays.asList(classIA, classIB)));

        //tworzenie listy wszystkich studentów ze szkoły:
        List<Student> allStudentsList = school.getSchoolClasses().stream()
                .flatMap(schoolClass -> schoolClass.getStudents().stream())
                .collect(Collectors.toList());

        //wyświetlanie wszystkich studentów:
        System.out.println(allStudentsList);
    }
}
