package builder;

import model.GamingLaptop;

public class GamingLaptopBuilder {
    private String processor;
    private String graphicsCard = "Integrated Graphics";
    private int ramSizeGB;
    private int storageCapacityGB;
    private boolean hasRGBKeyboard = false;

    public GamingLaptopBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public GamingLaptopBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public GamingLaptopBuilder setRamSizeGB(int ramSizeGB) {
        this.ramSizeGB = ramSizeGB;
        return this;
    }

    public GamingLaptopBuilder setStorageCapacityGB(int storageCapacityGB) {
        this.storageCapacityGB = storageCapacityGB;
        return this;
    }

    public GamingLaptopBuilder setRGBKeyboard(boolean hasRGBKeyboard) {
        this.hasRGBKeyboard = hasRGBKeyboard;
        return this;
    }

    public GamingLaptop build() {
        return new GamingLaptop(processor, graphicsCard, ramSizeGB, storageCapacityGB, hasRGBKeyboard);
    }
}
