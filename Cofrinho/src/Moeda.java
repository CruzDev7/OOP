import java.util.ArrayList;

public abstract class Moeda {
    double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }
    public abstract double converter();

    public String toString(){
        return "Valor: " + valor;
    }

}
