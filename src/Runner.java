import java.util.Scanner;
public class Runner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("First string: ");
        String word = input.nextLine();
        String1 word1 = new String1(word);
        int len1 = word1.getLength();

        //prints first string
        System.out.println("String length: "+ len1);
        System.out.println("First half: "+ word1.getFirstHalf());
        System.out.println("Second half: "+ word1.getSecondHalf());

        System.out.print("Second string: ");
        String word2 = input.nextLine();
        int length2 = word2.length();

        if (len1 > length2)
        {
            System.out.println(word + " is longer");
        }
        else if (len1 < length2)
        {
            System.out.println(word2 + " is longer");
        }
        else if (len1 == length2)
        {
            System.out.println("Both strings have the same length");
        }

        int comparing = word.compareTo(word2);
        if (comparing > 0)
        {
            System.out.println(word2+ " is first alphabetically");
        }
        else if (comparing < 0)
        {
            System.out.println(word+ " is first alphabetically");
        }
        else if (comparing == 0)
        {
            System.out.println("Both strings have the same exact characters");
        }

        int indexWW2 =

        if (word.indexOf(word2).substring()equals(word2))
        {
            int foundAt = word.indexOf(word2);
            System.out.println(word2+" is found in "+word+ " at "+ foundAt);
        }
        else
        {
            System.out.println(word2+" is NOT found in "+word);
        }






    }
}
