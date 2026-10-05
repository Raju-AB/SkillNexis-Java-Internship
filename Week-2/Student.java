class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "Raju", 22, "Java Programming");
        Student student2 = new Student(102, "Rahul", 21, "Python");
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
    }
}
