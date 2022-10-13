public class Runner
{
    public static void main(String[] args)
    {
        String x = "Hello there!";
        int ind1 = x.indexOf("there");
        String letter1 = x.substring(ind1).substring(3,3+1);

        int ind2 = x.indexOf("ll");
        String letter3 = x.substring(ind2,ind2+2);
        String letter2 = x.substring(x.indexOf("o"), (x.indexOf("o")+1));

        System.out.println("The secret letter is: \""+ letter1 +letter2 + letter3+ "\"");




    }
}
