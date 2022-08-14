public class ceilingofChars {
    public static void main(String[] args) {
        char[] chars = { 'c', 'f', 'j' };
        int[] charsConverted = new int[chars.length];
        char target = 'a';
        int intTarget = target;

        for (int i = 0; i < chars.length; i++) {
            int temp = chars[i];
            charsConverted[i] = temp;
        }
        System.out.println((char) getCeil(charsConverted, intTarget));
    }

    public static int getCeil(int[] chars, int target) {
        int start = 0;
        int end = chars.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            mid = (start + end) / 2;
            if (target > chars[mid]) {
                start = mid + 1;
            } else if (target < chars[mid]) {
                end = mid - 1;
            } else {
                return chars[mid];
            }
        }
        return chars[start];
    }
}
