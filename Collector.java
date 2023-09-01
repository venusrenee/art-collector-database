public class Collector{
    private int colID;
    private String colName;
    private String category;

    public Collector(int colID, String colName, String category) {
        this.colID = colID;
        this.colName = colName;
        this.category = category;
    }

    public String toString() {
        return "{ID: " + colID + ", Name: " + colName + ", Cat: " + category + "}";
    }
}
