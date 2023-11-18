public class Main {

    public static void main(String[] args) {

        CarneBacon carneBacon = new CarneBacon();
        System.out.println(carneBacon.preco());

        FrangoAssado frango = new FrangoAssado();
        System.out.println(frango.preco());

        Pepperoni pepperoni = new Pepperoni();
        System.out.println(pepperoni.preco());

        QueijoMussarelaRalado queijo = new QueijoMussarelaRalado();
        System.out.println(queijo.preco());
    }
}
