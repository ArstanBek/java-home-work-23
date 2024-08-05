public class Company extends AbstractCompany implements Fitable  {
    int experience;
    int age;
    int salary;

    public Company() {
    }

    public Company(String name, int employeeSize) {
        super(name, employeeSize);
    }

    public Company(int experience, int age, int salary) {
        this.experience = experience;
        this.age = age;
        this.salary = salary;
    }

    public Company(String name, int employeeSize, int experience, int age, int salary) {
        super(name, employeeSize);
        this.experience = experience;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public Boolean checkEmployee(Candidate candidate) {
        return candidate.getExperience() >= this.experience && candidate.getAge() >= this.age &&  candidate.getSalary() <= this.salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
