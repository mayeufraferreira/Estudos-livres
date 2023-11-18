public class AdaptadorPatoDemo {
    public static void main(String[] args) {
         Pato pato = new Pato();
         AdaptadorPato adaptadorPato = new AdaptadorPato(pato);
         System.out.println(adaptadorPato.getGrasnar());
         System.out.println(adaptadorPato.getVoar());
    }
}