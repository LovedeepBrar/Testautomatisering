import java.util.HashMap;
import java.util.Map;

public class Manager {

    HashMap<String, Character> morseToEnglish = new HashMap<>();
    HashMap<Character, String> test = new HashMap<>();

    public String englishToMorse(String s) {
        char[] array = s.toLowerCase().toCharArray();

        String result = "";
        for (int i = 0; i < array.length; i++) {
            char alphabet = array[i];
            String morseKod = getenglishToMorse(alphabet);
            result += morseKod;
        }
        return result;
    }

    public String morseToEnglish(String s) {
        String result = "";
        String[] array = s.split(" ");

        for (String m : array) {

            result += getmorseToEnglish(m) + " ";

        }
        return result;

    }

    private String getenglishToMorse(char m) {
        if (!test.containsKey(m)) {
            throw new IllegalArgumentException("unknown letter");
        }
        return test.get(m);
    }

    private String getmorseToEnglish(String m) {
        if (!morseToEnglish.containsKey(m)) {
            throw new IllegalArgumentException("ogiltligt tecken");
        }
        return morseToEnglish.get(m) + " ";
    }


    public void mapManager() {
        test.put('a', ".-");
        test.put('b', "-...");
        test.put('c', "-.-.");
        test.put('d', "-..");
        test.put('e', ".");
        test.put('f', "--.-");
        test.put('g', "--.");
        test.put('h', "....");
        test.put('i', "..");
        test.put('j', ".---");
        test.put('k', "-.-");
        test.put('l', ".-..");
        test.put('m', "--");
        test.put('n', "-.");
        test.put('o', "---");
        test.put('p', ".--.");
        test.put('q', "--.-");
        test.put('r', ".-.");
        test.put('s', "...");
        test.put('t', "-");
        test.put('u', "..-");
        test.put('v', "...-");
        test.put('w', ".--");
        test.put('x', "-..-");
        test.put('y', "-.--");
        test.put('z', "--..");
        test.put('1', ".----");
        test.put('2', "..---");
        test.put('3', "...--");
        test.put('4', "....-");
        test.put('5', ".....");
        test.put('6', "-....");
        test.put('7', "--...");
        test.put('8', "---..");
        test.put('9', "----.");
        test.put('0', "-----");
        test.put('.', ".-.-.-");
        test.put(',', "--..--");
        test.put('?', "..--..");


        for (Map.Entry s : test.entrySet()) {
            morseToEnglish.put((String) s.getValue(), (char) s.getKey());
        }
    }
}
