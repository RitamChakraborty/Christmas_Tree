public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        String string = "ABCDEFGHIJLKMN";
        int length = utils.getClosesPossibleCompleteBinaryTreeSize(string.length());
        String string1 = string.substring(0, length);
        char middle = string.charAt(length);
        String string2 = string.substring(length + 1);
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(middle);

        /*

                                                       z
                                                      / \
                                                     /   \
                                                    /     \
                                                   /       \
                                                  /         \
                                                 /           \
                                                /             \
                                               /               \
                                              /                 \
                                             /                   \
                                            /                     \
                                           /                       \
                                          /                         \
                                         /                           \
                                        /                             \
                                       /                               \
                                      /                                 \
                                     /                                   \
                                    /                                     \
                                   /                                       \
                                  /                                         \
                                 /                                           \
                                /                                             \
                               q                                               q
                              / \                                             / \
                             /   \                                           /   \
                            /     \                                         /     \
                           /       \                                       /       \
                          /         \                                     /         \
                         /           \                                   /           \
                        /             \                                 /             \
                       /               \                               /               \
                      /                 \                             /                 \
                     /                   \                           /                   \
                    /                     \                         /                     \
                   r                       p                       r                       p
                  / \                     / \                     / \                     / \
                 /   \                   /   \                   /   \                   /   \
                /     \                 /     \                 /     \                 /     \
               /       \               /       \               /       \               /       \
              /         \             /         \             /         \             /         \
             r           m           n           o           r           m           n           o
            / \         / \         / \         / \         / \         / \         / \         / \
           /   \       /   \       /   \       /   \       /   \       /   \       /   \       /   \
          e     c     s     s     j     k     l     m     e     c     s     a     j     k     l     m
         / \   / \   / \   / \   / \   / \   / \   / \   / \   / \   / \   / \   / \   / \   / \   / \
        m   r y   h i   t a   a b   c d   e f   g h   i y   h i   t s   a b   c d   e f   g h   i l   w

         */
    }
}
