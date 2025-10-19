class Testcompte {
    public static void main(String[] args) {

        Compte c1 = new Compte();
        Compte c2 = new Compte();

        c1.deposer(500);
        c2.deposer(1000);
        c2.retirer(10);
        c2.virerVers(70, c1);

        System.out.println("Solde du premier compte : ");
        c1.affiche();

        System.out.println("Solde du second compte : ");
        c2.affiche();


        Compte[] comptes = new Compte[10];

        for (int i = 0; i < comptes.length; i++) {
            comptes[i] = new Compte();
        }

        for (int i = 0; i < comptes.length; i++) {
            comptes[i].deposer(10 * i);
        }

        for (int i = 1; i < comptes.length; i++) {
            comptes[0].virerVers(20, comptes[i]);
        }

        for (int i = 0; i < comptes.length; i++) {
            System.out.print("Compte " + i + " : ");
            comptes[i].affiche();
        }
    }
}