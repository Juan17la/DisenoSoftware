public class App {
    public static void main(String[] args) throws Exception {
        
        Person person = new Person("John Doe", "123 Main St") {};
        System.out.println(person);

        Student student = new Student("Alice Smith", "456 Elm St", "Computer Science", 2, 15000.0);
        System.out.println(student);

        Staff staff = new Staff("Bob Johnson", "789 Oak St", "Engineering", 50000.0);
        System.out.println(staff);

    }
}
