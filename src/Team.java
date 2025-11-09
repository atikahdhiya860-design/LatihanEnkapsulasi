// Nama : Atikah Dhiya
// NIM  : L0324007

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<StudentV2> members = new ArrayList<>();

    public void addMember(StudentV2 s) {
        if (s == null) {
            throw new IllegalArgumentException("Member tidak boleh null");
        }
        members.add(s);
    }

    public List<StudentV2> getMembers() {
        return new ArrayList<>(members);
    }
}
