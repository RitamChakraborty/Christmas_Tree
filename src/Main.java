import controller.TreeGeneratorController;

public class Main {
    public static void main(String[] args) {
        String string = "ABCD";
        TreeGeneratorController treeGeneratorController = new TreeGeneratorController();
        System.out.println(treeGeneratorController.getDiagram(string));
    }
}
