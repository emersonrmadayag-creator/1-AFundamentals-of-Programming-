import java.util.Scanner;
public class Assignment3Scanner {
    public static void main(String[] args){
        Scanner hi = new Scanner(System.in);

        System.out.print("Enter NSAT score : ");
        double nsat = hi.nextDouble();
        System.out.print("Enter parent's monthly salary : ");
        double salary = hi.nextDouble();
        System.out.print("Enter entrance exam score : ");
        double exam = hi.nextDouble();

        double average = (nsat + exam) / 2;

        if(salary>10000 ||nsat <90 || exam < 85){
            System.out.print("Rejected");
        } else if (salary <=3500 && average >=91) {
            System.out.print("Accepted");
        } else {
            System.out.print("For further study");
        }
    }
}
