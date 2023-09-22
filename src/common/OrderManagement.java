
package common;

import java.util.ArrayList;
import model.Order;

public class OrderManagement extends ArrayList<Order>{

    public OrderManagement() {
    }
    
    public void create(Order order) {
       this.add(order);
    }
    
    public void display() {
        for (Order order : this) {
            System.out.println(order);
        }
    }
}
