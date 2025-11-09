// Nama : Atikah Dhiya
// NIM  : L0324007

public final class ImmutableStudent {
    private final String name;
    private final int score;

    public ImmutableStudent(String name, int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Nilai harus antara 0 sampai 100");
        }
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public ImmutableStudent withAddedScore(int delta) {
        int newScore = score + delta;
        if (newScore > 100) newScore = 100;
        if (newScore < 0) newScore = 0;
        return new ImmutableStudent(name, newScore);
    }
}
