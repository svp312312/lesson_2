public class Driver extends Employee{
    private String category; //спец. навыки: категория водителя (A,B,C,D)
    {
        category = "";
    }
    public Driver(String firstName, String lastName, int age, String position, String category) {
        super(firstName, lastName, age, position);
        this.category = category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    @Override
    public void displaySpecialSkills() {
        System.out.println(" | Cпец. навыки:" + " Категория - " + getCategory());
    }
    @Override
    public void displayActivities(){
        System.out.println(" 1. Приходит на работу. \n 2. Выполняет должностные обязанности. \n 3. Обедает 40 минут. \n 4. Уходит с работы.");
    }
}
