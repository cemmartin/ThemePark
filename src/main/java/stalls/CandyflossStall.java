package stalls;

import behaviours.IReviewed;

public class CandyflossStall extends Stall implements IReviewed {

    public int rating;

    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot);
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
}
