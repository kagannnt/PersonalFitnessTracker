public class Mainn           {
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