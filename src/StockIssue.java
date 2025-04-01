import java.time.LocalDate;

public class StockIssue {
    private Item item;
    private int quantity;
    private LocalDate dateIssued;

    public StockIssue(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        this.dateIssued = LocalDate.now();
        item.setQuantity(item.getQuantity() - quantity);
    }

    public String toString() {
        return "Zaralgiin padaan: " + item.getName() + " | too: " + quantity + " | zaralsan ognoo: " + dateIssued;
    }
}
