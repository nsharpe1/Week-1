public class Exercise3 {
    public static void main(String[] args) {
        int years = 10;
        double profit = 0.05;
        double investment = 1000.0;
     

        double total = investment;
        
        System.out.println("Year          Amount on deposit");
        System.out.println("");
        for (int year = 1; year <= years; year++) {
            total += total * profit;
            System.out.printf("%d                 %.2f%n", year, total);
        }
    }
}
