
public class Menu {

    private Drink[] drinks;

    public Drink[] getDrinks() {
        return drinks;
    }

    public Menu() {
        initMenu();
    }

    private void initMenu(){

            drinks = new Drink[2];

            Component sugar = new Sugar();
            sugar.setName("sugar");
            sugar.setPrice(0.30);
            sugar.setWeight(0.1);

            Coffee coffee = new Coffee();
            coffee.setName("coffee");
            coffee.setPrice(15);
            coffee.setWeight(0.8);

            Water water = new Water();
            water.setName("water");
            water.setPrice(0.25);
            water.setWeight(250);
            drinks[0] = new Drink("Black Coffee", new Component[]{coffee,water,sugar});

            water = new Water();
            water.setName("water");
            water.setPrice(0.25);
            water.setWeight(200);

            Milk milk = new Milk();
            milk.setName("water");
            milk.setPrice(10);
            milk.setWeight(0.25);

            drinks[1] = new Drink("Black Coffee with Milk", new Component[]{coffee,water,milk,sugar});

    }

}
