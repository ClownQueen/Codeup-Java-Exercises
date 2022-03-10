import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//        Person [] myPeople = new Person[3];

//        myPeople[0] = new Person();
//        myPeople[0].setName("Jade");
//        myPeople[1] = new Person();
//        myPeople[1].setName("Robbie");
//        myPeople[2] = new Person();
//        myPeople[2].setName("Cat");
        Person [] myPeople = makePerson(3);

        printPeople(myPeople);
    }

    private static void printPeople(Person[] people){
        System.out.println(Arrays.toString(people));
    }

    public static Person [] makePerson(int person){
        Person [] people = new Person[person];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();
            people[i].setName("New Person " + (i + 1));
        }
        return people;
    }
}
