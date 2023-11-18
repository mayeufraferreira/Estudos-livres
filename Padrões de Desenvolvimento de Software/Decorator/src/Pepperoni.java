import java.math.BigDecimal;

class Pepperoni extends Adicionais {

    private Sanduiche sanduiche;

    public Sanduiche getSanduiche(Sanduiche sanduiche) {

        return this.sanduiche = sanduiche;
    }

    public String getNome() {
        return this.nome = getSanduiche(sanduiche) + " + Pepperoni";
    }

    public double valor(){

        return 0.99;
    }

    public String preco() {
        return "O ingrediente adicional Pepperoni custa $0.99";
    }

    @Override
    public String toString() {
        double soma = valor() + sanduiche.valor;
        return getNome() + " custa $" + soma;
    }
}
