// Nama : Atikah Dhiya
// NIM  : L0324007

public class StudentV2 {
    private String name;
    private int score;

    public StudentV2(String name, int score) {
        this.name = name;
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Nilai harus antara 0 sampai 100");
        }
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int delta) {
        if (score + delta > 100) {
            throw new IllegalArgumentException("Nilai maksimal 100");
        }
        score += delta;
    }

    public void reduceScore(int delta) {
        if (score - delta < 0) {
            throw new IllegalArgumentException("Nilai minimal 0");
        }
        score -= delta;
    }
}
