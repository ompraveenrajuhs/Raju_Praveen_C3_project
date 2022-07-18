import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
    Restaurant restaurant;

    @Test
    public void order_items_total_value(){
        Order order=new Order();
        List<Item> orderItems=new ArrayList<Item>();
        orderItems.add(new Item("Pizza",500));
        orderItems.add(new Item("Burger",250));
        order.setOrderedItems(orderItems);
        order.setRestaurant(restaurant);
        assertEquals(750,order.getOrderValue(order));
        assertNotEquals(1050,order.getOrderValue(order));
    }
}
