public interface SetOperations {

    public void union(DataItem data, char first, char second);

    public void intersection(DataItem data, char first, char second);

    public void complement(DataItem data, char subset);

}
