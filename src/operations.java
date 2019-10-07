public class operations implements SetOperations {
    /**
     *This method to print union between two subsets
     *
     * @param data
     * @param first first subset
     * @param second second subset
     */
    public void union(DataItem data, char first, char second) {

        int firstSet=first-'A', secondSet=second-'A';

        System.out.print("Result " + first + " ^ " + second + " : ");

        for (int i=0; i < data.universeSize; i++) {
            if(data.subsets[firstSet][i] || data.subsets[secondSet][i]) {
                System.out.print(data.universeId.get(i));
                System.out.print(" ");
            }
        }

        System.out.println();
    }

    /**
     * This method print the intersection between two subsets
     *
     * @param data
     * @param first first subset
     * @param second second subset
     */
    public void intersection(DataItem data, char first, char second) {

        int firstSet=first-'A', secondSet=second-'A';

        System.out.print("Result " + first + " v " + second + " : ");

        for (int i=0; i < data.universeSize; i++) {
            if(data.subsets[firstSet][i] && data.subsets[secondSet][i]) {
                System.out.print(data.universeId.get(i));
                System.out.print(" ");
            }
        }

        System.out.println();
    }

    /**
     * This method for print difference between two subsets
     *
     * @param data
     * @param first
     * @param second
     */
    public void difference(DataItem data, char first, char second) {

        int firstSet=first-'A', secondSet=second-'A';

        System.out.print("Result " + first + " - " + second + " : ");

        for (int i=0; i < data.universeSize; i++) {
            if(data.subsets[firstSet][i] && !data.subsets[secondSet][i]) {
                System.out.print(data.universeId.get(i));
                System.out.print(" ");
            }
        }

        System.out.println();
    }
}
