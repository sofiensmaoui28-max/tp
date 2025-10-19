class Segment {
    int extr1;
    int extr2;


    public Segment(int e1, int e2) {
        this.extr1 = e1;
        this.extr2 = e2;
    }


    public int longueur() {
        return Math.abs(extr2 - extr1);
    }


    public boolean appartient(int point) {
        int min = Math.min(extr1, extr2);
        int max = Math.max(extr1, extr2);
        return point >= min && point <= max;
    }

    public String toString() {
        return "segment (" + Math.min(extr1, extr2) + ", " + Math.max(extr1, extr2) + ")";
    }
}