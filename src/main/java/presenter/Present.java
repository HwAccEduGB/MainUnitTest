package presenter;

import View.TerminalDisplay;
import model.DataHandler;
import java.util.Arrays;
import java.util.Scanner;

public class Present {

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        TerminalDisplay.displayTerminalMenu();
        String currentLine = scanner.nextLine();
        if (DataHandler.handlerString(currentLine)){
            TerminalDisplay.displayTerminalMessage(Arrays.toString(DataHandler.getResultArr()));
        }else {
            TerminalDisplay.displayTerminalMessage(DataHandler.getTrouble());
        }
        scanner.close();
    }
}
