package com.dindinn;

public class Main
{

    public static void main(String[] args)
    {
        String word = "";
        int number = 0;

        try{
            word = args[0];
            number = Integer.parseInt(args[1]);
        }catch (Exception exception){
            System.out.println("Invalid or No input. The first param should be a String and second should be an integer.");
            System.exit(1);
        }

        System.out.println(cyclicCipher(word, number));
    }


    /**
     * cyclicCipher ciphers a given word by shifting its characters
     * by a given number. It is also cyclic in nature.
     * <p>
     * time complexity: O(n)
     * space complexity: (in terms of a char array) O(n)
     *
     * @param word   - input string
     * @param number - number of rotations
     * @return
     */
    private static String cyclicCipher(String word, int number)
    {
        StringBuffer result = new StringBuffer();

        for (char c : word.toCharArray())
        {
            if (Character.isUpperCase(c))
            {
                char ciphered = (char) ((((c + number) - 65) % 26) + 65);
                result.append(ciphered);
            }
            else
            {
                char ciphered = (char) ((((c + number) - 97) % 26) + 97);
                result.append(ciphered);
            }
        }
        return result.toString();
    }
}
