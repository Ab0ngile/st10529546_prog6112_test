package electronicssales;

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("   ELECTRONICS CONSOLE SALES");
        System.out.println("=================================");

        System.out.println("Select a console device:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. SWITCH");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        input.nextLine();

        String consoleType;

        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;

            case 2:
                consoleType = "XBOX";
                break;

            case 3:
                consoleType = "SWITCH";
                break;

            default:
                System.out.println("Invalid console choice.");
                input.close();
                return;
        }

        System.out.print("Enter the store name: ");
        String store = input.nextLine();

        System.out.print("Enter the total amount of sales: ");
        int totalSales = input.nextInt();

        ConsoleSales sales =
                new ConsoleSales(consoleType, store, totalSales);

        System.out.println();
        sales.printReport();

        input.close();
    }
}