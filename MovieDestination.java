import java.util.Scanner;

public class MovieDestination {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String destination = scan.nextLine();
        String season = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());

        double price = 0.0;

        switch (destination) {
            case "Dubai":
                if ("Summer".equals(season)) {
                    price = 40_000;
                } else if ("Winter".equals(season)) {
                    price = 45_000;
                }
                price = (price * days) * 0.7;
                break;
            case "Sofia":
                if ("Summer".equals(season)) {
                    price = 12_500;
                } else if ("Winter".equals(season)) {
                    price = 17_000;
                }
                price = (price * days) * 1.25;
                break;
            case "London":
                if ("Summer".equals(season)) {
                    price = 20_250;
                } else if ("Winter".equals(season)) {
                    price = 24_000;
                }
                price = price * days;
                break;
        }

        if (price > budget) {
            System.out.println(String.format("The director needs %.2f leva more!", price - budget));
        } else {
            System.out.println(String.format("The budget for the movie is enough! We have %.2f leva left!", budget - price));
        }
    }
}
