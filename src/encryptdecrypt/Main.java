package encryptdecrypt;

import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        String inputString = "we found a treasure!";
        StringBuilder output = new StringBuilder();
        Character[]alphabetArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Character[]reverseAlphabetArray = {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
        for (int i = 0; i < inputString.length(); i++) {
            Character toCheckValue = inputString.toLowerCase().charAt(i);
            if(Character.isLetter(toCheckValue)) {
                int index = Arrays.asList(alphabetArray).indexOf(toCheckValue);
                output.append(reverseAlphabetArray[index]);
            }else{
                output.append(toCheckValue);
            }
        }
        System.out.println(output.toString());
    }

}

