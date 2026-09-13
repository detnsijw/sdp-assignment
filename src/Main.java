import builder.GamingLaptopBuilder;
import director.GamingLaptopDirector;
import model.GamingLaptop;

public class Main {
    public static void main(String[] args) {
        // Custom creation using builder
        GamingLaptop customLaptop = new GamingLaptopBuilder()
                .setProcessor("AMD Ryzen 7 7840HS")
                .setGraphicsCard("NVIDIA RTX 4070")
                .setRamSizeGB(16)
                .setStorageCapacityGB(1000)
                .setRGBKeyboard(true)
                .build();

        System.out.println("Custom Configured Laptop: " + customLaptop);

        // Already pre-configured builds made by Director
        GamingLaptopDirector director = new GamingLaptopDirector();

        GamingLaptop esportsLaptop = director.constructEsportsPro(new GamingLaptopBuilder());
        System.out.println("eSports Preset: " + esportsLaptop);

        GamingLaptop budgetLaptop = director.constructBudgetGamer(new GamingLaptopBuilder());
        System.out.println("Budget Preset: " + budgetLaptop);
    }
}
