package Restaurant;

import java.util.*;
import java.sql.*;
import java.io.*;

public class Restaurant {
    int rid;
    String rname;
    long rphone;
    String raddress;

    public Restaurant(int rid, String rname, long rphone, String raddress) {
        this.rid = rid;
        this.rname = rname;
        this.rphone = rphone;
        this.raddress = raddress;
    }

    public int getRid() {
        return rid;
    }

    public String getRname() {
        return rname;
    }

    public long getRphone() {
        return rphone;
    }

    public String getRaddress() {
        return raddress;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public void setRphone(long rphone) {
        this.rphone = rphone;
    }

    public void setRaddress(String raddress) {
        this.raddress = raddress;
    }

    @Override
    public String toString() {
        return "Restaurant [rid=" + rid + ", rname=" + rname + ", rphone=" + rphone + ", raddress=" + raddress + "]";
    }

    HashMap<Integer, Restaurant> restaurantlist = new HashMap<>();

    public void addRest(Restaurant r) {
        if (restaurantlist.containsKey(r.getRid())) {
            System.out.println("Restaurant with thr rid " + r.getRid() + " exists already");
        } else {
            restaurantlist.put(r.getRid(), r);
        }
    }

    public void updateRest(int rid, Restaurant r) {
        if (restaurantlist.containsKey(rid)) {
            restaurantlist.put(rid, r);
        } else {
            System.out.println("Restaurant with the rid " + rid + "does not exist");
        }
    }

    public void displayDetails() {
        for (Restaurant x : restaurantlist.values()) {
            System.out.println("Restaurant ID: " + x.getRid());
            System.out.println("Restaurant Name: " + x.getRname());
            System.out.println("Restaurant Address: " + x.getRaddress());
            System.out.println("Restaurant Phone Number: " + x.getRphone());

            System.out.println("------------------------------");
        }
    }
}
