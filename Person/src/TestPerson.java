/* 
 * TSU-CHENG, LU
 * ITM 311 (02)     11/02/2022
 * Assignment The Person, Student, Employee, Faculty, and Staff classes
 * 
 * Description: This program will create Person, Student and Employee classes. Making Faculty and Staff subclasses of Employee. 
 * Then it will insert the content of the information and show the result. 
 */
public class TestPerson {
    public static void main(String[] args) throws Exception {
        
        Person person = new Person();
        Student student = new Student();
        student.setName("Ed Smith");
        student.setAddress("123 Main St, Chicago, IL");
        student.setPhone("312-555-1234");
        student.setEmail("esmith@mail.com");
        student.setStatus(Student.JUNIOR);
        Employee employee = new Employee();
        Faculty faculty = new Faculty();
        Staff staff = new Staff();
        
               
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
