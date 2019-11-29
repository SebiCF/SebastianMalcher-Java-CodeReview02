public class Main {

    public static void main(String[] args){
        Exercise[] exerciseArray = new Exercise[6];
        createExercises(exerciseArray);

        System.out.println("\nAll exercises");
        for (Exercise exercise : exerciseArray) {
            System.out.println("\n"+exercise.toString());
        }

        System.out.println("\n\nOnly on floor");
        for (Exercise exercise : exerciseArray) {
            if(exercise.getPosition().equals("Floor")){
                System.out.println("\n"+exercise.toString());
            }
        }

        System.out.println("\n\nOnly on floor and more than 1 minute");
        for (Exercise exercise : exerciseArray) {
            if(exercise.getPosition().equals("Floor") && exercise.getDuration() > 60){
                System.out.println("\n"+exercise.toString());
            }
        }
//        make new array for usage in intervalWorkout
        Exercise[] planExercises1 = {exerciseArray[0],exerciseArray[1],exerciseArray[2],exerciseArray[3]};
        Exercise[] planExercises2 = {exerciseArray[4],exerciseArray[0],exerciseArray[3]};

        IntervalWorkout plan1 = new IntervalWorkout(planExercises1,4,30);
        IntervalWorkout plan2 = new IntervalWorkout(planExercises2,3,40);

        System.out.println("\n\n Workout Plan\n");
        plan1.printWorkoutPlan();
        plan2.printWorkoutPlan();

    }

    public static void createExercises(Exercise[] exerciseArray){
        exerciseArray[0] = new Exercise("Push-ups","Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.",30,"Floor");
        exerciseArray[1] = new Exercise("Planks","Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.",90,"Floor");
        exerciseArray[2] = new Exercise("Squats","Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels.",45,"Standing");
        exerciseArray[3] = new Exercise("Backward Kick","Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.",60,"Floor");
        exerciseArray[4] = new Exercise("Leg Curl","Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg.",90,"Standing");
        exerciseArray[5] = new Exercise("Sidewards Back Stretch"," Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand.",60,"Standing");
    }
}
