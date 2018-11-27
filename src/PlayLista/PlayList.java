package PlayLista;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
	
	private String nazwa;
	private Track utwor;
	private ArrayList<?> pLista;
	private ArrayList<PlayList> subList;
	private String playWay;
	
	
	public PlayList (String nazwa)	{
		this.nazwa = nazwa;
		pLista = new ArrayList<Track>();
		playWay = "losowo";
		
	}
	public void setHowToPlay(String howToPlay)	{
		if (howToPlay.equals("")) playWay="losowo";
		playWay = howToPlay;
	}
	//
	public void addEl(Track track)	{
		
	}
	public void addEl(List<?> lista)	{
		
	}
	public void play(String howToPlay)	{
		System.out.println("Odtwrzam playlistę: "+nazwa+" tryb odtwarzania: "+ playWay);
		if (howToPlay.equals("") || howToPlay.equals("losowo"))	{
			//losowo
		}
		else if (howToPlay.equals("sekwencyjnie"))	{
			for (Object el: pLista) {
				if ((subList.getClass().toString()).equals("class PlayLista.PlayList")) {
					
				}
				else	{
					
				}
			}
			
		}
		else if (howToPlay.equals("zapętlenie"))	{
			
		}
		
		
		
		System.out.println("");
	}

}
