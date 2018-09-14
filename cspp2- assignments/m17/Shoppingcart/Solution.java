import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * { main function to drive the program }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        ShoppingCart scart = new ShoppingCart();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String testcases = scan.nextLine();
            String[] tokens = testcases.split(" ");
            switch (tokens[0]) {
                case "Item":
                String[] data = tokens[1].split(",");
                scart.addToCatalog(new Item(data[0], Integer.parseInt(data[1]),
                    Double.parseDouble(data[2])));
                break;
                case "catalog":
                scart.showCatalog();
                break;
                case "add":
                data = tokens[1].split(",");
                scart.addToCart(new Item(data[0], Integer.parseInt(data[1])));
                break;
                case "show":
                scart.showCart();
                break;
                case "totalAmount":
                System.out.println("totalAmount:" + " " +
                    scart.getTotalAmount());
                break;
                case "remove":
                data = tokens[1].split(",");
                scart.removeFromCart(new Item(data[0],
                    Integer.parseInt(data[1])));
                break;
                case "payableAmount":
                System.out.println("Payable amount:" + " " +
                    scart.getPayableAmount());
                break;
                case "coupon":
                scart.applyCoupon(tokens[1]);
                break;
                case "print":
                scart.printInvoice();
                break;
                default:
                break;
            }


        }

    }
}