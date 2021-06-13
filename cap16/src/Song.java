
public class Song implements Comparable<Song> {
	//variáveis
	String title;
	String artist;
	String rating;
	String bpm;
	
	Song(String t, String a, String r, String b) {
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}
	
	public int compareTo(Song s) {
		return title.compareTo(s.getTitle());
	}
	
	public String toString() {
		return title + ":" + artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getBpm() {
		return bpm;
	}

	public void setBpm(String bpm) {
		this.bpm = bpm;
	}
	
	

}
