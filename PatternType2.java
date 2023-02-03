public class PatternType2 {

    public static void main(String[] args)
    {
        int n = 7;
        sandTimerWithFrame(n);

        
    }

    static void hallowSquare(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            for(int column = 1; column <= n; column++)
            {
                if(row==1 || row == n || column == 1 || column==n)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }

            System.out.println();
        }
    }

    static void rightAngledTriangle(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            int stars = row;
            for(int column = 1; column <= stars; column++)
            {
                System.out.print("* ");     
            }

            System.out.println();
        }
    }

    static void mirroredRightAngledTriangle(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            int space = n - row;
            int stars = n - space;
            for(int giveSpace = 1; giveSpace <= space; giveSpace++)
            {
                System.out.print("  ");
            }
            for(int column = 1; column <= stars; column++)
            {
                System.out.print("* ");     
            }

            System.out.println();
        }
    }

    static void invertedRightAngledTriangle(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            int stars = n - row + 1;
            for(int column = 1; column <= stars; column++)
            {
                System.out.print("* ");     
            }

            System.out.println();
        }
    }

    static void invertedMirroredRightAngledTriangle(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            int space = row - 1;
            int stars = n - row + 1;
            for(int giveSpace = 1; giveSpace <= space; giveSpace++)
            {
                System.out.print("  ");
            }
            for(int column = 1; column <= stars; column++)
            {
                System.out.print("* ");     
            }

            System.out.println();
        }
    }

    static void alphabetZ(int n)
    {
        for(int row = 1; row <=n; row++)
        {
            for(int column = 1; column <=n; column++)
            {
                if(row == 1 || row == n || column == n - row + 1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void invertedAlphabetZ(int n)
    {
        for(int row = 1; row <=n; row++)
        {
            for(int column = 1; column <=n; column++)
            {
                if(row == 1 || row == n || column == row)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void sandTimer(int n)
    {
        for(int row = 1; row <=n; row++)
        {
            for(int column = 1; column <=n; column++)
            {
                if(row == 1 || row == n || column == n - row + 1 || column == row)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void sandTimerWithFrame(int n)
    {
        for(int row = 1; row <=n; row++)
        {
            for(int column = 1; column <=n; column++)
            {
                if(row == 1 || row == n || column == n - row + 1 || column == row || column == 1 || column == n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
