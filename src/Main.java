import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(200);
        System.out.println("Hello, welcome to the DMV! Your number is " + number + ", please wait in line.");
        for (int i = number + 1; i < number + 201; i++) {
            System.out.println("Number " + i%201 + " is ready!");
        }
        System.out.println("Your number is ready! Unfortunately you do not have the required documents, please come back with them.");

    }

}
