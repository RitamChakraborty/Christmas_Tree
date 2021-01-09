public class Test {
    public static void main(String[] args) {
        Utils utils = new Utils();
        System.out.println(((utils.getClosesPossibleCompleteBinaryTreeSize(0) == 0)));
        System.out.println(((utils.getClosesPossibleCompleteBinaryTreeSize(1) == 1)));
        System.out.println(((utils.getClosesPossibleCompleteBinaryTreeSize(2) == 1)));
        System.out.println(((utils.getClosesPossibleCompleteBinaryTreeSize(15) == 15)));
        System.out.println(((utils.getClosesPossibleCompleteBinaryTreeSize(32) == 31)));
    }
}
