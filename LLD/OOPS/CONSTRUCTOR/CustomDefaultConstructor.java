package LLD.OOPS.CONSTRUCTOR;

class MovieClass{
    private String title;
    private int duration;

    public MovieClass(){
        this.title = "Avengers EndGame";
        this.duration = 2;
    }

    public void displayMovieInfo(){
        System.out.println("The movie name is " + title + " and it has a duration of " + duration + " hours");
    }
}

public class CustomDefaultConstructor {
    public static void main(String[] args) {
        MovieClass avengers = new MovieClass();
        avengers.displayMovieInfo();
    }
}
