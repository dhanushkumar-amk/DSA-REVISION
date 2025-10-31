package LLD.OOPS.CONSTRUCTOR;


class Movie{
    private String title; // default value is null
    private int duration; // default value is 0

    public void displayMovieInfo(){
        System.out.println("The movie name is " + title + " and it has a duration of " + duration + " hours");
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Movie avengers = new Movie();
        avengers.displayMovieInfo();
    }
}



