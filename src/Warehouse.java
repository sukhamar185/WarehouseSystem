public class Warehouse {
    private String name;
    private Storekeeper storekeeper;

    public Warehouse(String name) {
        this.name = name;
    }

    public void setStorekeeper(Storekeeper storekeeper) {
        this.storekeeper = storekeeper;
    }

    public String getName() {
        return name;
    }

    public Storekeeper getStorekeeper() {
        return storekeeper;
    }
}
