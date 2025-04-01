import java.time.LocalDate;

public class StockReceipt {
    private Item item;
    private int quantity;
    private LocalDate dateReceived;

    public StockReceipt(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        this.dateReceived = LocalDate.now();
        item.setQuantity(item.getQuantity() + quantity);
    }

    public String toString() {
        return "Orlogiin padaan: " + item.getName() + " | too: " + quantity + " | Oruulsan ognoo: " + dateReceived;
    }
}
