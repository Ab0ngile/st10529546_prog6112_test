package electronicssales;

public class Question1 {

    public static void main(String[] args) {

        // Cities
        String[] cities = {
            "Cape Town",
            "Port Elizabeth",
            "Pretoria"
        };

        // Console types
        String[] consoles = {
            "PS5",
            "XBOX",
            "SWITCH"
        };

        // Sales data
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        // Display report
        System.out.println("==============================================");
        System.out.println("       NUMBER 1 ELECTRONICS SALES REPORT");
        System.out.println("==============================================");

        System.out.printf("%-20s %-10s %-10s %-10s%n",
                "City", "PS5", "XBOX", "SWITCH");

        System.out.println("----------------------------------------------");

        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-20s %-10d %-10d %-10d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }

        System.out.println("----------------------------------------------");

        // Calculate total sales for each console
        int ps5Total = 0;
        int xboxTotal = 0;
        int switchTotal = 0;

        for (int i = 0; i < sales.length; i++) {
            ps5Total += sales[i][0];
            xboxTotal += sales[i][1];
            switchTotal += sales[i][2];
        }

        System.out.println("Total PS5 sales: " + ps5Total);
        System.out.println("Total XBOX sales: " + xboxTotal);
        System.out.println("Total SWITCH sales: " + switchTotal);

        // Calculate total sales for each city
        int highestCityTotal = 0;
        String highestCity = "";

        for (int i = 0; i < sales.length; i++) {

            int cityTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {
                cityTotal += sales[i][j];
            }

            System.out.println("Total sales for "
                    + cities[i] + ": " + cityTotal);

            if (cityTotal > highestCityTotal) {
                highestCityTotal = cityTotal;
                highestCity = cities[i];
            }
        }

        System.out.println("----------------------------------------------");
        System.out.println("City with the most gaming console sales: "
                + highestCity);
        System.out.println("Total sales: " + highestCityTotal);
        System.out.println("==============================================");
    }
}