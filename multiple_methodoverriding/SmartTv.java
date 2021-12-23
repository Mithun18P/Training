package com.thoughtfocus.multiple_methodoverriding;

public class SmartTv implements Tv{

	@Override
	public void playmusic() {
		// TODO Auto-generated method stub
		System.out.println("palying only music with less clarity");
	}

	@Override
	public void playstation() {
		// TODO Auto-generated method stub
		System.out.println("palying only 95.7 station with less clarity");
	}

	@Override
	public void playmovies() {
		// TODO Auto-generated method stub
		System.out.println("palying only movies with low clarity");
	}

	@Override
	public void playshows() {
		// TODO Auto-generated method stub
		System.out.println("palying only shows with low clarity");
	}

	@Override
	public void playseries() {
		// TODO Auto-generated method stub
		System.out.println("palying only series with low clarity");
	}

	@Override
	public void playdvd() {
		// TODO Auto-generated method stub
		System.out.println("palying only folders in the dvd");
	}

	

}
