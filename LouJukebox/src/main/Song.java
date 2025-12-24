package main;

public class Song {
	private final String title;
	private final String artist;
	private final String genre;
	private final int year;
	private final int timesPlayed;

	public Song(String title, String artist, String genre, int year, int timesPlayed) {
		super();
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.year = year;
		this.timesPlayed = timesPlayed;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getGenre() {
		return genre;
	}

	public int getYear() {
		return year;
	}

	public int getTimesPlayed() {
		return timesPlayed;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", genre=" + genre + ", year=" + year + ", timesPlayed="
				+ timesPlayed + "]";
	}

	@Override
	public int hashCode() {
		return title.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Song song = (Song) obj;
		return title.equals(song.getTitle());
	}
	
}
