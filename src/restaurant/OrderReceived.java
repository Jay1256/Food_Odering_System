package restaurant;

import java.util.*;
import Customer.*;
class OrdersReceived {
    Customer c;
    Address a;
    HashMap<Integer, Orders> orderlist = new HashMap<>();

    public void gotOreder(){

    }
    public void prepareOrder(){
    }
    public void dispatchOrder(){

    }
    public void notifyCustomer(){
    }
    public List<Orders> orderReport(){
        return List.of();
    }
}
class Orders{
    int oid;
    String orderedItem;
    String orderedBy;
    int quantity;

    Orders(int oid, String orderedItem, String orderedBy, int quantity){
        this.oid=oid;
        this.orderedItem=orderedItem;
        this.orderedBy=orderedBy;
        this.quantity=quantity;
    }
}