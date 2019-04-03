package models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AviationCompany {

    public ArrayList<Airplane> getAviationCompany() {
        ArrayList<Airplane> airplanes = new ArrayList<>();
        Airplane rightFlayer = new Airplane("1903Flier", 100, 15, 2, 10, 2500);
        Airplane boeing = new Airplane("Boeing 787", 2500, 50, 120, 10000, 500000);
        Airplane learjet = new Airplane("Learjet 23", 2000, 40, 30, 5000, 450000);
        Airplane lockheed = new Airplane("Lockheed C-130", 4000, 80, 6, 100000, 2500000);
        Airplane douglas = new Airplane("Douglas DC-3", 500, 25, 2, 50, 300000);
        Airplane general = new Airplane("General Dynamics F-16 Fighting Falcon", 4500, 40, 1, 10, 1200000);
        Airplane predator = new Airplane("MQ-1 Predator", 1500, 55, 0, 0, 2500000);
        airplanes.add(rightFlayer);
        airplanes.add(boeing);
        airplanes.add(learjet);
        airplanes.add(lockheed);
        airplanes.add(douglas);
        airplanes.add(general);
        airplanes.add(predator);
        return airplanes;
    }

    public  List<Airplane> getAirplanesSortByFlyRange() {
        ArrayList<Airplane> airplaneArrayList = getAviationCompany();
        return airplaneArrayList
                .stream()
                .sorted(Comparator.comparingInt(Airplane::getFlyRange))
                .collect(Collectors.toList());
    }

    public List<Airplane> getAirplanesByFuelComposition(int startInterval, int endInterval) {
        ArrayList<Airplane> airplaneArrayList = getAviationCompany();
        return airplaneArrayList
                .stream()
                .filter(a -> a.getFuelComposition() > startInterval && a.getFuelComposition() < endInterval)
                .collect(Collectors.toList());
    }

    public List<Airplane> getAirplaneSortByPrice() {
        ArrayList<Airplane> airplaneArrayList = getAviationCompany();
        return airplaneArrayList
                .stream()
                .sorted((o1, o2) -> o2.getPrice() - o1.getPrice())
                .collect(Collectors.toList());
    }

    public long getAirplaneBySumOfPassengerCapacity() {
        ArrayList<Airplane> airplaneArrayList = getAviationCompany();
        return airplaneArrayList
                .stream()
                .mapToInt(Airplane::getPassengerCapacity)
                .sum();
    }

    public long getAirplaneBySumOfLoadCapacity() {
        ArrayList<Airplane> airplaneArrayList = getAviationCompany();
        return airplaneArrayList
                .stream()
                .mapToInt(Airplane::getLoadCapacity)
                .sum();
    }

}
