abstract  public class AbstractCompany {
    String name;
    int employeeSize;

    public AbstractCompany() {
    }

    public AbstractCompany(String name, int employeeSize) {
        this.name = name;
        this.employeeSize = employeeSize;
    }

    public void getClient(int quantity) {};
    public void getMoney(int summa) {};
    public void payMoney(int summa) {};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeSize() {
        return employeeSize;
    }

    public void setEmployeeSize(int employeeSize) {
        this.employeeSize = employeeSize;
    }
}
