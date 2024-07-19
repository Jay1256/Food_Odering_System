package restaurant;

import java.util.*;
import Customer.*;
public class Website {
    Customer c;
    Address a;
    public Website(Customer c, Address a) {
        this.c = c;
        this.a = a;
    }

    HashMap<Integer, Order> orderlist = new HashMap<>();

    int[] arr;
    public int size;
    int count;

    public Website(int size){
        this.size=size;
        arr=new int[size];
        count=0;
    }

    public synchronized void produce(Order o)throws Exception{
        if(count == size){
            wait();
        }
        arr[count] = o.oid;
        count++;
        System.out.println("Order with oid "+o.oid+" dispatched.");
        notify(); //notifies consume()
    }

    public synchronized void consume(Order o) throws Exception{
        if(count == 0){
            wait(); // waits until notification received from produce method
        }
        int oid = arr[count-1];
        count--;
        System.out.println("Order with oid "+ o.oid +" delivered at "+ a.toString());
        notify(); //notifies produce()
    }

    public List<Order> orderReport(){
        return List.of();
    }
}

