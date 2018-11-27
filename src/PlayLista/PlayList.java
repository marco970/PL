package PlayLista;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
	
	private String nazwa;
	private Track utwor;
	private ArrayList<Track> pLista;
	private ArrayList<Track> subList;
	private String playWay;
	
	
	public PlayList (String nazwa)	{
		this.nazwa = nazwa;
		pLista = new ArrayList<Track>();
		subList = new ArrayList<Track>();
		playWay = "losowo";
		
	}
	public void setHowToPlay(String howToPlay)	{
		if (howToPlay.equals("")) playWay="losowo";
		playWay = howToPlay;
	}
	//
	public void addEl(Track track)	{
		//int ile = pLista.size();
		pLista.add(track);
	}
	/*
	 
	 
	public void addEl(PlayList lista)	{
		pLista.add(pLista.size()+1,lista);
	}
	
	*/
	public void play(String howToPlay)	{
		playWay = howToPlay;
		System.out.println("Odtwarzam playlistę '"+nazwa+"': tryb odtwarzania: "+ playWay);
		for (Object el: pLista) {
			
			if (("").equals(howToPlay) || ("losowo").equals(howToPlay))	{
				System.out.println(el.toString());
			}
			else if (("sekwencyjnie").equals(howToPlay))	{		
				System.out.println(el.toString());
			}
			else if (("zapętlenie").equals(howToPlay))	{
				System.out.println(el.toString());
			}
			
			

		
		
		//System.out.println("");
	}

	}
}
