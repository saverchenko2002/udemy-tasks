package task_40;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.printf("%s hamburger on a %s roll with %s, price is %.2f\n", name, breadRollType, meat, price);
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        price+=addition1Price;
        System.out.printf("Added %s for an extra %.2f\n", addition1Name, addition1Price);
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        price+=addition2Price;
        System.out.printf("Added %s for an extra %.2f\n", addition2Name, addition2Price);
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        price+=addition3Price;
        System.out.printf("Added %s for an extra %.2f\n", addition3Name, addition3Price);
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        price+=addition4Price;
        System.out.printf("Added %s for an extra %.2f\n", addition4Name, addition4Price);
    }

    public double itemizeHamburger() {
        return price;
    }
}