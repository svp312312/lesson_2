public class Cleaner extends Employee{
    private boolean cleaningOfPremises;
    private boolean cleaningOfTerritories;
    {
        cleaningOfPremises = true;
        cleaningOfTerritories = false;
    }
    public Cleaner(String firstName, String lastName, int age, String position, boolean cleaningOfPremises, boolean cleaningOfTerritories) {
        super(firstName, lastName, age, position);
        this.cleaningOfPremises = cleaningOfPremises; //спец. навыки: уборка помещений (да/нет)
        this.cleaningOfTerritories = cleaningOfTerritories;//спец. навыки: уборка прилегающей территории (да/нет)
    }
    public void setCleaningOfPremises(boolean cleaningOfPremises) {
        this.cleaningOfPremises = cleaningOfPremises;
    }
    public void setCleaningOfTerritories(boolean cleaningOfTerritories) {
        this.cleaningOfTerritories = cleaningOfTerritories;
    }
    public boolean getCleaningOfPremises() {
        return cleaningOfPremises;
    }
    public boolean getCleaningOfTerritories() {
        return cleaningOfTerritories;
    }
    @Override
    public void displaySpecialSkills() {
        System.out.println("  Cпец. навыки:" + " Уборка помещений - " + (getCleaningOfPremises()?"Да":"Нет") + ", Уборка прилегающей территории - " + (getCleaningOfTerritories()?"Да":"Нет"));
    }
    @Override
    public void displayActivities(){
        System.out.println(" 1. Приходит на работу. \n 2. Выполняет должностные обязанности. \n 3. Обедает 30 минут. \n 4. Уходит с работы.");
    }


}
