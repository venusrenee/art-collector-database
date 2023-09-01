public class TestTransactions
{
    public static void main(String [] args) 
    {
        Collector col1 = new Collector(1,"B&B Bros","Comm");
        Collector col2 = new Collector(2,"Metro M","Govt");
        Collector col3 = new Collector(3,"Rare Goods","Comm");
        Collector col4 = new Collector(4,"FA Ctr","NonP");
        Collector col5 = new Collector(5,"Mason C","NonP");
        Collector col6 = new Collector(6,"CL Fabrics","Comm");
        Transaction[] testtr = {new Transaction("AtlVase",0,2020,col2,col1),
                                new Transaction("GldSilk",300000,2017,col6,col3),
                                new Transaction("GldSilk",50000,2004,col5,col6),
                                new Transaction("AtlVase",100000,2014,col5,col3),
                                new Transaction("GldSilk",150000,2013,col3,col5),
                                new Transaction("MPBracelet",0,2008,col4,col5)};
        TransactionDB testdb = new TransactionDB();
        
        System.out.println("-------------- Before Adding Transactions --------------");
        System.out.println(testdb);        
        System.out.println("A total of " + testdb.numTransactions() + " transactions have occurred.");
        java.text.DecimalFormat dF = new java.text.DecimalFormat("0.00");
        System.out.println("A grand total of $" + dF.format(testdb.durationCost(2010,2020)) + 
        " was spent on transactions between 2010 and 2020.\n");         
        
        for (Transaction titem : testtr)
        {
            testdb.add(titem);
        }           
        System.out.println("-------------- After Adding Transactions --------------");
        System.out.println(testdb);        
        System.out.println("A total of " + testdb.numTransactions() + " transactions have occurred.");
        System.out.println("A grand total of $" + dF.format(testdb.durationCost(2010,2020)) + 
        " was spent on transactions between 2010 and 2020.\n"); 
        
    }
}
