import java.util.ArrayList;
import java.util.HashMap;

public class DataItem {
    HashMap<String , Integer> universe;
    int n ; // length of the universe
    int arr[][]; // length of this array is 26 * n

    public DataItem(HashMap<String, Integer> universe) {
        this.universe = universe;
        this.n = universe.size() ;
    }
    public void AddSubset(char name )
    {

    }
}
