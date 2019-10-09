import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        System.out.println("Kindly key in a word or a sentence");
        Scanner input1 = new Scanner(System.in);
        String input = input1.nextLine();
        System.out.println("Select either of the values below \n 1.Encrypt \n 2.Decrypt \n 3.exit");
        Scanner val = new Scanner(System.in);
        int choice = val.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You have selected Encryption");
                    System.out.println("Enter key value to shift the charaters");
                    Scanner number = new Scanner(System.in);
                    int key2 = number.nextInt();
                    Encode x =new Encode(key2,input);
                    System.out.println("Encrypted text is "+x.encrypt(input,key2));
                    break;
                case 2:
                    System.out.println("You have selected Decryption");
                    System.out.println("Enter key value to displace the characters");
                    Scanner number1 = new Scanner(System.in);
                    int key3 = number1.nextInt();
                    Decode y = new Decode(key3,input);
                    System.out.println("Decrypted text is "+y.decrypt(input,key3));

                    break;
                case 3:
                    System.out.println("Thank you for using the app");
                    System.exit(0);
                default:
                    System.out.println("Kindly select a valid input");
            }


        }
}
