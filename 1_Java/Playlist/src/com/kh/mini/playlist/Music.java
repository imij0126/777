package com.kh.mini.playlist;

public class Music {
	
	private String title;
	private String artist;
	private String genre;
	
	public Music() {}
	
	public Music(String title, String artist, String genre) {
		this.title = title;
		this.artist = artist;
		this.genre = genre;
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String toString() {
		return "제목 : " + title
				+ ", 아티스트 : " + artist
				+ ", 장르 : " + genre;
	}

}
