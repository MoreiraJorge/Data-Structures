public class Carro {
    private String name;

    /**
     *
     * @param name
     */
    public Carro(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String toString(){
        String text = "Nome : " + this.name;
        return text;
    }
}