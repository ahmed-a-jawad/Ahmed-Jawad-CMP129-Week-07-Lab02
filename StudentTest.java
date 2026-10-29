public class StudentTest {

    public static void main(String[] args) {

        // PART 1: Mutable Student
        // Create a MutableStudent object.
        MutableStudent m_student = new MutableStudent("Joe", 21);

        // Display the student's original information.
        m_student.displayInfo();

        // Use the setter methods to change the student's data.
        m_student.setAge(30);
        m_student.setName("Peter");

        // Display the student again.
        m_student.displayInfo();
        // Question: Did the SAME object change? Yes


        System.out.println();

        // PART 2: Immutable Student
        // Create an ImmutableStudent object.
        ImmutableStudent i_student = new ImmutableStudent("Cleveland", 40);


        // Display the student's information.
        i_student.displayInfo();
        System.out.println();

        // New object with different data
        ImmutableStudent i_student2 = new ImmutableStudent("Johnny", 12);

        i_student.displayInfo();    //First Immutable Object
        System.out.println();
        i_student2.displayInfo();   //Second Immutable Object
        // Try to answer this in a comment:
        // Why can you not change the ImmutableStudent object
        // using setter methods?

        // The fields are set a final so they cannot be changed after they are initialized.

        // PART 3: Compare
        // Add comments that answer:
        // 1. Which class is mutable?
        // Mutable Student

        // 2. Which class is immutable?
        //ImmutableStudent

        // 3. What is the biggest difference you noticed?
        // Adding 'final' when creating immutable fields
    }
}
