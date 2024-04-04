package Basketbaal;
public class BasketBall {
    // Fields (Declaring Brand Name/color/price)
    private String brandName;
    private String color;
    private double price;

    // No parameter constructor (Provide Brand Name/color/price)
    public BasketBall() {
        this.brandName = "";
        this.color = "";
        this.price = 0.0;
    }

    // Overloaded constructor with three parameters
    public BasketBall(String brandName, String color, double price) {
        this.brandName = brandName;
        this.color = color;
        this.price = price;
    }

    // Getter for brandName
    public String getBrandName() {
        return brandName;
    }

    // Setter for brandName
    public  void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        // Testing values for get and set methods
        BasketBall ball1 = new BasketBall();
        ball1.setBrandName("Grow");
        ball1.setColor("white");
        ball1.setPrice(49.99);

        System.out.println("Testing get and set methods:");
        System.out.println("Brand Name: " + ball1.getBrandName());
        System.out.println("Color: " + ball1.getColor());
        System.out.println("Price: $" + ball1.getPrice());

        // Testing values for overloaded constructor
        BasketBall ball2 = new BasketBall("Nike", "red", 79.99);

        System.out.println("\nTesting overloaded constructor:");
        System.out.println("Brand Name: " + ball2.getBrandName());
        System.out.println("Color: " + ball2.getColor());
        System.out.println("Price: $" + ball2.getPrice());
    }
}