package oopIntro;

public class Main {
    public static void main(String[] args) {

        Course c1 = new Course("Programlamaya Giriş İçin Temel Kurs","Ücretsiz","Engin Demirog");
        Course c2 = new Course("C#-Angular","Ücretsiz","Engin Demirog");
        Course c3 = new Course("Java-React","Ücretsiz","Engin Demirog");

        Course courses[] = new Course[3];

        courses[0] = c1;
        courses[1] = c2;
        courses[2] = c3;

        for (Course s : courses) {
            System.out.println("kurs adı: "+ s.getCourseName()
            + "\nkurs ücreti: "+ s.getCoursePrice() + "\nkursiyer: " + s.getInstructor()
            );
            System.out.println("----------------------");
        }
        Work.programaDahilOl();
        Work.bitirVeDevamEt();
    }
}
