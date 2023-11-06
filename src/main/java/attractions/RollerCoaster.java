package attractions;

import behaviours.ITicketed;

public class RollerCoaster extends Attraction implements ITicketed {
    public double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
    }

    public double defaultPrice(){
        return this.price;
    }
}
