public abstract class Magazin {

    private int id;
    private String nume;
    private float suprafata;

    public Magazin(int id, String nume, float suprafata) {
        this.id = id;
        this.nume = nume;
        this.suprafata = suprafata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Magazin{");
        sb.append("id=").append(id);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", suprafata=").append(suprafata);
        sb.append('}');
        return sb.toString();
    }

    public abstract void start();
}
