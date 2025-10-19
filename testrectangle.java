class Compteur {
    int x;

    Compteur(int n) {
        x = n;
    }

    Compteur incremente() {
        x++;
        return this;
    }

    int value() {
        return x;
    }
}