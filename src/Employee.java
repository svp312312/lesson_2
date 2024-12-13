abstract class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private String specialSkills;
    {
        firstName = null;
        lastName = null;
        age = 0;
        position = null;
        specialSkills = null;
    }
    public Employee(String firstName, String lastName, int age, String position, String specialSkills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.specialSkills = specialSkills;
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
    public String getSpecialSkills() {
        return specialSkills;
    }

    public void displayGeneralInformation(){
        System.out.println(getPosition() + "\n" + getFirstName() + " " + getLastName() + ". Возраст (лет): " + getAge() + ". Должность: " + getPosition() + ". Спец. навыки: " + getSpecialSkills());
    };

    public abstract void displayActivities();
}
