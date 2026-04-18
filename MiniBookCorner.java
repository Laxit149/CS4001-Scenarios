import java.util.Scanner;

public class MiniBookCorner {
    public static void main(String[] args) {
        String[] cat = {"Fiction", "Nepali"};
        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];

        titles[0][0] = "atomic habits";
        prices[0][0] = 500.00;

        titles[1][0] = "Power of positive thinking";
        prices[1][0] = 700.00;

        for (int i = 0; i < cat.length; i++) {
            System.out.println("Category: " + cat[i]);
            for (int j = 0; j < titles[i].length; j++) {
                if (titles[i][j] != null) {
                    System.out.println(" Title: " + titles[i][j] + " | Price: " + prices[i][j]);
                }
            }
            System.out.println();
        }
    }
}