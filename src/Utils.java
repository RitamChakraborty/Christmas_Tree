public class Utils {
    public int getClosesPossibleCompleteBinaryTreeSize(int length) {
        if (length == 0) {
            return 0;
        }

        int j = 1;
        int i = 1;

        while (i <= length) {
            j *= 2;

            if (i + j > length) {
                break;
            }

            i += j;
        }

        return i;
    }
}
