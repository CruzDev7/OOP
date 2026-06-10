public class Dolar extends Moeda{


    public Dolar(double valor){
        super(valor);
    }

    @Override
    public double converter() {
        return valor * 5.50;
    }
    // reescrita do metodo toString para mostrar os nomes, dos items na listagem!
    @Override
    public String toString() {
        return "Dolar: US$: " + valor;
    }
}
