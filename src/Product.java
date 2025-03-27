public class Product {
    private String name;
    private String code;
    private double price;
    private int quantity;

    public Product(String name, String code, double price, int quantity) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    public void updateStock(int newQuantity){
        this.quantity = newQuantity;
    }

    public void displayInfo() {
        System.out.println("Baraa: " + name + ", code: " + code + ", vne: " + price + " Too shirheg: " + quantity);
    }
}
