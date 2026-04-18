import java.util.Scanner;
public class Riskshawfare{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        System.out.println("enter the distance:");
        double distance= in.nextDouble();
        System.out.println("enter the wating time:");
        int time= in.nextInt();
        double basefare=50.0;
        double Rate=40.0;
        double WaitingRate=2.0;
        double totalFare = basefare + (distance * Rate) + (time * WaitingRate);
        
        System.out.println("your fare is:"+ totalFare);   
        
    }
}
