public class Alimentara extends Magazin implements IAlimentara{

    private String adresa;
    private String telefon;

    public Alimentara(int id, String nume, float suprafata, String adresa, String telefon) {
        super(id, nume, suprafata);
        this.adresa = adresa;
        this.telefon = telefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public void start() {
        System.out.println("Alimentara de la adresa: " + getAdresa() + " are numarul de telefon :"+getTelefon());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Alimentara{");
        sb.append(super.toString());
        sb.append("adresa='").append(adresa).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere() {
        System.out.println(this.toString());
    }
}
