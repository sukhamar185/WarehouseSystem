public class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("Baraa: " + name + ", Too shirheg: " + quantity);
    }
}
