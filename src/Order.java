public interface Order {
    int getId();
    short getPrice();
    void updatePrice(short price);
    int getQuantity();
    void increaseQuantity(int delta);
    void decreaseQuantity(int delta);
    int getPeak();
    void updatePeak(int peak);
}
