package restaurant;

public class Order {
    int oid;
    String orderedItem;
    String orderedBy;
    int quantity;
    Order(){}
    public Order(int oid, String orderedItem, String orderedBy, int quantity) {
        this.oid = oid;
        this.orderedItem = orderedItem;
        this.orderedBy = orderedBy;
        this.quantity = quantity;
    }

}
