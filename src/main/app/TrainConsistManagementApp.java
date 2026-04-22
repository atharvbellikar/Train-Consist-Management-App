package app;
import java.util.Scanner;

import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    private static final String TRAIN_REGEX = "TRN-\\d{4}";
    private static final String CARGO_REGEX = "PET-[A-Z]{2}";

    public static boolean isValidTrainID(String trainId) {
        return Pattern.matches(TRAIN_REGEX, trainId);
    }

    public static boolean isValidCargoCode(String cargoCode) {
        return Pattern.matches(CARGO_REGEX, cargoCode);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        if (isValidTrainID(trainId)) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID");
        }

        if (isValidCargoCode(cargoCode)) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code");
        }

        sc.close();
    }
}