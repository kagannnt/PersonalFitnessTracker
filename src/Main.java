
class WorkoutRoutine {
    private String title;
    private int duration;

    public WorkoutRoutine(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }


    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public void printDetails() {
        System.out.println("Workout: " + title + " for " + duration + " minutes");
    }
}

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

public class Main {
    public static void main(String[] args) {

        WorkoutRoutine cardio = new WorkoutRoutine("Cardio", 45);
        WorkoutRoutine strength = new WorkoutRoutine("Powerlifting", 60);

        User user1 = new User("Alex", 80.0, cardio);
        User user2 = new User("John", 95.0, strength);

        System.out.println("--- Profiles ---");
        user1.displayInfo();
        user2.displayInfo();


        System.out.println("\n--- Comparison ---");
        if (user1.getWeight() < user2.getWeight()) {
            System.out.println(user2.getName() + " is heavier than " + user1.getName());
        } else {
            System.out.println(user1.getName() + " is heavier or equal.");
        }
    }
}