import java.util.ArrayList;

public class TransactionDB {
    private ArrayList<Transaction> transactions;
    
    public TransactionDB(){
        transactions = new ArrayList<Transaction>();
    }
    
    public void add(Transaction newTr){
        transactions.add(newTr);
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);
            sb.append(transaction.toString()).append("\n");
        }
        return sb.toString();
    }
    
    public int numTransactions() {
        return transactions.size();
    }
    
    public double durationCost(int startYear, int endYear) {
        double totalCost = 0;
        for (int i = 0; i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);
            if (transaction.getYear() >= startYear && transaction.getYear() <= endYear) {
                totalCost += transaction.getSales();
            }
        }
        return totalCost;
    }
}

