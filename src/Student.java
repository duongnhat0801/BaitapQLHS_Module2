class Student {
    private int id;
    private String name;
    private String email;
    private double GPA;

    public Student(int id, String name, String email, double GPA) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getGPA() {
        return GPA;
    }
}
