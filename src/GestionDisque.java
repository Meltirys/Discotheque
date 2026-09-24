import java.time.LocalDate;
import java.util.ArrayList;

public class GestionDisque {
    private static ArrayList<Disque> discotheque= new ArrayList<>();



    public static void creerDisque(String n, Auteur a, LocalDate d){
        //TODO instancier le disque
        //TODO ajouter le disque à la discotheque
    }
    public static void creerDisque(Disque d){
        //TODO ajouter le disque à la discotheque
        getDiscotheque().add(d);
    }
    public static void supprimerDisque(String n) throws DoublonException{
        //TODO Suppression du disque par son nom
        //levée d'exception si supprime 2 disques
        ArrayList<Disque> disqueTrouves = new ArrayList<>();

        for (Disque d : discotheque) {
            if(d.getNom().equals(n)) {
                disqueTrouves.add(d);
            }
        }
        if(disqueTrouves.size() >= 2) {
            throw new DoublonException("Plusieurs disques ont été trouvés");
        } else if (disqueTrouves.size() == 1) {
            discotheque.remove(disqueTrouves.get(0));
        }
    }
    public static void supprimerDisque(String n, Auteur a){
        //TODO Suppression du disque à deux paramètres (le nom et son auteur)
        for (Disque d : discotheque) {
            if (d.getNom().equals(n)
                    && d.getAuteur().getNom().equals(a.getNom())
                    && d.getAuteur().getPrenom().equals(a.getPrenom())) {
                discotheque.remove(d);
            }

        }

    }

    public static ArrayList<Disque> getDiscotheque() {
        return discotheque;
    }

    public static void setDiscotheque(ArrayList<Disque> discotheque) {
        GestionDisque.discotheque = discotheque;
    }

    public void afficherDiscotheque(){
        System.out.println(getDiscotheque());
    }
}
