package PlayLista;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
	
	ArrayList<SList> PList;
	String playWayP;
	String PName;
	private static int subListNo;
	
	public PlayList(String name)	{
		PName = name;
		subListNo = 0;
		PList = new ArrayList<SList>();
	}
	
	public void setPlayWayP(String playWay){
		playWayP = playWay;
	}
	
	public void addElement(Track t)	{
		SList sl = new SList();
		sl.addTrack(t);		
		PList.add(sl);
	}
	public void addElement(PlayList pl)	{ //tu trzeba dodać sl....
		SList b = new SList();
		b.setPlayWayS(pl.getPlayWayP());
		for (SList el: pl.getPList())	{
			for (Track tEl: el.getSList())	{
				b.addTrack(tEl);
			}
		}
		PList.add(b);
	}
	
	public void playP(String howPlay)	{
		playWayP = howPlay;
		for (SList el: PList)	{
			//System.out.println(el.toString());
			el.playS();
		}
	}
	
	public String getPlayWayP()	{
		return playWayP;
	}
	
	public ArrayList<SList> getPList()	{
		return PList;
	}
	
	
	
}
