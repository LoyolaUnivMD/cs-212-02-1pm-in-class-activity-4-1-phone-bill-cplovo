import java.util.Scanner;
import java.text.DecimalFormat;


class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Phone Bill Activity!");

        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalformat = new DecimalFormat("$#.##");


        //ask the user which package they used. used lower case.
        System.out.println("Enter the cellphone subsciption package: (Green, Blue, and Purple)");
        String packageName = scan.nextLine().toLowerCase();

        boolean isvalidpackage = false;
        double baseCost = 0;
        double baseData = 0;
        double baseAdditionalCost = 0;

//Checking if the package the user entered is valid.
        if (packageName.equals("green")) {
            isvalidpackage = true;
            baseCost = 49.99;
            baseData = 2;
            baseAdditionalCost = 15;
        }
        else if (packageName.equals("blue")) {
            isvalidpackage = true;
            baseCost = 70;
            baseData = 4;
            baseAdditionalCost = 10;
        }
        else if (packageName.equals("purple")) {
            isvalidpackage = true;
            baseCost = 99.95;
            baseData = -1; //bc it unlimited
            baseAdditionalCost = 15;
        }
        //This should be our error check
        else {
            System.out.println("Invalid package name. ");

        }
        //If the package is valid, do the calculations

        if (isvalidpackage) {
            System.out.println("Enter the amount of data ued in GB: ");
            double dataUsed = scan.nextDouble();

            double totalCost;


            if (baseData == -1) {
                totalCost = baseCost;
            }
            else {double extraData = Math.max(0, dataUsed - baseData);
                totalCost = baseCost + extraData + baseAdditionalCost;
            }
            if (packageName.equals("green") && totalCost >= 75) {
                totalCost -= 20; //the discount og $20 dollars if the cost is 75 or more
            }
            System.out.println("Your total bill amount is: " + decimalformat.format(totalCost));

        }





        
    }
}
