package main;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import test.MockSongs;

public class Jukebox {

	public static void main(String[] args) {
		new Jukebox().go();
	}
	
	public void go() {
//		List<SongV3> songList = MockSongs.getSongV3();
		
//		TitleCompare titleCompare =  new TitleCompare();
//		songList.sort(titleCompare);
//		System.out.println(songList);
//		ArtistCompare artistCompare = new ArtistCompare();
//		songList.sort(artistCompare);
//		System.out.println(songList);
		
//		songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
//		System.out.println(songList);
//		songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
//		System.out.println(songList);
		
//		Set<SongV3> songSet = new HashSet<>(songList);
//		Set<SongV3> songSet = new TreeSet<>(songList);
//		System.out.println(songSet);
//		songSet.forEach(song -> System.out.println(song));
		
		List<Song> songs = new MockSongs().getSongs();
		
		List<Song> rockSongs = songs.stream()
				.filter(song -> song.getGenre().contains("Rock"))
				.collect(Collectors.toList());
		System.out.println(rockSongs);
		
		List<String> genres = songs.stream()
				.map(song -> song.getGenre())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(genres);
		
		String songTitle = "With a Little Help from My Friends";
		List<String> result = songs.stream()
				.filter(song -> song.getTitle().equals(songTitle))
				.map(song -> song.getArtist())
				.filter(artist -> !artist.equals("The Beatles"))
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
