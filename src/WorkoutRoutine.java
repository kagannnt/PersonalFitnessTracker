public class WorkoutRoutine {
    private String exerciseName;
    private int durationMinutes;
    private int caloriesBurned;

    public WorkoutRoutine(String exerciseName, int durationMinutes, int caloriesBurned) {
        this.exerciseName = exerciseName;
        this.durationMinutes = durationMinutes;
        this.caloriesBurned = caloriesBurned;
    }
    public String getExerciseName() { return exerciseName; }
    public void setExerciseName(String exerciseName) { this.exerciseName = exerciseName; }

    public int getDurationMinutes() { return durationMinutes; }
    public void setDurationMinutes(int durationMinutes) { this.durationMinutes = durationMinutes; }

    public int getCaloriesBurned() { return caloriesBurned; }
    public void setCaloriesBurned(int caloriesBurned) { this.caloriesBurned = caloriesBurned; }

    public void displayWorkout() {
        System.out.println("Workout: " + exerciseName + " | Time: " + durationMinutes + " min | Burned: " + caloriesBurned + " kcal");
    }
}