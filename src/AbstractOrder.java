public abstract class AbstractOrder implements Order {
    private static int idCounter = 0;
    private int id;
    private int outerId;
    private short price;
    private int quantity;
    private int peak;

    public AbstractOrder(int outerId, short price, int quantity, int peak) {
        this.outerId = outerId;
        this.price = price;
        this.quantity = quantity;
        this.peak = peak;
        id = idCounter++;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getOuterId() {
        return outerId;
    }

    @Override
    public short getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public int getPeak() {
        return peak;
    }

}
