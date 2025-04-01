import java.time.LocalDate;

public class Stocktaking {
    private Item item;
    private int actualQuantity;
    private LocalDate stocktakingDate;

    public Stocktaking(Item item, int actualQuantity) {
        this.item = item;
        this.actualQuantity = actualQuantity;
        this.stocktakingDate = LocalDate.now();
    }

    public String toString() {
        return "Toollogo: " + item.getName() + " | Bodit too hemjee: " + actualQuantity + " | Ognoo: " + stocktakingDate;
    }
}
