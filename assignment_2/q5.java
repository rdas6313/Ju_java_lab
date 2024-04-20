class ScoreBoundException extends Exception {
    public ScoreBoundException(String msg) {
        super(msg);
    }
}

class Student {
    private int roll;
    private String name;
    private int score;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
        this.score = 0;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) throws ScoreBoundException {
        if (score < 0 || score > 100)
            throw new ScoreBoundException("Score must be non negative and less equal to 100");
        this.score = score;
    }

}

public class q5 {
    public static void main(String[] args) {
        Student student = new Student(1, "Raja");
        try {
            System.out.println("Name: " + student.getName());
            System.out.println("Roll: " + student.getRoll());
            System.out.println("Setting score to 20");
            student.setScore(20);
            System.out.println("Current score: " + student.getScore());
            System.out.println("Setting score to -20");
            student.setScore(-20);
            System.out.println("Current score: " + student.getScore());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
