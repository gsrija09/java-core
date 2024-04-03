package D01P03;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Display the name of the month
        System.out.println("Enter a number between 1 to 12 to display the name of the month:");
        int month = scanner.nextInt();
        if (month >= 1 && month <= 12) {
            String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
                               "September", "October", "November", "December"};
            System.out.println(months[month - 1]);
        } else {
            System.out.println("Invalid Input");
        }

        // 2. Print weekday for a given input week using if-else
        System.out.println("Enter a number between 1 to 7 to display the weekday:");
        int day = scanner.nextInt();
        if (day >= 1 && day <= 7) {
            String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            System.out.println(weekdays[day - 1]);
        } else {
            System.out.println("Invalid Input");
        }

        // 3. Check the grade based on marks obtained by students
        System.out.println("Enter the percentage:");
        double percentage = scanner.nextDouble();
        if (percentage >= 60) {
            System.out.println("A Grade");
        } else if (percentage >= 45) {
            System.out.println("B Grade");
        } else if (percentage >= 35) {
            System.out.println("C Grade");
        } else {
            System.out.println("Fail");
        }

        // 4. Display the pattern like right angle triangle with a number
        System.out.println("Enter the number of rows for the pattern:");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // 5. Find the factorial value of any number entered through the keyboard
        System.out.println("Enter a number to find its factorial:");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}

