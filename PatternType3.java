public class PatternType3 {

    
    public static void main(String[] args) {

        numericGreaterThanSymbol(5);
        
    }

    static void alphabetRightAngledTriangle(int n)
    {
        int count = 97;

        for(int row = 1; row <=n; row++)
        {
            int noOfCharacters = row;
            for(int column = 1; column <= noOfCharacters; column ++)
            {
                System.out.print((char) count + " ");
                count++;
            }
            System.out.println();
        }

    }

    static void integerRightAngledTriangle(int n)
    {
        for(int row = 1; row <=n; row++)
        {
            int noOfCharacters = row;
            for(int column = 1; column <= noOfCharacters; column ++)
            {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    static void integerRightAngledTriangle2(int n)
    {
        int count = 1;
        for(int row = 1; row <=n; row++)
        {
            int noOfCharacters = row;
            for(int column = 1; column <= noOfCharacters; column ++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    static void rightAngledTrianglewWithReflection(int n)
    {
        for(int row = 1; row <=2 * n - 1; row++)
        {
            if(row <= n)
            {
                for(int column = 1; column <= row; column ++)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                int noOfCharacters = 2 * n - row;
                for(int column = 1; column <= noOfCharacters; column ++)
                {
                    System.out.print("* ");
                }
            }
            
            System.out.println();
        }
    }

    static void rightAngledIntegerTrianglewWithReflection(int n)
    {
        for(int row = 1; row <=2 * n - 1; row++)
        {
            if(row <= n)
            {
                for(int column = 1; column <= row; column ++)
                {
                    System.out.print("1 ");
                }
            }
            else
            {
                int noOfCharacters = 2 * n - row;
                for(int column = 1; column <= noOfCharacters; column ++)
                {
                    System.out.print("1 ");
                }
            }
            
            System.out.println();
        }
    }

    static void rightAngledAlphabetTrianglewWithReflection(int n)
    {
        int count = 97;
        for(int row = 1; row <=2 * n - 1; row++)
        {
            if(row <= n)
            {
                for(int column = 1; column <= row; column ++)
                {
                    System.out.print((char) count + " ");
                    count++;
                }
            }
            else
            {
                int noOfCharacters = 2 * n - row;
                for(int column = 1; column <= noOfCharacters; column ++)
                {
                    System.out.print((char) count + " ");
                    count++;
                }
            }
            
            System.out.println();
        }
    }

    static void rightAngledIntegerTrianglewWithReflection2(int n)
    {
        String zero = "0";
        int count = 1;
        for(int row = 1; row <=2 * n - 1; row++)
        {
            if(row <= n)
            {
                for(int column = 1; column <= row; column ++)
                {
                    if(count <= 9)
                    {
                        System.out.print(zero + count + " ");
                    }
                    else
                    {
                        System.out.print(count + " ");
                    }
                    count++;
                    
                }
            }
            else
            {
                int noOfCharacters = 2 * n - row;
                for(int column = 1; column <= noOfCharacters; column ++)
                {
                    if(count <= 9)
                    {
                        System.out.print(zero + count + " ");
                    }
                    else
                    {
                        System.out.print(count + " ");
                    }
                    count++;
                }
            }
            
            System.out.println();
        }
    }

    static void greaterThanSymbol(int n)
    {
        for(int row = 1; row <= 2 * n -1; row++)
        {
            if(row <= n)
            {
                for(int column = 1; column <=n; column++)
                {
                    if(row == column)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            else{               

                for(int column = 1; column <=n; column++)
                {
                    if(column == 2 * n - row)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    
    static void numericGreaterThanSymbol(int n)
    {
        for(int row = 1; row <= 2 * n -1; row++)
        {
            if(row <= n)
            {
                for(int column = 1; column <=n; column++)
                {
                    if(row == column)
                    {
                        System.out.print("1 ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            else{               

                for(int column = 1; column <=n; column++)
                {
                    if(column == 2 * n - row)
                    {
                        System.out.print("1 ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
    

