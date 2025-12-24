package test;

import java.util.ArrayList;
import java.util.List;

import main.Song;
import main.SongV2;
import main.SongV3;

public class MockSongs {

	public static List<SongV3> getSongV3(){
//		List<SongV3> songs = new ArrayList<>();
//		songs.add(new SongV3("somersault", "zero 7", 147));
//		songs.add(new SongV3("50 Ways", "simon", 102));
//		songs.add(new SongV3("cassidy", "grateful dead", 158));
//		songs.add(new SongV3("$10", "hitchhicker", 140));
//		songs.add(new SongV3("havana", "cabello", 105));
//		songs.add(new SongV3("havana", "cabello", 105));
//		songs.add(new SongV3("cassidy", "grateful dead", 158));
//		songs.add(new SongV3("50 Ways", "simon", 102));
//		songs.add(new SongV3("somersault", "zero 7", 147));
		List<SongV3> songs = List.of(
				new SongV3("somersault", "zero 7", 147),
				new SongV3("50 Ways", "simon", 102),
				new SongV3("cassidy", "grateful dead", 158),
				new SongV3("$10", "hitchhicker", 140),
				new SongV3("havana", "cabello", 105),
				new SongV3("havana", "cabello", 105),
				new SongV3("cassidy", "grateful dead", 158),
				new SongV3("50 Ways", "simon", 102),
				new SongV3("somersault", "zero 7", 147)
		);
		
		return songs;
	}
	
	public List<Song> getSongs(){
		return List.of(
				new Song("$10", "Hitchhiker", "Eletronic", 2016, 183),
				new Song("Havana", "Camila Cabello", "R&B", 2017, 324),
				new Song("Cassidy", "Grateful Dead", "Rock", 1972, 123),
				new Song("50 ways", "Paul Simon", "Soft Rock", 1975, 199),
				new Song("Hurt", "Nine Inch Nails", "Industrial Rock", 1995, 257),
				new Song("Silence", "Delirium", "Eletronic", 1999, 134),
				new Song("Hurt", "Jhonny Cash", "Soft Rock", 2002, 392),
				new Song("Watercolour", "Pendulum", "Eletronic", 2010, 155),
				new Song("The Outsiders", "A Perfect Circle", "Alternative Rock", 2004, 312),
				new Song("With a Little Help from My Friends", "The Beatles", "Rock", 1967, 168),
				new Song("Come togheter", "The Beatles", "Blues rock", 1968, 173),
				new Song("Come togheter", "Ike & Tina Turner", "Rock", 1970, 165),
				new Song("With a Little Help from My Friends", "Joe Cocker", "Rock", 1968, 46),
				new Song("Immigrant Song", "Karen O", "Industrial Rock", 2011, 12),
				new Song("Breathe", "The Prodigy", "Eletronic", 1996, 337),
				new Song("What's Going On", "Gaye", "R&B", 1971, 420),
				new Song("Hallucinate", "Dua Lipa", "Pop", 2020, 75),
				new Song("Walk Me Home", "P!nk", "Pop", 2019, 459),
				new Song("I am not a womam, I'm a god", "Halsey", "Alternative Rock", 2021, 384),
				new Song("Pasos de cero", "Pablo Alboran", "Latin", 2014, 117),
				new Song("Smooth", "Santana", "Latin", 1999, 244),
				new Song("Immigrant Song", "Led Zeppelin", "Rock", 1970, 484)
		);
	}
}
