public class FitnesApp {
    public static void main(String[] args) {

        User user1 = new User("Ivan", 20, 75.0);
        User user2 = new User("Anna", 22, 55.5);


        WorkoutRoutine cardio = new WorkoutRoutine("Running", 30, 300);
        WorkoutRoutine strength = new WorkoutRoutine("Weightlifting", 60, 250);


        System.out.println("--- Profiles ---");
        user1.displayInfo();
        user2.displayInfo();

        System.out.println("\n--- Routines ---");
        cardio.displayWorkout();
        strength.displayWorkout();


        System.out.println("\n--- Comparison ---");
        if (user1.getAge() > user2.getAge()) {
            System.out.println(user1.getName() + " is older than " + user2.getName());
        } else if (user1.getAge() < user2.getAge()) {
            System.out.println(user2.getName() + " is older than " + user1.getName());
        } else {
            System.out.println("They are the same age.");
        }
    }
}