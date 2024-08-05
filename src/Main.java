//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Company shoro = new Company("Shoro", 100, 5, 30, 1000000);

        Candidate max = new Candidate("Max", 6, 34, 990000);
        Candidate alex = new Candidate("Alex", 3, 30, 120000);

        System.out.println(max.getName() + " " + (shoro.checkEmployee(max) ? "подходит" : "не подходит"));
        System.out.println(alex.getName() + " " + (shoro.checkEmployee(alex) ? "подходит" : "не подходит"));
    }
}