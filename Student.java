import java.util.ArrayList;
import java.util.List;

public final class Student {

    private final int id;
    private final String name;
    private final List<String> subjects;

    public Student(int id, String name, List<String> subjects) {
        this.id = id;
        this.name = name;

        // Defensive copy (IMPORTANT)
        this.subjects = new ArrayList<>(subjects);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getSubjects() {
        // Return a copy, not original reference
        return new ArrayList<>(subjects);
    }
}
