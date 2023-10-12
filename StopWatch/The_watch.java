package StopWatch;
import java.util.Scanner;

public class The_watch {
    public static void main(String[] args) {
        Mechanism sw = new Mechanism();
        System.out.print("Press 1 to start the timer: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            sw.setStartTime();
            System.out.println("The timer has started");
        } else sw.wrongInput();
        System.out.println("Press 2 to stop the timer: ");
        int choice2 = sc.nextInt();
        if (choice2 == 2) {
            sw.setEndTime();
            System.out.println("The timer has stopped");
            System.out.println(sw.Elapsed());
        } else sw.wrongInput();
    }
}



