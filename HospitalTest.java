class Patient {
    String pName;
    int pAge;
    int days;
    double rate;

    public Patient(String name, int age, int d, double r) {
        this.pName = name;
        this.pAge = age;
        this.days = d;
        this.rate = r;
    }

    public double calculateTotalBill() {
        double subtotal = (double) days * rate;
        
        if (days > 7) {
            double off = subtotal * 0.1;
            return subtotal - off;
        }
        
        return subtotal;
    }

    public void displayDetails() {
        double finalBill = calculateTotalBill();
        System.out.println("Patient Name: " + pName);
        System.out.println("Age: " + pAge);
        System.out.println("Days in hospital: " + days);
        System.out.println("Total to pay: " + finalBill);
        System.out.println(""); 
    }
}

public class HospitalTest {
    public static void main(String[] args) {
        Patient pat1 = new Patient("Laxit", 30, 5, 2000.0);
        Patient pat2 = new Patient("hari", 45, 10, 2000.0);

        pat1.displayDetails();
        pat2.displayDetails();
    }
}