package common;

import java.util.ArrayList;
import model.Fruit;

public class FruitManagementSystem extends ArrayList<Fruit> {

    Library library = new Library();

    public void create() {
        int fruitId = library.getInt("Input Fruit ID: ");
        String fruitName = library.getString("Input fruit name: ");
        int price = library.getInt("Input price of fruit: ");
        int quantity = library.getInt("Input quantity of fruit: ");
        String origin = library.getString("Input origin of fruit : ");

        this.add(new Fruit(fruitId, fruitName, price, quantity, origin));

    }

    public void detele(int fruitId) {
        try {
            for (Fruit fruit : this) {
                if (fruit.getFruitId() == fruitId) {
                    this.remove(fruit);
                } else {
                    System.out.println("Candidate Id not found to remove");
                }
            }
        } catch (Exception e) {
        }

    }

    public void update(int fruitId) {
        for (Fruit fruit : this) {
            if (fruit.getFruitId() == fruitId) {
                String fruitName = library.getString("Input name update : ");
                fruit.setFruitName(fruitName);
                int price = library.getInt("Input price update: ");
                fruit.setPrice(price);
                int quantity = library.getInt("Input quantity update: ");
                fruit.setQuantity(quantity);
                String origin = library.getString("Input origin update : ");
                fruit.setOrigin(origin);
            }
        }
    }

    public void updateQuantity(int fruitId, int soldOut) {
        for (Fruit fruit : this) {
            if (fruit.getFruitId() == fruitId) {
                int remainder = fruit.getQuantity() - soldOut;
                if (remainder <= 0) {
                    this.remove(fruit);
                } else {
                    fruit.setQuantity(remainder);

                }
            }
        }
    }

    public Fruit search(int fruitId) {
        for (Fruit fruit : this) {
            if (fruit.getFruitId() == fruitId) {
                return fruit;
            }
        }
        return null;
    }

    public void display() {
        System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ | ++ Remaining amount ++ |");
        for (Fruit fruit : this) {
            System.out.println(fruit);
        }
    }

}
