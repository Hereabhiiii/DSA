package StringQuestions;

public class StingCharacterSearch {
    public static void main(String[] args) {
        String name = "Abhishek";
        char key = 'A';
        System.out.println(stringSearch(name,key));
    }


    static boolean stringSearch(String str, char key) {
        if (str.length() == 0) {
            return false;


        }
        for (int i = 0; i < str.length(); i++) {
            if (key == str.charAt(i)) {
                return true;
            }
        }

        return false;

    }
}