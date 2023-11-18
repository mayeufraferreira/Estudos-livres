import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int op = Integer.parseInt(JOptionPane.showInputDialog("Que operação quer realizar?" + "\n"
                + "1.Soma" + "\n" + "2.Subtração" + "\n" + "3. Multiplicação"));

        if (op == 1) {
            Soma soma = new Soma();
            JOptionPane.showMessageDialog(null, soma.execute(num1, num2));
        } else if (op == 2) {
            Subtracao subtracao = new Subtracao();
            JOptionPane.showMessageDialog(null, subtracao.execute(num1, num2));
        } else if (op == 3) {
            Multiplicacao multiplicacao = new Multiplicacao();
            JOptionPane.showMessageDialog(null, multiplicacao.execute(num1, num2));
        } else {
            JOptionPane.showMessageDialog(null, "Essa operação não existe");
        }
    }
}