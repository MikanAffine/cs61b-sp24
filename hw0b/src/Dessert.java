public class Dessert {
    static int numDesserts = 0;

    final int flavor;
    final int price;

    public Dessert(int flavor, int price) {
        this.flavor = flavor;
        this.price = price;
        ++numDesserts;
    }

    public void printDessert() {
        System.out.print("" + flavor + ' ' + price + ' ' + numDesserts);
    }

    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }
}
