public class Report {

    public void printMenu(Menu menu) {

        Drink[] drinks = menu.getDrinks();

        double sumPrice = 0;
        double sum = 0;
        double sumComponents = 0;

        for (int i = 0; i < drinks.length; i++) {

            System.out.println("name: " + drinks[i].getName());
            Component[] components = drinks[i].getComponents();

            sumComponents = 0;
            System.out.println("Components: ");

            for (int j = 0; j < components.length; j++) {
                Component component = components[j];
                sum = getSum(component);
                System.out.println("Name: " + component.getName() + " price: " + component.getPrice()
                        + " sum: " + sum);
                sumPrice += sum;
                sumComponents += sum;
            }
            System.out.println("Total drink: " + sumComponents);
            System.out.println("");
        }

        System.out.println("Total: "+ sumPrice);

    }

    private double getSum(Component component){
        return component.getPrice() * component.getWeight();
    }
}
