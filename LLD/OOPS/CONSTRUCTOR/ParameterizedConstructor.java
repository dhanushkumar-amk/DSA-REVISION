package LLD.OOPS.CONSTRUCTOR;


class Movie1{
    private String title;
    private int duration;

    public Movie1(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void displayMovieInfo(){
        System.out.println("The movie name is " + this.title + " and it has a duration of " + this.duration + " hours");
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Movie1 avengers = new Movie1("Avengers Endgame", 3);
        avengers.displayMovieInfo();
    }
}
