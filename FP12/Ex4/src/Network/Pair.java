package Network;


public class Pair<T, Y extends Double> {

    private T vertex;
    private Y cost;

    /**
     *
     * @param vertex
     * @param cost
     */
    public Pair(T vertex, Y cost) {
        this.vertex = vertex;
        this.cost = cost;
    }

    public T getVertex() {
        return vertex;
    }

    public void setVertex(T vertex) {
        this.vertex = vertex;
    }

    public Y getCost() {
        return cost;
    }

    public void setCost(Y cost) {
        this.cost = cost;
    }

    @Override
    public String toString(){
        String text = "";
        text+="vertex: " + getVertex() +
                ", minCostToVertex: " + getCost() + "\n";
        return text;
    }
}
