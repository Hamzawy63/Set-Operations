public class Main {
    /*
    Test code
     */
    static FastReader sc = new FastReader();
    public static void main(String[] args) {
        DataItem data = new DataItem();
        System.out.println("Welcome to a simple set operations simulation ");
        data.addUniverse();

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

}
