package warmup;

public class Monster {
    private final int energy;

    public Monster(int energy) {
        this.energy = energy;
    }

    public int Exercise(int energy){
        while(energy > 0){
            System.out.println("The Monster is now exercising.");
            return 5 - energy;
        }
        return energy;
    }

}
