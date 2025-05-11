/******************************************************************
 * Energy Drink Consumption Calculator                            *
 * This program calculates the approximate number of customers    *
 * who purchase energy drinks per week and those who prefer       *
 * citrus-flavored energy drinks based on a survey.               *
 ******************************************************************/

public class EnergyDrinkConsumption {

    /**************************************************************
     * Main Method                                                *
     * Calculates the number of weekly energy drink consumers     *
     * and the number of citrus-flavored drink enthusiasts.       *
     **************************************************************/
    public static void main(String[] args) {

        //*********************************************************
        // Constant Declarations                                  *
        // Fixed values representing survey data and percentages  *
        //*********************************************************
        final int TOTAL_CUSTOMERS = 12467;          // Total surveyed
        final double PURCHASE_PERCENTAGE = 0.14;   // 14% purchase weekly
        final double CITRUS_PREFERENCE = 0.64;     // 64% prefer citrus flavor

        //*********************************************************
        // Variable Declarations                                  *
        // To store calculated values                             *
        //*********************************************************
        int weeklyDrinkers;                        // Approximate number of weekly drinkers
        int citrusDrinkers;                        // Approximate number of citrus drinkers

        //*********************************************************
        // Calculation Section                                    *
        // Compute the number of weekly drinkers and citrus fans  *
        //*********************************************************
        weeklyDrinkers = (int) (TOTAL_CUSTOMERS * PURCHASE_PERCENTAGE);
        citrusDrinkers = (int) (weeklyDrinkers * CITRUS_PREFERENCE);

        //*********************************************************
        // Output Section                                         *
        // Display the calculated number of consumers             *
        //*********************************************************
        System.out.println();
        System.out.printf("%-35s %d\n", "Approximate weekly energy drinkers:", weeklyDrinkers);
        System.out.printf("%-35s %d\n", "Approximate citrus flavor enthusiasts:", citrusDrinkers);

        //*********************************************************
        // Developer Credit                                       *
        //*********************************************************
        System.out.println();
        System.out.println("Developed by: Nikita Baiborodov");

        //*********************************************************
        // Program End                                            *
        //*********************************************************
        System.exit(0);
    }
}

