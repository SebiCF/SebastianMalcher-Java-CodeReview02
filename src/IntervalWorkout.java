class IntervalWorkout {
    private Exercise[] exercisePlan;
    private int repetitions;
    private int breaktime;

    IntervalWorkout(Exercise[] exercisePlan, int repetitions, int breaktime) {
        this.exercisePlan = exercisePlan;
        this.repetitions = repetitions;
        this.breaktime = breaktime;
    }

    void printWorkoutPlan() {
        for (int i = 0; i < repetitions; i++) {
            if(i==0){
                System.out.println(
                        "\n*********************" +
                        "\nInterval Workout START" +
                        "\n*********************"
                );
            }
            System.out.println(
                    "Round " + (i + 1)
            );
            for (Exercise exercise : exercisePlan) {
                System.out.println(
                        exercise.getExerciseName()
                );
            }
                if (i != repetitions - 1) {
                    System.out.println(
                            "------------------------------" +
                            "\nDO THE BREAK (" + breaktime + " seconds)" +
                            "\n------------------------------"
                    );
                } else {
                    System.out.println(
                            "\n*********************" +
                            "\nYOU ARE DONE CONGRATZ" +
                            "\n*********************"
                    );
                }
            }
        }
    }

