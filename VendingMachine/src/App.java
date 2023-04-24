import Products.Product;
import Products.BottleOfWater;
import Products.HotDrink;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("Cola", 88.0);
        item1.setPrice(98.0);
        HotDrink tea = new HotDrink("Чай", 50.0, 80);
        HotDrink coffee = new HotDrink("Кофе", 60.0, 90);

        VendingMachine itemMachin = new VendingMachine(300);
        itemMachin.addProduct(item1);
        itemMachin.addProduct(new Product("Чипсы", 60.0));
        itemMachin.addProduct(new Product("Масло", 50.0));
        itemMachin.addProduct(new Product("Хлеб", 40.0));
        itemMachin.addProduct(new Product("Снек", 20.0));
        itemMachin.addProduct(new BottleOfWater("Cola", 88.0, 500));
        itemMachin.addProduct(new BottleOfWater("Water", 188.0, 1500));
        itemMachin.addProduct(new HotDrink("Чай", 50.0, 80));
        itemMachin.addProduct(new HotDrink("Кофе", 60.0, 90));

        for (Product prod : itemMachin.getProdAll()) {
            System.out.println(prod.toString());
        }

    }
}
