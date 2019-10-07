import java.util.*;
import java.io.*;
public class DataItem {
    HashMap<String, Integer> universe; // to have index when you have string
    ArrayList<String> universeId; // to have string when you have index
    int universeSize; // length of the universe
    boolean subsets[][]; // length of this array is 26 * n
    // private fields
    private FastReader sc;



    public DataItem() {
        this.universe = new HashMap<String, Integer>();
        sc = new FastReader();
        universeId = new ArrayList<>();
    }
    public void addUniverse() {
        System.out.println("Enter The Length of your universe");
        int n = sc.nextInt();
        System.out.println("Enter your universe elements one at a line ");
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            if (universe.containsKey(input)) {
                i--;
                n--;
            } else {
                universe.put(input, i);
                universeId.add(input);
            }
        }
        subsets = new boolean[26][universe.size()];
        universeSize = universe.size();



    }

    public void addSubset()
    {

        System.out.println("Enter Name of your subset (just one character)");
        char name = Character.toUpperCase(sc.nextLine().charAt(0));


        while( !(name>='A' && name <= 'Z'))
        {

            System.out.println("Invalid input");
            System.out.println("Enter Name of your subset (just one character)");
             name = Character.toUpperCase(sc.nextLine().charAt(0));
        }
        // overriding the previous set
        for (int i = 0; i <universeSize ; i++) {
            subsets[name - 'A'][i] = false;
        }

        System.out.println("Enter size of your subset ");
        int n =  sc.nextInt();
        System.out.println("Enter elements of your subsets line by  line");
        for (int i = 0; i <n ; i++) {
            String input = sc.nextLine();
            while(universe.get(input) == null)
            {
                System.out.println("This element is not in the universe enter a valid input ");
                input = sc.nextLine();
            }

            int idx  = universe.get(input);

            // add the element in our
            subsets[name - 'A'][idx] = true;
        }
    }



}