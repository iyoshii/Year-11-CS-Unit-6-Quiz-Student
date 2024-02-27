public class StudentMaker {

  private static int age;
  private static String firstName;
  private static String lastName;
  private static int year;
  
  public static void main(String[] args) {
    Address address = new Address();
    Student student = new Student(age, firstName, lastName, year, address);

    student.setFirstName("Bella");

    student.getFirstName();
    System.out.println(age);

    int age = student.birthday();

    System.out.println(age);
    System.out.println(student);
  }
  
}
