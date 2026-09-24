public class Main {
    public static void main(String[] args)  {


            Controller c = new Controller();
            int choix=0;

                do {
                    try {
                    c.afficherMenu();
                    System.out.print("Choix:");
                    choix = Controller.scan.nextInt();

                    switch (choix) {
                        case 1:
                            c.ajouterDisque();
                            break;
                        case 2:
                            c.supprimerDisque();
                            break;
                        case 3:
                            c.afficherDiscotheque();
                            break;
                        case 4:
                            c.viderDiscotheque();
                            break;
                        case 0:
                            System.out.println("Fin du programme. Au revoir !");
                            break;
                        default:
                            System.out.println("Choix invalide, veuillez réessayer.");
                    }

                    System.out.println();
                }catch(AuteurException e){
                    System.out.println(e.getMessage());
                }catch(DisqueException e){
                    System.out.println(e.getMessage());
                }

                } while (choix != 0);

        Controller.scan.close();

    }
}
