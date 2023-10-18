public class Order{
    static Main a = new Main();
    static int infoNum = a.infoNum;
    String[] product;
    String[] adress;
    String[] price;

    public static String Return() {
        Order[] arr;
        arr = new Order[5];
        arr[infoNum] = new Order(new String[]{"shoe", "dog", "poo"},
                new String[]{"Moscow", "London", "Bristol"},
                new String[]{"80$", "100$", "20000$"});
        return arr[infoNum].display();
    }




    public Order(String[] product, String[] adress, String[] price) {
        this.product = product;
        this.adress = adress;
        this.price = price;
    }
    public String display() {
        return "item-" + product[infoNum]
                + ", adress-" +  adress[infoNum]
                + ", price-" +  price[infoNum];
    }
}
