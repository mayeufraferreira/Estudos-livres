class AdaptadorPato extends Galinha {

    private Pato pato;

    public AdaptadorPato(Pato pato) {
        this.pato = pato;
    }

    public String getGrasnar()  {
        return getCacarejar();
    }

    public String getVoar() {
        return getPlanar();
    }

}
