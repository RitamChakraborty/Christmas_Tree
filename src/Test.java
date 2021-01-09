public class Test {
    private static final Utils utils = new Utils();

    private static void test_1() {
        System.out.println(((utils.getClosesPossibleCompleteBinaryTreeSize(0) == 0)));
        System.out.println(((utils.getClosesPossibleCompleteBinaryTreeSize(1) == 1)));
        System.out.println(((utils.getClosesPossibleCompleteBinaryTreeSize(2) == 1)));
        System.out.println(((utils.getClosesPossibleCompleteBinaryTreeSize(15) == 15)));
        System.out.println(((utils.getClosesPossibleCompleteBinaryTreeSize(32) == 31)));
    }

    public static void main(String[] args) {

    }

    public void test_2() {

    }
}
