
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }

    public int getPricePerSquare() {
        return pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if(this.getSquares() > compared.getSquares()){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int thisPrice = this.getPricePerSquare() * this.getSquares();
        int compPrice = compared.getPricePerSquare() * compared.getSquares();
        int difference = thisPrice - compPrice;
        return Math.abs(difference);
    }

    public boolean moreExpensiveThan(Apartment compared){
        int thisPrice = this.getPricePerSquare() * this.getSquares();
        int compPrice = compared.getPricePerSquare() * compared.getSquares();

        if (thisPrice > compPrice){
            return true;
        }
        return false;
    }

}
