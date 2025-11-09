// Nama : Atikah Dhiya
// NIM  : L0324007

public class MainTeam {
    public static void main(String[] args) {
        Team team = new Team();

        StudentV2 s1 = new StudentV2("Atikah", 90);
        StudentV2 s2 = new StudentV2("Dhiya", 85);

        team.addMember(s1);
        team.addMember(s2);

        for (StudentV2 s : team.getMembers()) {
            System.out.println(s.getName() + " - " + s.getScore());
        }
    }
}
