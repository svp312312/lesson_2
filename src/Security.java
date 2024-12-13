public class Security extends Employee{

    public Security(String firstName, String lastName, int age, String position, String specialSkills) {
        super(firstName, lastName, age, position, specialSkills);
    }

    @Override
    public void displayActivities(){
        System.out.println(" 1) Приходит на работу. \n 2) Охраняет офис. \n 3) Обедает 20 минут. \n 4) Уходит с работы.");
    }
}
