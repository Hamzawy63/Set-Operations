public class Main {
    /*
    Test code
     */
    static FastReader sc = new FastReader();
    public static void main(String[] args) {
        DataItem data = new DataItem();
        operations utils = new operations();
        System.out.println("Welcome to a simple set operations simulation ");
        data.addUniverse();
        int n = openMessange();
       if(n == 1)
       {
            data.addSubset();
       }else if(n  == 2)
       {
           char f  = takeSetName();
           char s  = takeSetName();
           utils.union(data ,f,s);

       }else if(n == 3)
       {
           char f  = takeSetName();
           char s  = takeSetName();
           utils.intersection(data ,f,s);
       }else if(n == 4 )
       {
           char f  = takeSetName();
           utils.complement(data ,f);


       }

    }

    public static int openMessange()
    {
        System.out.println("press 1 to add subset");
        System.out.println("press 2 to find union");
        System.out.println("press 3 to find intersection");
        System.out.println("Press 4 to find complement");
        int n = sc.nextInt();
        while(n<1 && n>4)
        {
            System.out.println("Invalid");
            n = sc.nextInt();
        }
        return n;
    }
    public static char takeSetName()
    {
        char name = Character.toUpperCase(sc.nextLine().charAt(0));
        while (name <'A' || name > 'Z')
        {
            System.out.println("Invalid subset name try again");
             name = Character.toUpperCase(sc.nextLine().charAt(0));
        }
        return name ;
    }

}
