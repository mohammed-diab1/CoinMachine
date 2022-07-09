public class CoinMachine {
    public static void main(String[] args) {


        // Coin initialization
        int toonie;
        int loonie;
        int quarter;
        int dime;
        int nickel;

        //Convert Argument value from String to Integer
        int amount = Integer.parseInt(args[0]);
        int cost = Integer.parseInt(args[1]);


        // Calculate the total of change
        int change = amount - cost;

        // Temporary Values
        int temporaryValue1;
        int temporaryValue2;

        // Print Amount,Cost and Change
        System.out.println("Amount received:" + amount);
        System.out.println("Cost of the item:" + cost);
        System.out.println("Required change:" + change);

        // Calculate the remaining change

        toonie = change / 200;


        loonie = change % 200;
        loonie = loonie / 100;


        quarter = change % 100;
        temporaryValue1 = quarter % 25;
        quarter = quarter / 25;

        dime = temporaryValue1 / 10;
        temporaryValue2 = temporaryValue1 % 10;

        nickel = temporaryValue2 / 5;

        // Print change coins
        System.out.println("Change:");
        System.out.println("\ttoonies" + " " + "X" + " " + toonie);
        System.out.println("\tloonie" + " " + "X" + " " + loonie);
        System.out.println("\tquarter" + " " + "X" + " " + quarter);
        System.out.println("\tdime" + " " + "X" + " " + dime);
        System.out.println("\tnickel" + " " + "X" + " " + nickel);
        System.out.println("Thank you for purchasing \n     Come back again");

    }
}



