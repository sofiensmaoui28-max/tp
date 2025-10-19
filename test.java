public class TestSegment {
    public static void main(String[] args) {
        int origine = -35;
        int extremite = 44;
        int point = 10;

        Segment segment = new Segment(origine, extremite);
        System.out.println("Segment: " + segment.toString());
        System.out.println("Longueur: " + segment.longueur());


        if (segment.appartient(point)) {
            System.out.println("Le point " + point + " appartient au segment");
        } else {
            System.out.println("Le point " + point + " n'appartient pas au segment");
        }
        
        System.out.println("\n--- Autres tests ---");
        Segment seg2 = new Segment(0, 100);
        System.out.println("Segment: " + seg2);
        System.out.println("Longueur: " + seg2.longueur());
        System.out.println("Le point 50 appartient-il? " + seg2.appartient(50));
        System.out.println("Le point 150 appartient-il? " + seg2.appartient(150));
    }
}