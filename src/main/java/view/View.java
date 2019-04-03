package view;

import models.Airplane;
import java.util.ArrayList;
import java.util.List;

public class View {
    public void printGreeting(String Greeting) {
        System.out.println(Greeting);
    }

    public void printMenu(String Menu) {
        System.out.println(Menu);
    }

    public void printAllAirplanes(ArrayList<Airplane> airplanes) {
        for (Airplane airplane : airplanes) {
            System.out.println(airplane);

        }

    }

    public void printSortByPrice(List<Airplane> airplaneSortByPrice) {
        for (Airplane airplane : airplaneSortByPrice) {
            System.out.println(airplane);
        }

    }

    public void printSortByFlyRange(List<Airplane> airplanesSortByFlyRange) {
        for (Airplane airplane : airplanesSortByFlyRange) {
            System.out.println(airplane);
        }

    }

    public void printBySumOfPassengerCapacity(long airplaneBySumOfPasengerCapacity) {
        System.out.println(airplaneBySumOfPasengerCapacity);

    }

    public void printBySumOfLoadCapacity(long airplaneBySumOfLoadCapacity) {
        System.out.println(airplaneBySumOfLoadCapacity);

    }

    public void printFuelConsumption(List<Airplane> airplanesByFuelComposition) {
        for (Airplane airplane : airplanesByFuelComposition) {
            System.out.println(airplane);
        }

    }
}
