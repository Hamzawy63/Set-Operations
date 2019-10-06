import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataItem {
    HashMap<String , Integer> universe;
    int universeSize ; // length of the universe
    boolean subsets[][]; // length of this array is 26 * n
    Scanner sc ;

    public DataItem() {
        this.universe = new HashMap<String , Integer>();
        this.universeSize = universe.size() ;
        subsets =  new boolean[26][universeSize];
        sc = new Scanner(System.in);
    }
    public void addUniverse()
    {
        System.out.println("Enter The Length of your universe");
        int n = sc.nextInt();
        System.out.println("Enter your universe elements one at a line ");
        for (int i = 0; i <n ; i++) {
            universe.put(sc.nextLine() , i);
        }
    }
    public void AddSubset(char name )
    {
        System.out.println("Enter the name of your subset ");
        name = Character.toUpperCase(name) ;
        System.out.println("Enter the size  of your subset ");
        int size = sc.nextInt();
        System.out.println("Enter your subset elements ");
        for (int i = 0; i <size ; i++) {
            String s = sc.nextLine();
            while (!universe.containsKey(s))
            {
                System.out.println("invalid entry");
                s = sc.nextLine();
            }
        }

    }

}
