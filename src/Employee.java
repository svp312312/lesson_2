abstract class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String position;
    {
        firstName = null;
        lastName = null;
        age = 0;
        position = null;
    }
    public Employee(String firstName, String lastName, int age, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPosition() {
        return position;
    }
    public void display(){
        System.out.println(getPosition());
    };
    public void displayGeneralInformation(){
        System.out.print(getFirstName() + " " + getLastName() + ". Возраст (лет): " + getAge() + ". Должность: " + getPosition());
    };
    public abstract void displaySpecialSkills();
    public abstract void displayActivities();
}
