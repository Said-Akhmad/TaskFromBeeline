public class StringArrayManipulator {

    private String[] stringArray;
    public int counter = 0;

    public StringArrayManipulator(String[] stringsArray) {
        this.stringArray = stringsArray;
    }

    public void addString(String str) {

        if (stringArray.length == counter) {
            String[] tmp = new String[stringArray.length + 5];
            for (int i = 0; i < stringArray.length; i++) {
                tmp[i] = stringArray[i];
            }
            stringArray = tmp;
        }

        stringArray[counter] = str;
        counter++;
    }

    public void printArray() {
        for (int i = 0; i < counter; i++) {
            System.out.println("[" + stringArray[i] + "]");
        }
    }

    public String findShortestString() {
        int shortestLength = stringArray[0].length();
        String foundString = stringArray[0];
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i] == null){
                break;
            }
            if (shortestLength > stringArray[i].length()) {
                foundString = stringArray[i];
            }
        }


        return foundString;
    }

    public String findLongestString() {
        int longestLength = stringArray[0].length();
        String foundString = stringArray[0];
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i] == null){
                break;
            }
            if (longestLength < stringArray[i].length()) {
                foundString = stringArray[i];
            }
        }


        return foundString;
    }

    public void reverseAllStrings() {

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i] == null) {
                break;
            }
            StringBuilder str = new StringBuilder();
            String[] splitArray = stringArray[i].split("");
            for (int j = splitArray.length - 1; j >= 0; j--) {
                str.append(splitArray[j]);
            }
            stringArray[i] = String.valueOf(str);
        }

    }


}
