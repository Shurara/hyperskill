package decryption;

public class Main {
    public static void main(String[] args) {
        String input = "welcome to hyperskill";
        int shift = 5;
        System.out.println(2 + 4 * 5 - 10 / (2 + 1));
        System.out.println(crypt(input,shift));

    }
    public static String crypt(String str, int n){
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Character symbol = str.charAt(i);
            if(!Character.isLetter(symbol)){
                output.append(symbol);
            }else{
                output.append(symbol + n);
            }

        }
        return output.toString();
    }
}
