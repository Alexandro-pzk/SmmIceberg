public abstract class AbstractOrder implements Order {
    private final int id;
    private short price;
    private int quantity;
    private int peak;

    public AbstractOrder(int id, short price, int quantity, int peak) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.peak = peak;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public short getPrice() {
        return price;
    }

    @Override
    public void updatePrice(short price) {
        this.price = price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void increaseQuantity(int delta) {
        quantity += delta;
    }

    @Override
    public void decreaseQuantity(int delta) {
        quantity -= delta;
    }

    @Override
    public int getPeak() {
        return peak;
    }

    @Override
    public void updatePeak(int peak) {
        this.peak = peak;
    }

}
