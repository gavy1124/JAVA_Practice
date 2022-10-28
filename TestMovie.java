package Git;

public class TestMovie { 
	public static void main(String[] args) { 
		Movie myMovie = new Movie();
		
		myMovie.setTitle("어거스트 러쉬");
		myMovie.setGenre("Drama");
		myMovie.play();
		
		System.out.println("--------------------");

		Movie yourMovie = new Movie();
		yourMovie.setTitle("나는 전설이다");
		yourMovie.setGenre("SF");
		yourMovie.play();
	}
}
class Movie{
	String title;
	String genre;
	void play() {
		System.out.println(title+"("+genre+")"+"상영중입니다.");
	}
	public Movie() {}
	public Movie(String title, String genre) {
		super();
		this.title = title;
		this.genre = genre;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}