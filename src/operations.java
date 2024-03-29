public class operations implements SetOperations {
    /**
     *This method to print union between two subsets
     *
     * @param data
     * @param first first subset
     * @param second second subset
     */
    public void union(DataItem data, char first, char second) {

        int firstSet=first-'A', secondSet=second-'A'; boolean flag=false;

        System.out.print("Result " + first + " ^ " + second + " : { ");

        for (int i=0; i < data.universeSize; i++) {
            if(data.subsets[firstSet][i] || data.subsets[secondSet][i]) {
                if (flag)
                    System.out.print(", ");
                System.out.print(data.universeId.get(i));
                flag=true;
            }
        }

        System.out.println(" }");
    }

    /**
     * This method print the intersection between two subsets
     *
     * @param data
     * @param first first subset
     * @param second second subset
     */
    public void intersection(DataItem data, char first, char second) {

        int firstSet=first-'A', secondSet=second-'A'; boolean flag=false;

        System.out.print("Result " + first + " v " + second + " : { ");

        for (int i=0; i < data.universeSize; i++) {
            if(data.subsets[firstSet][i] && data.subsets[secondSet][i]) {
                if (flag)
                    System.out.print(", ");
                System.out.print(data.universeId.get(i));
                flag=true;
            }
        }

        System.out.println(" }");
    }

    /**
     * This method for print complement of subset
     *
     * @param data
     * @param subset
     */
    public void complement(DataItem data, char subset) {

        int subSet=subset-'A'; boolean flag=false;

        System.out.print("Result " + subset + "' : { ");

        for (int i=0; i < data.universeSize; i++) {
            if(!data.subsets[subSet][i]) {
                if (flag)
                    System.out.print(", ");
                System.out.print(data.universeId.get(i));
                flag=true;
            }
        }
        System.out.println(" }");
    }
}
