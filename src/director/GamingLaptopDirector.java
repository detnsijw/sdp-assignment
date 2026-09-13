package director;

import builder.GamingLaptopBuilder;
import model.GamingLaptop;

public class GamingLaptopDirector {
    private static final int ESPORTS_RAM_GB = 32;
    private static final int ESPORTS_SSD_GB = 1024;
    private static final int BUDGET_RAM_GB = 8;
    private static final int BUDGET_SSD_GB = 256;

    public GamingLaptop constructEsportsPro(GamingLaptopBuilder builder) {
        return builder.setProcessor("Intel i9-14900HX")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setRamSizeGB(ESPORTS_RAM_GB)
                .setStorageCapacityGB(ESPORTS_SSD_GB)
                .setRGBKeyboard(true)
                .build();
    }

    public GamingLaptop constructBudgetGamer(GamingLaptopBuilder builder) {
        return builder.setProcessor("AMD Ryzen 5 7600H")
                .setGraphicsCard("NVIDIA RTX 4050")
                .setRamSizeGB(BUDGET_RAM_GB)
                .setStorageCapacityGB(BUDGET_SSD_GB)
                .setRGBKeyboard(false)
                .build();
    }
}
