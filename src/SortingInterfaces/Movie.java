package SortingInterfaces;

public class Movie implements Comparable<Movie> {
	
	int rating;
	double length;
	public Movie(int rating, double length) {
		super();
		this.rating = rating;
		this.length = length;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.rating- o.rating;
	}
	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", length=" + length + "]";
	}
	
	
	
	

}
