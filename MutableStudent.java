public class MutableStudent {

    //    Create two private fields 
    private String name;
    private int age;


    //    Create a constructor that receives name and age.
    // Store the values in the object's fields.
    public MutableStudent(String name, int age){
        this.name = name;
        this.age = age;
    }

    //    Create a getter for name.
    public String getName(){
        return name;
    }

    //    Create a getter for age.
    public int getAge(){
        return age;
    }

    //    Create a setter for name.
    // This method should CHANGE the existing object's name.
    public void setName(String n){
        name = n;
    }

    //    Create a setter for age.
    // This method should CHANGE the existing object's age.
    public void setAge(int a){
        age = a;
    }

    //    Create a displayInfo() method.
    // Display the student's name and age.
    public void displayInfo(){
        System.out.println("Name:  " + name);
        System.out.println("Age:  " + age);
    }
}
