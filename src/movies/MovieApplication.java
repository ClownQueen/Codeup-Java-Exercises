package movies;

import util.Input;

public class MovieApplication {

    public static void main(String[] args) {
        Input input = new Input();
        Movie [] movies = MoviesArray.findAll();

        int choice = 0;
        do {
            printMenu();

            choice = input.getInt("Enter your choice: ", 0, 5);
            if (choice == 0){
                break;
            }

            doUserChoice(choice, movies);

        }while (choice != 0);
    }

    private static void printMenu() {
        System.out.println("What would you like to do?\n" +
                "\n" +
                " 0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n\n");

    }

    private static void doUserChoice(int choice, Movie[] movies) {
        switch (choice){
            case 1:
                printMovies(movies, "");
                break;
            case 2:
                printMovies(movies, "animated");
                break;
            case 3:
                printMovies(movies, "drama");
                break;
            case 4:
                printMovies(movies, "horror");
                break;
            case 5:
                printMovies(movies, "scifi");
                break;
            default:
                break;
        }
    }

    private static void printMovies(Movie[] movies, String category) {
        for(Movie movie: movies){
            if (category.length() == 0 || movie.getCategory().equalsIgnoreCase(category)){
                System.out.println(movies);
            }
        }
        System.out.println();
    }


}
