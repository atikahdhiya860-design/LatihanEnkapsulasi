// Nama : Atikah Dhiya
// NIM  : L0324007

public class MainImmutable {
    public static void main(String[] args) {
        ImmutableStudent s1 = new ImmutableStudent("Atikah", 80);
        ImmutableStudent s2 = s1.withAddedScore(15);

        System.out.println("Nilai s1: " + s1.getScore());
        System.out.println("Nilai s2: " + s2.getScore());
    }
}
