
public class Encode {

    private int key;
    private String word;

    public Encode(int key, String word) {
        this.key = key;
        this.word = word;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }



    public static String encrypt(String word, int key) {
        String encryption="";
        if(key>26){
            key=key%26;
        }else{
            key = (key%26)+26;
        }
        for(int i=0;i<word.length();i++) {
            char newCharacter = word.charAt(i);
            if (Character.isLetter(newCharacter)){
                if (Character.isLowerCase(newCharacter)){
                    char c = (char) (newCharacter + key);
                    if (c > 'z'){
                        encryption = encryption + (char) (newCharacter - (26 - key));
                    } else {
                        encryption = encryption + c;
                    }
                } else if(Character.isUpperCase(newCharacter)){
                    char c = (char) (newCharacter + key);
                    if (c >'Z') {
                        encryption = encryption + (char) (newCharacter - (26 - key));
                    } else {
                        encryption = encryption + c;
                    }
                }
                else{
                    encryption = encryption + newCharacter;
                }
            }
        }

        return encryption;
    }
}


