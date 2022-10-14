public class String1 {
    private String word;
    private int length;
    private String firstHalf;
    private String secondHalf;


    public String1(String word)
    {
        this.word = word;
    }

    public int getLength()
    {
        this.length = word.length();
        return length;
    }

    public String getFirstHalf()
    {
        int indexF = (length/2);
        this.firstHalf = word.substring(0, indexF);
        return firstHalf;
    }

    public String getSecondHalf()
    {
        int indexF = (length/2);
        this.secondHalf = word.substring(indexF);
        return secondHalf;
    }
}


