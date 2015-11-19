public class Product implements Test {

    private String name;
    private Category type;
    private Composition composition;

    private Product[] products;

    public Product() {


    }

    void p(){

        if (! scanQuadrant(j, k).equals(" ")) {
            choiseObject(j,k).draw(g);

        } else {
            choiseObject(j,k).draw(g);
        }



    }

    public void pr(){

        products = new Product[2];
        products[0] = new Coffee();
        products[1] = new Tea();

        for (int i = 0; i < products.length ; i++) {
            try {
                ((Coffee) products[i]).ccc();
            }catch (ClassCastException e){
                System.out.println("do not class");
            }

        }

    }


    @Override
    public void test1() {
        System.out.println("test interface");
    }
}
