import java.util.*;
import java.io.*;
public class DataItem {
    HashMap<String, Integer> universe; // to have index when you have string
    ArrayList<String> universeId; // to have string when you have index
    int universeSize; // length of the universe
    boolean subsets[][]; // length of this array is 26 * n
    // private fields
    private FastReader sc;
    private boolean[] subsetNames;
    private int numberOfSubsets;



    public DataItem() {
        this.universe = new HashMap<String, Integer>();
        sc = new FastReader();
        universeId = new ArrayList<>();
        subsetNames = new boolean[26];
        numberOfSubsets = 0;
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
        if(numberOfSubsets == 26) // then we have used all the characters
        {
            System.out.println("Sorry you have used all the names");
            return;
        }

        System.out.println("Enter Name of your subset (just one character)");
        char name = Character.toUpperCase(sc.nextLine().charAt(0));


        while( !(name>='A' && name <= 'Z') ||  subsetNames[name - 'A'])
        {

            System.out.println("Invalid input or this character is taken ");
            System.out.println("Enter Name of your subset (just one character)");
             name = Character.toUpperCase(sc.nextLine().charAt(0));
        }
        numberOfSubsets++;
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