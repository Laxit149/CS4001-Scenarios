class Person {
    String name;
    double monthlyPay;
    static String collegeName = "Islington";

    public Person(String name, double pay) {
        this.name = name;
        this.monthlyPay = pay;
    }

    public double calculateAnnualSalary() {
        return monthlyPay * 12;
    }
}

class Teacher extends Person {
    String sub; 
    double extraBonus;

    public Teacher(String n, double p, String s, double b) {
        super(n, p);
        this.sub = s;
        this.extraBonus = b;
    }

    @Override
    public double calculateAnnualSalary() {
        double baseAnnual = super.calculateAnnualSalary();
        return baseAnnual + extraBonus;
    }
}

class Staff extends Person {
    int hrs;
    double rate;

    public Staff(String n, int h, double r) {
        super(n, 0); 
        this.hrs = h;
        this.rate = r;
    }

    public double calculateSalary() {
        double result = (double) hrs * rate;
        return result;
    }
}

public class SchoolApp {
    public static void main(String[] args) {
        
        Teacher t = new Teacher("arya pokhrel", 3000.0, "Java", 5000.0);
        System.out.println("Teacher Salary: " + t.calculateAnnualSalary());

        Staff s = new Staff("hari", 160, 15.5);
        System.out.println("Staff Salary: " + s.calculateSalary());

        System.out.println("College: " + Person.collegeName);
    }
}