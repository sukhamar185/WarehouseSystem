import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Warehouse warehouse = new Warehouse("Aguulah 1");
        Storekeeper storekeeper = new Storekeeper("Nyraw 1", warehouse);
        warehouse.setStorekeeper(storekeeper);

        // Бараа үүсгэх
        Item item1 = new Item("Baraa 1", 100);
        Item item2 = new Item("Baraa 2", 50);

        // Барааны жагсаалт
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        // Үйлдлийн цэс
        while (true) {
            System.out.println("\nVildel songono uu:");
            System.out.println("1. Baraa hvleen awah");
            System.out.println("2. Baraa zarlagdah");
            System.out.println("3. Toollogo hiih");
            System.out.println("4. Nuutsiin tailan harah");
            System.out.println("0. Garah");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Buffer цэвэрлэх

            switch (choice) {
                case 1:
                    // Бараа хүлээн авах
                    System.out.println("Baraanii neriig songono uu:");
                    for (int i = 0; i < items.size(); i++) {
                        System.out.println((i + 1) + ". " + items.get(i).getName());
                    }
                    int itemChoice = scanner.nextInt();
                    System.out.println("Toog oruulana uu:");
                    int quantity = scanner.nextInt();
                    StockReceipt stockReceipt = new StockReceipt(items.get(itemChoice - 1), quantity);
                    System.out.println(stockReceipt);
                    break;
                case 2:
                    // Бараа зарлагадах
                    System.out.println("Baraanii neriig songono uu:");
                    for (int i = 0; i < items.size(); i++) {
                        System.out.println((i + 1) + ". " + items.get(i).getName());
                    }
                    itemChoice = scanner.nextInt();
                    System.out.println("Toog oruulana uu:");
                    quantity = scanner.nextInt();
                    StockIssue stockIssue = new StockIssue(items.get(itemChoice - 1), quantity);
                    System.out.println(stockIssue);
                    break;
                case 3:
                    // Тооллого хийх
                    System.out.println("Baraanii neriig songono uu:");
                    for (int i = 0; i < items.size(); i++) {
                        System.out.println((i + 1) + ". " + items.get(i).getName());
                    }
                    itemChoice = scanner.nextInt();
                    System.out.println("Bodit too hemjeeg oruulana uu:");
                    int actualQuantity = scanner.nextInt();
                    Stocktaking stocktaking = new Stocktaking(items.get(itemChoice - 1), actualQuantity);
                    System.out.println(stocktaking);
                    break;
                case 4:
                    // Нөөцийн тайлан харах
                    System.out.println("Niit vildegdel: " + items.get(0).getQuantity() + ", " + items.get(1).getQuantity());
                    break;
                case 0:
                    // Гарах
                    System.out.println("System-ees garlaa.");
                    scanner.close();  // Scanner-ийг хаах
                    return;
                default:
                    System.out.println("Butsaaj oroldono uu.");
                    break;
            }
        }
    }
}
