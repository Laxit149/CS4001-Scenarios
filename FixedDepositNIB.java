import java.util.Scanner;

class FixedDepositNIB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'a';
        while (ch == 'a') {
            double P = sc.nextDouble();
            double rate = sc.nextDouble();
            int years = sc.nextInt();
            int months = years * 12;
            double monthlyRate = rate / 12 / 100;
            double A = P * Math.pow(1 + monthlyRate, months);
            double fee = A * 0.005;
            double finalAmount = A - fee;
            System.out.println(finalAmount);
            ch = sc.next().charAt(0);
        }
    }
}