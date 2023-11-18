import java.math.BigDecimal;

public class CarneBacon extends Sanduiche {

    public String getNome() {
        return this.nome = "Carne, Bacon e Queijo Mussarela Ralado";
    }

    public double valor() {

        return 7.49;
    }

    String preco() {
        return "Sanduíche de Carne, Bacon e Queijo Mussarela Ralado $7.49";
    }

    @Override
    public String toString() {

        return "Sanduíche de " + getNome() + " custa $" + valor();
    }
}
