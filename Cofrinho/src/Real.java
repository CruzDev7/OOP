public class Real extends Moeda {
    public Real(double valor){
        super(valor);
    }

    @Override
    public double converter() {
        return valor;
    }
    // reescrita do metodo toString para mostrar os nomes, dos items na listagem!
    @Override
    public String toString() {
        return "Real: R$ " + valor;
    }
}
