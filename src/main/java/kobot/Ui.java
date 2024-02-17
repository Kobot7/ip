package kobot;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ui {
    private static final String BOT_NAME = "Kobot";
    private static final String LOGO = "#########################################\n"
            + "##     _   __      _           _       ##\n"
            + "##    | | / /     | |         | |      ##\n"
            + "##    | |/ /  ___ | |__   ___ | |_     ##\n"
            + "##    |    \\ / _ \\| '_ \\ / _ \\| __|    ##\n"
            + "##    | |\\  \\ (_) | |_) | (_) | |_     ##\n"
            + "##    \\_| \\_/\\___/|_.__/ \\___/ \\__|    ##\n"
            + "##                                     ##\n"
            + "#########################################\n";

    private static final String LINE_DIVIDER = "-------------------------------------------";
    
    Scanner in;
    public Ui() {
        this.in = new Scanner(System.in);
    }

    public void printLineDivider() {
        System.out.println(LINE_DIVIDER);
    }
    public void printHelloMessage() {
        System.out.println(LOGO);
        System.out.println("Hello! I'm " + BOT_NAME + ". How may I assist you?");
    }

    public void printGoodbyeMessage() {
        System.out.println("Bye, hope to see you again!");
    }
    
    public String receiveInput() throws NoSuchElementException {
        printLineDivider();
        System.out.print("> ");
        String input = "";
        
        try {
            input = this.in.nextLine();
        } catch (NoSuchElementException exception) {
            System.exit(0);
        }
        
        printLineDivider();
        return input;
    }

    public void printEmptyArgumentErrorMessage() {
        System.out.println("Empty or whitespace-only fields are not allowed.");
    }

    public void printMissingArgumentErrorMessage() {
        System.out.println("Missing information. Please try again.");
    }
    
    public void printIndexOutOfBoundsMessage(String action) {
        System.out.println("Invalid index. Failed to " + action + " item.");
    }

    public void printToDoCommandUsage() {
        System.out.println("Command to add a new to-do task:");
        System.out.println("todo <description>");
    }

    public void printDeadlineCommandUsage() {
        System.out.println("Command to add a new deadline:");
        System.out.println("deadline <description> /by <datetime>");
    }

    public void printEventCommandUsage() {
        System.out.println("Command to add a new event:");
        System.out.println("event <description> /from <datetime> /to <datetime>");
    }
    
    public void printMarkCommandUsage() {
        System.out.println("Command to mark task as completed:");
        System.out.println("mark <task index>");
    }

    public void printUnmarkCommandUsage() {
        System.out.println("Command to mark task as not completed:");
        System.out.println("unmark <task index>");
    }

    public void printDeleteCommandUsage() {
        System.out.println("Command to delete task:");
        System.out.println("delete <task index>");
    }
}