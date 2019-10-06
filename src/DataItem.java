import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataItem {
    HashMap<String , Integer> universe;
    int universeSize ; // length of the universe
    boolean subsets[][]; // length of this array is 26 * n
    Scanner sc ;

    public DataItem(HashMap<String, Integer> universe) {
        this.universe = universe;
        this.universeSize = universe.size() ;
        subsets =  new boolean[26][universeSize];
        sc = new Scanner(System.in);
    }
    public void AddSubset(char name )
    {
        name = Character.toUpperCase(name) ;

    }
}
