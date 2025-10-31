package LLD.OOPS.CONSTRUCTOR;


class Movie2{
    public String title;
    private int duration;

    public Movie2(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public Movie2(Movie2 other){
        this.title = other.title;
        this.duration = other.duration;
    }

    public void displayMovieInfo(){
        System.out.println("The movie name is " + this.title + " and it has a duration of " + this.duration + " hours");
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Movie2 original = new Movie2("Inception", 3);
        Movie2 copy = new Movie2(original);
        copy.title = "endGame";
        copy.displayMovieInfo();
        original.displayMovieInfo();  // if you can modify the copy one it will not change the original
    }
}
