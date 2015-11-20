public class Drink {

    private String name;
    private Component[] components;

    public Drink(String name, Component[] components) {

        this.name = name;
        this.components = components;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Component[] getComponents() {
        return components;
    }

    public void setComponents(Component[] components) {
        this.components = components;
    }




}
