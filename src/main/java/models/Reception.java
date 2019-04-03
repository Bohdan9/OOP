package models;

public class Reception {
    private String Greeting = "Good afternoon, we are glad to see you in our AviationCompany!"
            + "\nWe can advise  to choice one of the top models for a different taste";
    private String Menu = " 1) If you want to see all list of Airplanes"
            + "\n 2) If you want to see all list of Airplanes sort by price"
            + "\n 3) If you want to see all list of Airplanes sort by fly range"
            + "\n 4) If you want to see sum of passenger capacity in all airplanes"
            + "\n 5) If you want to see sum of load capacity in all airplanes"
            + "\n 6) If you want to see all list of Airplanes  by fuel consumption."
            + "\n 7) Press 0 to exit";

    public String getGreeting() {
        return Greeting;
    }

    public String getMenu() {
        return Menu;
    }


    @Override
    public String toString() {
        return "Reception{" +
                "Greeting='" + Greeting + '\'' +
                ", Menu='" + Menu + '\'' +
                '}';
    }
}
