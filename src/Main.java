public class Main {
    private static final Utils utils = new Utils();

    private static Node completeTree(String string) {
        int n = string.length();

        if (n == 0) {
            return null;
        } else if (n == 1) {
            return new Node(string.charAt(0), null, null);
        }

        int length = n / 2;
        String left = string.substring(0, length);
        String right = string.substring(length + 1);

        return new Node(string.charAt(length), completeTree(left), completeTree(right));
    }

    private static Node tree(String string) {
        int n = string.length();

        if (n == 0) {
            return null;
        } else if (n == 1) {
            return new Node(string.charAt(0), null, null);
        } else if (n == 2) {
            return new Node(string.charAt(1), new Node(string.charAt(0), null, null), null);
        } else if (n == 3) {
            return new Node(string.charAt(1), new Node(string.charAt(0), null, null), new Node(string.charAt(2), null, null));
        }

        int length = utils.getClosesPossibleCompleteBinaryTreeSize(string.length());

        if (length == n) {
            return completeTree(string);
        }

        String left = string.substring(0, length);
        char middle = string.charAt(length);
        String right = string.substring(length + 1);

        return new Node(middle, tree(left), tree(right));
    }

    public static void main(String[] args) {
        String string = "ABCDEFGHIJKLMNOPQRSTUV";
        Node root = tree(string);
        DepthMap depthMap = new DepthMap();
        depthMap.generateDepthMap(root);
        TreePrinter treePrinter = new TreePrinter();
        treePrinter.print(depthMap);

        /*
 ______________________________________________z
______________________________________________/_\
_____________________________________________/___\
____________________________________________/_____\
___________________________________________/_______\
__________________________________________/_________\
_________________________________________/___________\
________________________________________/_____________\
_______________________________________/_______________\
______________________________________/_________________\
_____________________________________/___________________\
____________________________________/_____________________\
___________________________________/_______________________\
__________________________________/_________________________\
_________________________________/___________________________\
________________________________/_____________________________\
_______________________________/_______________________________\
______________________________/_________________________________\
_____________________________/___________________________________\
____________________________/_____________________________________\
___________________________/_______________________________________\
__________________________/_________________________________________\
_________________________/___________________________________________\
________________________/_____________________________________________\
_______________________q_______________________________________________q
______________________/_\_____________________________________________/_\
_____________________/___\___________________________________________/___\
____________________/_____\_________________________________________/_____\
___________________/_______\_______________________________________/_______\
__________________/_________\_____________________________________/_________\
_________________/___________\___________________________________/___________\
________________/_____________\_________________________________/_____________\
_______________/_______________\_______________________________/_______________\
______________/_________________\_____________________________/_________________\
_____________/___________________\___________________________/___________________\
____________/_____________________\_________________________/_____________________\
___________r_______________________p_______________________r_______________________p
__________/_\_____________________/_\_____________________/_\_____________________/_\
_________/___\___________________/___\___________________/___\___________________/___\
________/_____\_________________/_____\_________________/_____\_________________/_____\
_______/_______\_______________/_______\_______________/_______\_______________/_______\
______/_________\_____________/_________\_____________/_________\_____________/_________\
_____r___________m___________n___________o___________r___________m___________n___________o
____/_\_________/_\_________/_\_________/_\_________/_\_________/_\_________/_\_________/_\
___/___\_______/___\_______/___\_______/___\_______/___\_______/___\_______/___\_______/___\
__e_____c_____s_____s_____j_____k_____l_____m_____e_____c_____s_____a_____j_____k_____l_____m
_/_\___/_\___/_\___/_\___/_\___/_\___/_\___/_\___/_\___/_\___/_\___/_\___/_\___/_\___/_\___/_\
m___r_y___h_i___t_a___a_b___c_d___e_f___g_h___i_y___h_i___t_s___a_b___c_d___e_f___g_h___i_l___w

         */
    }
}
