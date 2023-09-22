/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private List<Fruit> list;

    public Order() {
        list = new ArrayList<>();
    }

    public Order(String customerName, List<Fruit> list) {
        this.customerName = customerName;
        this.list = list;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Fruit> getList() {
        return list;
    }

    public void setList(List<Fruit> list) {
        this.list = list;
    }

    
    public String displayProductOrder() {
        String result = "Product | Quantity | Price | Amount\n";
        int count = 1;
        int amount = 0;
        for (Fruit fruit : list) {
                result +=    count + "."
                    + fruit.getFruitName() + "      "
                    + fruit.getQuantity() + "       "
                    + fruit.getPrice() + "       " 
                    + fruit.getPrice() * fruit.getQuantity() + "$" + "\n";
                amount += fruit.getPrice() * fruit.getQuantity();
            count++;
        }
        return result + "Total: " + amount + "$";
    }

    @Override
    public String toString() {
        return "Customer: " + this.getCustomerName() + "\n"
                + displayProductOrder() + "\n";
                
    }
    
    
    
}
