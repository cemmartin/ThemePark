package attractions;

import behaviours.ITicketed;

public class Dodgems extends Attraction implements ITicketed {

    public double price;

    public Dodgems(String name, int rating) {
        super(name, rating);
        this.price = 4.50;
    }

    public double defaultPrice(){
        return this.price;
    }
}
