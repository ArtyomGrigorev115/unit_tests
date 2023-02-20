public class Task17 {
    public <T> String testSubstring(T fullString, T substring) {

        if ((fullString instanceof String) || (substring instanceof String)) {
            String fullStr = (String) fullString;
            String subStr = (String) substring;

            assert fullStr != null;
            if (fullStr.contains(subStr)) {
                return "";
            } else {
                return String.format("expected '%s' to be substring of '%s'", fullStr, subStr);

            }
        }
        else{
            String fullStr = String.valueOf(((Integer)fullString));
            String subStr = String.valueOf(((Integer)substring));

            if (fullStr.contains(subStr)) {
                return "";
            } else {
                return String.format("expected '%s' to be substring of '%s'", fullStr, subStr);

            }
        }


/*
    private int prefixFunction(String s){
        int[] p = new int[s.length()];

        for(int i =1; i < s.length(); i++){
            for(int k = 0; k < i - 1; k++){
                if(s.charAt(k) == s.charAt(i - k))
            }
        }
    }*/

    }
}
