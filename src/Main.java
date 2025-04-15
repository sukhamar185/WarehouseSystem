import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Warehouse warehouse = new Warehouse("Aguulah 1");
        Storekeeper storekeeper = new Storekeeper("Nyraw 1", warehouse);
        warehouse.setStorekeeper(storekeeper);

        // Барааны жагсаалт
        List<Item> items = new ArrayList<>();
        items.add(new Item("Baraa 1", 100));
        items.add(new Item("Baraa 2", 50));

        while (true) {
            System.out.println("\nVildel songono uu:");
            System.out.println("1. Baraa nemeh");
            System.out.println("2. Baraa hvleen awah");
            System.out.println("3. Baraa zarlagdah");
            System.out.println("4. Toollogo hiih");
            System.out.println("5. Nuutsiin tailan harah");
            System.out.println("0. Garah");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Shine baraanii neriig oruulna uu:");
                    String newName = scanner.nextLine();
                    System.out.println("Toog oruulna uu:");
                    int newQty = scanner.nextInt();
                    items.add(new Item(newName, newQty));
                    System.out.println("Baraa amjilttai nemegdlee.");
                    break;
                case 2:
                    Item selectedReceiptItem = selectItem(scanner, items);
                    System.out.println("Toog oruulana uu:");
                    int receiptQty = scanner.nextInt();
                    selectedReceiptItem.setQuantity(selectedReceiptItem.getQuantity() + receiptQty);
                    StockReceipt receipt = new StockReceipt(selectedReceiptItem, receiptQty);
                    System.out.println(receipt);
                    break;
                case 3:
                    Item selectedIssueItem = selectItem(scanner, items);
                    System.out.println("Toog oruulana uu:");
                    int issueQty = scanner.nextInt();
                    if (issueQty > selectedIssueItem.getQuantity()) {
                        System.out.println("Aldaa: Hangalttai baraa baihgui!");
                    } else {
                        selectedIssueItem.setQuantity(selectedIssueItem.getQuantity() - issueQty);
                        StockIssue issue = new StockIssue(selectedIssueItem, issueQty);
                        System.out.println(issue);
                    }
                    break;
                case 4:
                    Item selectedCountItem = selectItem(scanner, items);
                    System.out.println("Bodit too hemjeeg oruulana uu:");
                    int actualQty = scanner.nextInt();
                    selectedCountItem.setQuantity(actualQty);
                    Stocktaking stocktaking = new Stocktaking(selectedCountItem, actualQty);
                    System.out.println(stocktaking);
                    break;
                case 5:
                    System.out.println("Nuutsiin tailan:");
                    for (Item item : items) {
                        System.out.println(item.getName() + " - Too hemjee: " + item.getQuantity());
                    }
                    break;
                case 0:
                    System.out.println("System-ees garlaa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Buruu songolt. Dahin oroldono uu.");
                    break;
            }
        }
    }

    private static Item selectItem(Scanner scanner, List<Item> items) {
        System.out.println("Baraanii neriig songono uu:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).getName());
        }
        int itemChoice = scanner.nextInt();
        scanner.nextLine();
        return items.get(itemChoice - 1);
    }
}
