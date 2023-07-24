public class Toy {
    private int toysId;
    private int quantity;
    private String nameToys;
    private double dropFrequency;

    public int getToysId() {
        return toysId;
    }

    public void setToysId(int toysId) {
        this.toysId = toysId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNameToys() {
        return nameToys;
    }

    public void setNameToys(String nameToys) {
        this.nameToys = nameToys;
    }

    public double getDropFrequency() {
        return dropFrequency;
    }

    public void setDropFrequency(double dropFrequency) {
        this.dropFrequency = dropFrequency;
    }

    public Toy(int toysId, int quantity, String nameToys, double dropFrequency) {
        this.toysId = toysId;
        this.quantity = quantity;
        this.nameToys = nameToys;
        this.dropFrequency = dropFrequency;
    }
}
