package Git;

public class VideoShop {
	public static void main(String[] args) {
		Content[] content = new Content[3];
		content[0] = new Video("변호인", "new");
		content[1] = new Video("탐정", "comic");
		content[2] = new Video("헬로카봇", "child");
		for (int i = 0; i < content.length; i++) {
			content[i].totalPrice();
			content[i].show();
		}

	}
}

abstract class Content {
	// 매개변수
	private String title;
	private int price;

	// 생성자(title을 매개변수로 받는)
	public Content() {
	}

	public Content(String title) {
		super();
		this.title = title;
	}

	public Content(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	// 세터게터
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 메소드
	abstract void totalPrice();

	public void show() { // title비디오의 가격은 price입니다. 라고 출력
		System.out.println(title + " 비디오의 가격은 " + price + "입니다.");
	}

}

class Video extends Content {
	// 매개변수
	private String genre;

	// 생성자 (타이틀,장르)
	public Video() {
	}

	public Video(String title, String genre) {
		super(title);
		this.genre = genre;
	}

	// 세터게터

	// 메소드

	@Override
	void totalPrice() {// 장르가격에 따라 price변수가격을 셋팅
		// TODO Auto-generated method stub
		if (genre.equals("new")) {
			setPrice(2000);
		} else if (genre.equals("comic")) {
			setPrice(1500);
		} else if (genre.equals("child")) {
			setPrice(1000);
		} else {
			setPrice(500);
		}

	}

}
