// This program will create a menu for customers offering different products (Jade Park - 6/6/2021)
import java.util.Scanner;

public class CompanyMenu {
   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      // Making the logo with a bunch of print statements!
      System.out.println("    /////////       ///////////            *                 //////////      //////////   ");
      System.out.println("   ///    ///       ///////////           ***                ///     ///     ///     ///  ");
      System.out.println("   //     ///           ///             *******              ///      ///    ///      /// ");
      System.out.println("   ///   ///            ///           ***********            ///     ///     ///     ///  ");
      System.out.println("    ///                 ///    *************************     ///    ///      ///    ///   ");
      System.out.println("     ////               ///      *********************       ///   ///       ///   ///    ");
      System.out.println("      ////              ///        *****************         ////////        ////////     ");
      System.out.println("       ////             ///          *************           ///   ///       ///    ///   ");
      System.out.println("      ////              ///        *****************         ///    ///      ///     ///  ");
      System.out.println("//   ////               ///       *****          ****        ///     ///     ///      /// " );
      System.out.println("///////                 ///      **                 **       ///      ///    ///       ///");
      
      // Declaring and assigning values to variables that represent the options and their prices on the menu
      int option1 = 1;
      double option1Price = 30;
      int option2 = 2;
      double option2Price = 15;
      int option3 = 3;
      double option3Price = 10;
      int option4 = 4;
      double option4Price = 45;
      
      // Outputs giving the possible selections to the user
      System.out.println("\nWelcome to Starr! Here are the products you may purchase below:");
      System.out.println("1 - Unlimited Review Access: $30");
      System.out.println("2 - No Ads: $15");
      System.out.println("3 - Profile and Layout Customization: $10");
      System.out.println("4 - Annual Membership: $45");
      
      // Allowing the user to input a number that represents an item on the menu and storing their response in the variable firstSelection
      System.out.print("\nPlease make your first selection from the options provided above (ex. 1): ");
      int firstSelection = input.nextInt();
      
      // Allowing the user to input the quantity of the item wanted and storing their response in the variable firstSelectionQuantity
      System.out.print("What is the quantity of products you would like to request? ");
      double firstSelectionQuantity = input.nextDouble();
      
      // Allowing the user to input a 2nd number that represents an item on the menu and storing their response in the variable secondSelection
      System.out.print("Please make your second selection from the options provided above (ex. Unlimited Review Access): ");
      int secondSelection = input.nextInt();
      
      // Allowing the user to input the quantity of the item wanted and storing their response in the variable secondSelectionQuantity
      System.out.print("What is the quantity of products you would like to request? ");
      double secondSelectionQuantity = input.nextDouble();
            
      // Declaring the variables firstSelectionCost and secondSelectionCost and setting them to a filler value 0 that will eventually change
      double firstSelectionCost = 0;
      double secondSelectionCost = 0;
      
      // Creating an if statement that calculates the price for the first selection
      if (firstSelection == option1) {
         firstSelectionCost = option1Price * firstSelectionQuantity;
      } else if (firstSelection == option2) {
         firstSelectionCost = option2Price * firstSelectionQuantity;
      } else if (firstSelection == option3) {
         firstSelectionCost = option2Price * firstSelectionQuantity;
      } else if (firstSelection == option4) {
         firstSelectionCost = option4Price * firstSelectionQuantity;
      } else {
         System.out.println("You have entered an invalid input. Please try again.");
      }
      
      // Creating a second if statement that calculates the price for the second selection
      if (secondSelection == option1) {
         secondSelectionCost = option1Price * secondSelectionQuantity;
      } else if (secondSelection == option2) {
         secondSelectionCost = option2Price * secondSelectionQuantity;
      } else if (secondSelection == option3) {
         secondSelectionCost = option2Price * secondSelectionQuantity;
      } else if (secondSelection == option4) {
         secondSelectionCost = option4Price * secondSelectionQuantity;
      } else {
         System.out.println("You have entered an invalid input. Please try again.");
      }
      
      // Declaring the variable initialCost to the sum of variables firstSelectionCost and secondSelectionCost
      double initialCost = firstSelectionCost + secondSelectionCost;
      
      // Declaring the variable finalCost and (temporarily) setting the value to initialCost in case the value needs to be changed because of a discount
      double finalCost = initialCost;
      
      // Applying a 10% discount if they selected the first two options
      if (firstSelection == 1 && secondSelection == 2) {
         finalCost = initialCost * .9;
      }
      
      // Applying a 5% discount if they selected a quantity greater than or equal to 10 for both of their options
      if (firstSelectionQuantity >= 10 && secondSelectionQuantity >= 10) {
         finalCost = initialCost * .95;
      }
      
      // Outputs the users initial inputs
      System.out.println("\nYou chose option " + firstSelection + " in the quantity " + firstSelectionQuantity + ".");
      System.out.println("You also chose option " + secondSelection + " in the quantity " + secondSelectionQuantity + ".");
      
      // Outputs the final cost of the transaction
      System.out.println("\nYour total cost is $" + finalCost);
      
      // Notifies the user of a discount if applicable
      if (firstSelection == 1 && secondSelection == 2) {
         System.out.println("\nA 10% discount has been applied to your purchase because you purchased option 1 and 2.");
      }
      if (firstSelectionQuantity >= 10 && secondSelectionQuantity >= 10) {
         System.out.println("\nA 5% discount has been applied to your purchase because you purchased 10 or more items for both selections.");
      }
      
      // Gives the user a chance to confirm their purchase, and outputs a response based on their response
      System.out.print("\nEnter 1 to complete your purchase, or 2 to exit: ");
      int finalDecision = input.nextInt();
      
      if (finalDecision == 1) {
         System.out.println("Congrats! Your purchase has been processed.");
      } else if (finalDecision == 2) {
         System.out.println("We are sorry you have chosen not to purchase anything. Please come back soon!");
      } else {
         System.out.println("You have input an invalid value. Please try again.");
      }
   }
}