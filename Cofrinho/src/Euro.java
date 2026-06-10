public class Euro extends Moeda {

    public Euro(double valor){
        super(valor);
    }

    @Override
    public double converter() {
        return valor * 5.99;
    }

    // reescrita do metodo toString para mostrar os nomes, dos items na listagem!
    @Override
    public String toString() {
        return "Euro:  € " + valor;
    }
}
