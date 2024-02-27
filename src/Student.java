public class Student {
    private int age;
    private String firstName;
    private String lastName;
    private int year;
    private String address;

    public Student(int age, String firstName, String lastName, int year, Address address){
        this.age = this.age;
        this.firstName = this.firstName;
        this.lastName = this.lastName;
        this.year = this.year;
        this.address = this.address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addOneAge(){
        age++;
    }

    public int birthday(){
        addOneAge();
        return age;
    }

    public String toString() {
        return firstName + " " + lastName + ", age " + age + ", year " + year + " " + address;
    }
}
