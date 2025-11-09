// Nama : Atikah Dhiya
// NIM  : L0324007

public class MainStudent {
    public static void main(String[] args) {
        Student s = new Student("Atikah", 90);
        System.out.println("Nama: " + s.getName());
        System.out.println("Nilai: " + s.getScore());

        s.setScore(95);
        System.out.println("Nilai baru: " + s.getScore());
    }
}
