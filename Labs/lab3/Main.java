public class Main{
    public int infoNum = 0;
    public static void main(String[] args) {

        Orders info = new Orders();
        String[][] newInf = info.getInfo();

        int getI = 21;
        int remR = 21;
        int remF = 32;

        HashTable table = new HashTable(10);
        table.put(105, "item-" + newInf[0][1] + ", adress-" +  newInf[1][1] + ", price-" +  newInf[2][1]);
        table.put(21, Order.Return());
        table.put(31, Order.Return());
        System.out.println("Table size: " + table.size());
        System.out.println("Info of order number " + getI + ": " + table.get(getI));
        System.out.println("Info of order number " + 105 + ": " + table.get(105));

        System.out.println("Removed info for order number " + remR + ": " + table.remove(remR));
        System.out.println("Removed info for order number " + remF + ": " + table.remove(remF));
        System.out.println("Table size: " + table.size());
        System.out.println("Table is empty: " + table.isEmpty());
    }
}