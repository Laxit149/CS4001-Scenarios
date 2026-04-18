import java.util.Scanner;
public class scholarship {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter the GPA : ");
        float gpa = in.nextFloat();
        if(gpa == 4.0) {
            System.out.println("A+");
            System.out.println("Congratulations,you've got the scholarship");
        }
        else if(gpa>=3.6) {
            System.out.println("A");
            System.out.println("sorry,you didnot get a scholarship ");
        }
        else if(gpa>=3.2){
            System.out.println("B+");
            System.out.println("sorry,you didnot get a scholarship ");
        }
        else if(gpa>=2.8){
            System.out.println("B");
            System.out.println("sorry,you didnot get a scholarship");
        }
        else if(gpa>=2.4){
            System.out.println("C+");
            System.out.println(" sorry,you didnot get a scholarship ");
        }
        else if(gpa>=2.0){
            System.out.println("C");
            System.out.println("sorry,you didnot get a scholarship ");
        }
        else{
            System.out.println("U");
            System.out.println("sorry,you didnot get a scholarship");
        }
    }
}