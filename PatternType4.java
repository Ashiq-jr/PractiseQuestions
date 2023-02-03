
public class PatternType4 {

    public static void main(String[] args)
    {
        mirroredNumericRightTriangle(8);
    }

    static void invertedTriangle(int n)
    {
        for(int row = 1; row <=n; row++)
        {
            int noOfSpaces = row - 1;
            for(int column = 1; column <= 2 * n - row; column++)
            {         
                if(column <= noOfSpaces)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
            
        }
            
    }

    static void triangle(int n)
    {
        for(int row = 1; row<=n; row++)
        {
            int noOfSpaces = n - row ;
            for(int column = 1; column <= row + n - 1; column++)
            {
                if(column <= noOfSpaces)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }

    static void triangleWithReflection(int n)
    {
        for(int row = 1; row <= 2*n-1; row++)
        {
            if(row <= n)
            {
                int noOfSpaces = n - row;
                for(int column = 1; column <= n + row - 1; column++)
                {
                    if(column <= noOfSpaces)
                    {
                        System.out.print("  ");
                    }
                    else
                    {
                        System.out.print("* ");
                    }
                }
            }
            else
            {
                int noOfSpaces = row - n;
                for(int column = 1; column <= 2 * n - (row - n + 1); column++)
                {
                    if(column <= noOfSpaces)
                    {
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }     
    }

    static void numericRightTriangle(int n)
    {
        for(int row = 1; row <= n; row ++)
        {
            for(int column = 1; column <= row; column++)
            {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    static void mirroredNumericRightTriangle(int n)
    {
        for(int row = 1; row <= n; row ++)
        {
            int noOfSpaces = n - row;
            int count = 8;
            for(int column = 1; column <= n ; column++)
            {
                if(column <= noOfSpaces)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(count + " ");
                }
                count--;
            }
            System.out.println();
        }
    }

    static void InvertedNumericRightTriangle(int n)
    {
        for(int row = 1; row <= n; row ++)
        {
            int count = n - row + 1;
            for(int column = 1; column <= n - row + 1; column++)
            {
                System.out.print(count + " ");
                count--;
            }
            System.out.println();
        }
    }

    static void InvertedMirroredNumericRightTriangle(int n)
    {
        for(int row = 1; row <= n; row ++)
        {
            int noOfSpaces = row - 1;
            int count = 1;
            for(int column = 1; column <= n ; column++)
            {
                if(column <= noOfSpaces)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(count + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }




    
}
