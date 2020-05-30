package promotions;

public class Promo {
    public final String name;
    public final double discount;
    public int[] items;
    public int[] excludeItems;

    public Promo(String name, double discount){
        this.name = name;
        this.discount = discount;
    }

    public Promo(String name, double discount, int[] items){
        this.name = name;
        this.discount = discount;
        this.items = items;

    }

    public Promo(String name, double discount, int[] items, int[] excludeItems){
        this.name = name;
        this.discount = discount;
        this.items = items;
        this.excludeItems = excludeItems;

    }
}
