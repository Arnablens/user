package entity;

public class Movies {
	
	String movieName;
	public Movies() {
		super();
	}
	public Movies(String movieName) {
		super();
		
		this.movieName = movieName;
	}
	
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	@Override
	public String toString() {
		return "Movies [movieName=" + movieName + "]";
	}
	
	
	

}
