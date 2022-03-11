import java.util.Arrays;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"adorable", "amused", "busy", "bored", "clean", "calm", "crazy", "dark", "dizzy", "dull"};
        String[] nouns = {"tiger", "cheese", "jug", "knee", "rose", "bathtub", "human", "alien", "dog", "burger"};

        String adjective = pickRandomArrayName(adjectives);
        String noun = pickRandomArrayName(nouns);

        System.out.printf("Here is your server name:\n %s-%s", adjective, noun);
    }

    private static String pickRandomArrayName(String[] stringsArray){
        int index = (int) (Math.random() * stringsArray.length);
        return stringsArray[index];
    }
}
