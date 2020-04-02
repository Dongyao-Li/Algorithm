package jianzhi_pass1;

public class Problem02 {
    public String replaceSpace(StringBuffer str) {
        String s = str.toString();
        char[] chars = s.toCharArray();
        StringBuffer resb = new StringBuffer();

        for (char c : chars) {
            if (c == ' ') {
                resb.append("%20");
            } else {
                resb.append(c);
            }
        }

        return resb.toString();

    }
}
