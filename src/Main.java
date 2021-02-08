import controller.TreeGeneratorController;

import java.util.Scanner;

public class Main {
    private static final TreeGeneratorController treeGeneratorController = new TreeGeneratorController();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("********** Christmas Tree **********");
        System.out.println("Enter a text: ");
        String string = scanner.nextLine();
        String diagram = treeGeneratorController.getDiagram(string);

        System.out.println(diagram);
    }
}
