public class Transaction {
    private String pieceName;
    private double sales;
    private int year;
    private Collector seller;
    private Collector buyer;

    public Transaction(String pieceName, double sales, int year, Collector seller, Collector buyer){
        this.pieceName = pieceName;
        this.sales = sales;
        this.year = year;
        this.seller = seller;
        this.buyer = buyer;
    }

    public String toString() {
        return "[" + pieceName + " sold for $" + sales + " by " + seller + " to " + buyer + " in " + year + "]";
    }

    public int getYear() {
        return year;
    }

    public double getSales() {
        return sales;
    }
}
