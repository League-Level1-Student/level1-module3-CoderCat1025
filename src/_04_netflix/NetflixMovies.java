package _04_netflix;

public class NetflixMovies {
static final Movie movie1 = new Movie("Harry Potter and the Sorcerer's Stone", 5);
static final Movie movie2 = new Movie("Bad Movie", 2);
static final Movie movie3 = new Movie("AAAAA", 1);
static final Movie movie4 = new Movie("Netflix Original", 4);
static final Movie movie5 = new Movie("Not Netflix Original", 2);


String ticket = movie4.getTicketPrice();

NetflixQueue queue = new NetflixQueue();

public static void main(String[] args) {
	NetflixMovies movies = new NetflixMovies();
	movies.queue.addMovie(movie1);
	movies.queue.addMovie(movie2);
	movies.queue.addMovie(movie3);
	movies.queue.addMovie(movie4);
	movies.queue.addMovie(movie5);

	movies.queue.printMovies();
	System.out.println("The best movie is " + movies.queue.getBestMovie());
	System.out.println("The second best movie is " + movies.queue.getMovie(1));
}
}