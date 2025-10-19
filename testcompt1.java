class Compte {
    int solde = 0;

    void deposer(int montant) {
        solde = solde + montant;
    }

    void retirer(int montant) {
        solde = solde - montant;
    }

    void virerVers(int montant, Compte destinataire) {
        this.retirer(montant);
        destinataire.deposer(montant);
    }

    void affiche() {
        System.out.println("solde = " + solde);
    }
}