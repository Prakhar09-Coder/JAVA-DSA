public class RemoveLetterOccurence
{
    static String skip(String up)
    {
        if(up.isEmpty())
        {
            // System.out.println(p);
            return up;
        }

        char ch=up.charAt(0);
        if(ch=='a')
        {
            return skip(up.substring(1));
        }

        else
        {
            return ch+skip(up.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(skip("baba"));
    }
}