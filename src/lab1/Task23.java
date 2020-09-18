package lab1;

public class Task23 {
    public static void main(String[] args) {
        createUniversities();
    }
    private static void createUniversities() {
        University university1 = new University("UTM", 1964);
        University university2 = new University("USM", 1946);
        University university3 = new University("USMF", 1945);

        Student student1 = new Student("Alexei", 20, 9.7f);
        Student student2 = new Student("Mihaela", 21, 7.8f);
        Student student3 = new Student("Dorin", 20, 8.1f);
        Student student4 = new Student("Mihai",22, 9.9f);
        Student student5 = new Student("Andreea", 20 ,8.3f);
        Student student6 = new Student("Diana", 19, 9.5f);

        // adds a student to an university object
        university1.addStudents(student3);
        university1.addStudents(student5);
        university2.addStudents(student2);
        university2.addStudents(student6);
        university3.addStudents(student1);
        university3.addStudents(student4);

        float avarageMark = university1.averageUniversityMark() + university2.averageUniversityMark() + university3.averageUniversityMark();

        university1.showStudents();

        university1.showUniversity();

        System.out.println(university1.averageUniversityMark());
        System.out.println(university2.averageUniversityMark());
        System.out.println(university3.averageUniversityMark());
        System.out.println(avarageMark / 3);
    }
}
