import java.math.BigDecimal;

class QueijoMussarelaRalado extends Adicionais {

    private Sanduiche sanduiche;

    public Sanduiche getSanduiche(Sanduiche sanduiche) {

        return this.sanduiche = sanduiche;
    }

    public String getNome() {
        return this.nome = getSanduiche(sanduiche) + " + Queijo Mussarela Ralado";
    }

    public double valor(){

        return 2.00;
    }

    public String preco() {
        return "O ingrediente adicional Queijo Mussarela Ralado custa $2.00";
    }

    @Override
    public String toString() {
        double soma = valor() + sanduiche.valor;
        return getNome() + " custa $" + soma;
    }

}
