import java.util.ArrayList;
import java.util.List;

public class Order {
    private Restaurant restaurant;
    private List<Item> orderedItems;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<Item> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(List<Item> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public Order getOrder( List<Item> orderedItems){
        Order order=new Order();
        order.setOrderedItems(orderedItems);
        order.setRestaurant(restaurant);
        return order;
    }

    public double getOrderValue(Order order){
           double sum=0;
            for(Item item : order.getOrderedItems()){
                sum+=item.getPrice();
            }
            return sum;
    }
}
