package controllers;

import models.AviationCompany;
import models.Reception;
import view.View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    private Reception reception = new Reception();
    private View view = new View();
    private AviationCompany aviationCompany = new AviationCompany();

    public void menu() {
        while (true) {
                view.printGreeting(reception.getGreeting());
            boolean validInput = false;
            while (!validInput) {
                view.printMenu(reception.getMenu());
                try {
                    Scanner scanner = new Scanner(System.in);
                    int choose = scanner.nextInt();
                    if (choose == 1) {
                        view.printAllAirplanes(aviationCompany.getAviationCompany());
                    } else if (choose == 2) {
                        view.printSortByPrice(aviationCompany.getAirplaneSortByPrice());
                    } else if (choose == 3) {
                        view.printSortByFlyRange(aviationCompany.getAirplanesSortByFlyRange());
                    } else if (choose == 4) {
                        System.out.println("Sum of passengers Capacity:");
                        view.printBySumOfPassengerCapacity(aviationCompany.getAirplaneBySumOfPassengerCapacity());
                    } else if (choose == 5) {
                        System.out.println("Sum of Load Capacity:");
                        view.printBySumOfLoadCapacity(aviationCompany.getAirplaneBySumOfLoadCapacity());
                    } else if (choose == 6) {
                        System.out.println(" Enter an interval of fuel consumption range");
                        int startInterval = scanner.nextInt();
                        int endInterval = scanner.nextInt();
                        view.printFuelConsumption(aviationCompany.getAirplanesByFuelComposition(startInterval, endInterval));
                    } else if (choose == 0) {
                        System.exit(0);
                    } else {
                        System.out.println("I think you miss your choice, please try again");
                    }
                } catch (InputMismatchException e){
                    System.out.println("You have not entered a number. Try again");
                }
            }
        }
    }
}
