public class Ingredient {
    public String unit;
    public double amount;
    public String name;


    public Ingredient() {

    }

    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    @Override
    public String toString() {
        return amount + " " + unit + " " + name;
    }
}
