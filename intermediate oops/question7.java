//Develop an application for Dessert shop. The application should allow owner to add items like Candy, Cookie or Ice Cream in the shop storage. Also customers should be able to place an order.
//
//        DessertItem is an abstract class having an abstract method getCost(). Every dessert item has tax associated. Candy item is sold in dollar currency, Cookie in Euro currency & Ice Cream in Rupees currency. The sub classes are supposed to override these methods. When we run the application, it should ask us our role i.e. owner or customer. If role is owner, we should be able to add dessert items in our storage. If role is customer, then we should be able to place an order. The currency conversion rates are:
//
//        1 dollar = 60 rupees.
//
//        1 euro = 70 rupees.
//
//        Specifications:-
//
//abstract class DesertItem {
//
//    abstract public int getCost();
//}
//class Candy extends DesertItem {
//    public int addCandies(int candies){}
//}
//class Cookie extends DesertItem {
//    public int addCookies(int candies){}
//}
//class IceCream extends DesertItem {
//    public int addIceCreams(int candies){}
//}
//public class Assignment2Q7 {
//    public static void main(String[] args) {}
//    private void selectRoles(){}
//    private void roles(String role){}
//    private void addItems() {}
//    private void addItemsOperation(int choice) {}
//    private void placeOrder() {}
//    private void placeOrderOperation(int choice) {}
//}






import java.util.Scanner;

abstract class DessertItem {
    abstract public int getCost();
}

class Candy extends DessertItem {
    private int candies;

    public Candy(int candies) {
        this.candies = candies;
    }

    public int addCandies(int candies) {
        this.candies += candies;
        return this.candies;
    }

    @Override
    public int getCost() {
        double tax = 0.05 * candies; // 5% tax on candy
        return (int) (candies + tax);
    }
}

class Cookie extends DessertItem {
    private int cookies;

    public Cookie(int cookies) {
        this.cookies = cookies;
    }

    public int addCookies(int cookies) {
        this.cookies += cookies;
        return this.cookies;
    }

    @Override
    public int getCost() {
        double tax = 0.1 * cookies; // 10% tax on cookies
        return (int) (cookies + tax);
    }
}

class IceCream extends DessertItem {
    private int iceCreams;

    public IceCream(int iceCreams) {
        this.iceCreams = iceCreams;
    }

    public int addIceCreams(int iceCreams) {
        this.iceCreams += iceCreams;
        return this.iceCreams;
    }

    @Override
    public int getCost() {
        double tax = 0.15 * iceCreams; // 15% tax on ice creams
        return (int) (iceCreams + tax);
    }
}

public class Assignment2Q7 {
    private static final double DOLLAR_TO_RUPEE_RATE = 60;
    private static final double EURO_TO_RUPEE_RATE = 70;

    private static Scanner scanner = new Scanner(System.in);

    private static int candies = 0;
    private static int cookies = 0;
    private static int iceCreams = 0;

    public static void main(String[] args) {
        selectRoles();
    }

    private static void selectRoles() {
        System.out.println("Select your role:");
        System.out.println("1. Owner");
        System.out.println("2. Customer");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            addItems();
        } else if (choice == 2) {
            placeOrder();
        } else {
            System.out.println("Invalid choice. Please try again.");
            selectRoles();
        }
    }

    private static void addItems() {
        System.out.println("Select item to add:");
        System.out.println("1. Candy");
        System.out.println("2. Cookie");
        System.out.println("3. Ice Cream");
        int choice = scanner.nextInt();
        scanner.nextLine();

        addItemsOperation(choice);
    }

    private static void addItemsOperation(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Enter the number of candies to add:");
                int candiesToAdd = scanner.nextInt();
                scanner.nextLine();
                candies = new Candy(candies).addCandies(candiesToAdd);
                System.out.println("Candies added: " + candies);
                break;
            case 2:
                System.out.println("Enter the number of cookies to add:");
                int cookiesToAdd = scanner.nextInt();
                scanner.nextLine();
                cookies = new Cookie(cookies).addCookies(cookiesToAdd);
                System.out.println("Cookies added: " + cookies);
                break;
            case 3:
                System.out.println("Enter the number of ice creams to add:");
                int iceCreamsToAdd = scanner.nextInt();
                scanner.nextLine();
                iceCreams = new IceCream(iceCreams).addIceCreams(iceCreamsToAdd);
                System.out.println("Ice creams added: " + iceCreams);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                addItems();
        }

        selectRoles();
    }

    private static void placeOrder() {
        System.out.println("Select item to order:");
        System.out.println("1. Candy");
        System.out.println("2. Cookie");
        System.out.println("3. Ice Cream");
        int choice = scanner.nextInt();
        scanner.nextLine();

        placeOrderOperation(choice);
    }

    private static void placeOrderOperation(int choice) {
        int quantity;
        switch (choice) {
            case 1:
                System.out.println("Enter the quantity of candies to order:");
                quantity = scanner.nextInt();
                scanner.nextLine();
                int candyCost = new Candy(quantity).getCost();
                System.out.println("Total cost of candies: $" + candyCost);
                int candyCostInRupees = (int) (candyCost * DOLLAR_TO_RUPEE_RATE);
                System.out.println("Total cost of candies in rupees: " + candyCostInRupees);
                break;
            case 2:
                System.out.println("Enter the quantity of cookies to order:");
                quantity = scanner.nextInt();
                scanner.nextLine();
                int cookieCost = new Cookie(quantity).getCost();
                System.out.println("Total cost of cookies: €" + cookieCost);
                int cookieCostInRupees = (int) (cookieCost * EURO_TO_RUPEE_RATE);
                System.out.println("Total cost of cookies in rupees: " + cookieCostInRupees);
                break;
            case 3:
                System.out.println("Enter the quantity of ice creams to order:");
                quantity = scanner.nextInt();
                scanner.nextLine();
                int iceCreamCost = new IceCream(quantity).getCost();
                System.out.println("Total cost of ice creams: ₹" + iceCreamCost);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                placeOrder();
        }

        selectRoles();
    }
}
