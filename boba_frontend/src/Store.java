public class Store {
    
    public String name;
    public double rating;
    public double minCost;
    public double maxCost;
    public boolean dairyOpts;
    public boolean caffOpts;
    
    public Store(String name, double rating, double minCost, double maxCost, boolean dairyOpts,
                 boolean caffOpts) {
        this.name = name;
        this.rating = rating;
        this.minCost = minCost;
        this.maxCost = maxCost;
        this.dairyOpts = dairyOpts;
        this.caffOpts = caffOpts;
    }
    
    
}
