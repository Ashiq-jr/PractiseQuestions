public class PatternType1
{
    public static void main(String[] args)
    {
        CheckerBoard(5);
    }



    //SquareBoard
    static void squareBoard(int N)
    {
        for(int row=1; row<=N; row++)
        {
            for(int column=1; column<=N; column++)
            {
                System.out.print("#" + " ");
            }

            System.out.println();
        }
    }

    //CheckerBoard
    static void CheckerBoard(int N)
    {
        for(int row=1; row<=N; row++)
        {
            if(row %2 == 0)
            {
                System.out.print(" ");
            }
            for(int column=1; column<=N; column++)
            {
                System.out.print("#" + " ");
            }

            System.out.println();
        }
    }
}