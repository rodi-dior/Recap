public class Project {

    public static void main(String[]args){
        int quantity = 3;
        double unitPrice = 24.99;
        String name = "Wireless Mouse";
        boolean inStock = true;

        double total = calculateTotal(quantity,unitPrice);
        System.out.println(total);
        System.out.println(name + " x " + quantity + " = " + total);

        String[] names = {"Wireless Mouse","Keyboard","Headphones","Monitor"};
        double[] prices = {110.00, 90.00, 50.00, 150.00};
        double catalogueTotal = 0;

        for(int i = 0; i < names.length; i++){
            System.out.printf("%s %.2f%n", names[i], prices[i]);
            catalogueTotal += prices[i];
        }
        System.out.printf("%.2f%n" , catalogueTotal);

        for(int i = 0; i < names.length; i++) {
            if (prices[i] > 100) {
                System.out.printf("%s - premium | price: %.2f%n", names[i], prices[i]);
            } else {
                System.out.printf("%s - standard | price: %.2f%n", names[i], prices[i]);
            }
        }
    }

    static double calculateTotal(int qty, double unitPrice){
        return qty*unitPrice;
    }

}
