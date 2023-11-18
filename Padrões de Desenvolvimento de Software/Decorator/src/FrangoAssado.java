import java.math.BigDecimal;

public class FrangoAssado extends Sanduiche {

    public String getNome() {
        return "Frango Assado";
    }
    public double valor() {
        return 4.50;
    }

    String preco() {
        return "Sanduíche de Frango Assado custa $4.50";
    }

    @Override
    public String toString() {
        return "Sanduíche de " + getNome() + " custa $" + valor();
    }
}
