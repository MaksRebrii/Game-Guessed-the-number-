package ua.univer.mvc;

public class View {
    // Text's constants
    public static final String INPUT_INT_DATA = "Input INT value = ";

    public static final String WRONG_INPUT_DATA =
                                        "Wrong input! Repeat please! ";
    public static final String OUR_INT = "INT value = ";

    public static final String WRONG_RANGE_DATA = "Wrong range data! Repeat please!";

    public static final String ATTEMPTS = "ATTEMPTS: ";

    public static final String OUR_LAST_ATTEMPT = "Last attempt: ";

    public static final String WIN = "\nYou WIN!!! Congratulate!!!";

    public static final String TRY_AGAIN = "Try again!\n\n";

    public void printMessage(String message){
        System.out.println(message);
    }

}
