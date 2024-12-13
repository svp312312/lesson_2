public class Security extends Employee{
    private boolean gunOwnership; //спец. навыки: владение оружием (да/нет)
    {
        gunOwnership = false;
    }
    public Security(String firstName, String lastName, int age, String position, boolean gunOwnership) {
        super(firstName, lastName, age, position);
        this.gunOwnership = gunOwnership;
    }
    public void setGunOwnership(boolean gunOwnership) {
        this.gunOwnership = gunOwnership;
    }
    public boolean getGunOwnership() {
        return gunOwnership;
    }
    @Override
    public void displaySpecialSkills() {
        System.out.println(" | Cпец. навыки:" + " Владение оружием - " + (getGunOwnership()?"да":"нет"));
    }
    @Override
    public void displayActivities(){
        System.out.println(" 1. Приходит на работу. \n 2. Выполняет должностные обязанности. \n 3. Обедает 20 минут. \n 4. Уходит с работы.");
    }
}
