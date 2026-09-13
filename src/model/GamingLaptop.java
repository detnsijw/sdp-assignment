package model;

public class GamingLaptop {
    private final String processor;
    private final String graphicsCard;
    private final int ramSizeGB;
    private final int storageCapacityGB;
    private final boolean hasRGBKeyboard;

    public GamingLaptop(String processor, String graphicsCard, int ramSizeGB,
                        int storageCapacityGB, boolean hasRGBKeyboard) {
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.ramSizeGB = ramSizeGB;
        this.storageCapacityGB = storageCapacityGB;
        this.hasRGBKeyboard = hasRGBKeyboard;
    }

    public String getProcessor() {
        return processor;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public int getRamSizeGB() {
        return ramSizeGB;
    }

    public int getStorageCapacityGB() {
        return storageCapacityGB;
    }

    public boolean isHasRGBKeyboard() {
        return hasRGBKeyboard;
    }

    @Override
    public String toString() {
        return "GamingLaptop [CPU=" + processor + ", GPU=" + graphicsCard +
                ", RAM=" + ramSizeGB + "GB, SSD=" + storageCapacityGB +
                "GB, RGB=" + hasRGBKeyboard + "]";
    }
}
