package util;

public class Utils {
    public static int getClosesPossibleCompleteBinaryTreeSize(int length) {
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

    public static int spacerCount(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 2;
        } else {
            return spacerCount(n - 1) * 2 + 1;
        }
    }
}
