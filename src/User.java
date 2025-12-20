class User {
    private String name;
    private double weight;
    private WorkoutRoutine routine;

    public User(String name, double weight, WorkoutRoutine routine) {
        this.name = name;
        this.weight = weight;
        this.routine = routine;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public WorkoutRoutine getRoutine() { return routine; }
    public void setRoutine(WorkoutRoutine routine) { this.routine = routine; }

    public void displayInfo() {
        System.out.println("User: " + name + ", Weight: " + weight + "kg");
        if (routine != null) {
            routine.printDetails();
        }
    }
}
