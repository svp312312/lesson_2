public class Manager extends Employee{

    public Manager(String firstName, String lastName, int age, String position, String specialSkills) {
        super(firstName, lastName, age, position, specialSkills);
    }

    @Override
    public void displayActivities(){
        System.out.println(" 1) Приходит на работу. \n 2) Управляет продажами. \n 3) Обедает 60 минут. \n 4) Уходит с работы.");
    }
}
