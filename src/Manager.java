public class Manager extends Employee{
    private String fieldOfActivity; //спец. навыки: направление (реклама, продажи и т.д.)
    {
        fieldOfActivity = "";
    }
    public Manager(String firstName, String lastName, int age, String position, String fieldOfActivity) {
        super(firstName, lastName, age, position);
        this.fieldOfActivity = fieldOfActivity;
    }
    public void setFieldOfActivity(String fieldOfActivity) {
        this.fieldOfActivity = fieldOfActivity;
    }
    public String getFieldOfActivity() {
        return fieldOfActivity;
    }
    @Override
    public void displaySpecialSkills() {
        System.out.println(" | Cпец. навыки:" + " Направление - " + getFieldOfActivity());
    }
    @Override
    public void displayActivities(){
        System.out.println(" 1. Приходит на работу. \n 2. Выполняет должностные обязанности. \n 3. Обедает 60 минут. \n 4. Уходит с работы.");
    }
}
