import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int n = 4;
        Employee[] employees = new Employee[n];
        employees[0] = new Cleaner("Сергей", "Оленин", 18, "Уборщик", true, true);
        employees[1] = new Driver("Юлий", "Царев", 45, "Водитель", "D");
        employees[2] = new Manager("Ева-Мария", "Лето", 20, "Менеджер", "Продажи");
        employees[3] = new Security("Венедикт", "Гусаров", 39, "Охранник", true);

        System.out.println("Список сотрудников");
        for(int i = 0; i < n; i++){
            System.out.print(i + 1 + ". ");
            employees[i].display();
            employees[i].displayGeneralInformation();
            employees[i].displaySpecialSkills();
            System.out.println("Действия в течение дня:");
            employees[i].displayActivities();
            System.out.println();
        }

    }
}