import java.util.ArrayList;

public class Adressbuch {
    private ArrayList<Adresse> adressBuch;

    public Adressbuch() {
        this.adressBuch = new ArrayList<>();
    }

    public void adresseHinzufuegen(Adresse adresse){
        this.adressBuch.add(adresse);
    }

    public void adresseLoeschen(Adresse adresse){
        this.adressBuch.remove(adresse);
    }

    public void adresseBearbeiten(Adresse adresseAlt, Adresse adresseNeu){
        adresseLoeschen(adresseAlt);
        adresseHinzufuegen(adresseNeu);
    }
}
