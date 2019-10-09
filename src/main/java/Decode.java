import java.lang.StringBuffer;
public class Decode {
    private int key;
    private String word;

    public Decode(int key, String word) {
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


    public static String decrypt(String word, int key){

        if(key>26){
            key=key%26;
        }else{
            key = (key%26)+26;
        }
        String decryption="";
        for(int i=0;i<word.length();i++) {
            char newCharacter = word.charAt(i);
            if (Character.isLetter(newCharacter)) {
                if (Character.isLowerCase(newCharacter)) {
                    char c = (char) (newCharacter - key);
                    if (c < 'a') {
                        decryption = decryption+ (char) (newCharacter + (26 - key));
                    } else {
                        decryption = decryption + c;
                    }
                } else if(Character.isUpperCase(newCharacter)) {
                    char c = (char) (newCharacter + key);
                    if (c < 'A'){
                        decryption = decryption + (char) (newCharacter + (26 - key));
                    } else {
                        decryption = decryption + c;
                    }
                }
                else{
                    decryption = decryption + newCharacter;
                }
            }

        }

        return decryption;
    }
}

