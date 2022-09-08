import model.Menu;
import service.OrderSystem;

public class Main {

    public static void main(String[] args) {

        Menu menu1 = new Menu(1, 9.99f, "Maxi Cheeseburger", "Cheeseburger", "Pommes", "Cola");
        Menu menu2 = new Menu(2, 10.50f, "Maxi Whopper", "Whopper", "Salat", "Fanta");
        Menu menu3 = new Menu(3, 11.45f, "Veggi Burger", "Veggi Burger", "Krautsalat", "Wasser");

        OrderSystem orderSystem = new OrderSystem();

        orderSystem.addMenu(menu1);
        orderSystem.addMenu(menu2);
        orderSystem.addMenu(menu3);


        orderSystem.placeOrder(1);



    }
}
