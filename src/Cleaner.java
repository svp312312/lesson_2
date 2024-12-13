public class Cleaner extends Employee{

    public Cleaner(String firstName, String lastName, int age, String position, String specialSkills) {
        super(firstName, lastName, age, position, specialSkills);
    }

    @Override
    public void displayActivities(){
        System.out.println(" 1. Приходит на работу. \n 2. Убирает офис и прилегающую территорию. \n 3. Обедает 30 минут. \n 4. Уходит с работы.");
    }


}
