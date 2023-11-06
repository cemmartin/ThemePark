package stalls;

import behaviours.IReviewed;

public class TobaccoStall extends Stall implements IReviewed {

    public int rating;
    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot);
        this.rating = rating;
    }


    public int getRating() {
        return rating;
    }
}
