package Utils;

public class Randoms {
    public static String getEmail() {
        int n = getRandomNumber(6,10);
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        sb.append("+wpt@wriketask.qaa");
        return sb.toString();
    }

    public static int getRandomNumber(int left, int right){
        return (int)(Math.random()*(right-left+1))+left;
    }
}
