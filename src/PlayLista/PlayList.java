package PlayLista;

import java.util.ArrayList;
import java.util.Random;

public class PlayList {
	
	ArrayList<SList> pList;
	String playWayP="sekwencyjnie";
	String PName;
	
	public PlayList()	{
		pList = new ArrayList<SList>();
	}
	
	public void setPlayWayP(String playWay){
		playWayP = playWay;
	}
	
	public void addElement(Track t)	{
		SList sl = new SList();
		sl.addTrack(t);		
		pList.add(sl);
	}
	
	public void addElement(PlayList pl)	{ //tu trzeba dodać sl....
		SList b = new SList();
		b.setPlayWayS(pl.getPlayWayP());
		for (SList el: pl.getPList())	{
			for (Track tEl: el.getSList())	{
				b.addTrack(tEl);
			}
		}
		pList.add(b);
	}
	
	public void playP()	{
		if (playWayP.equals("zapetlenie"))	{
			do	{
				for (SList el: pList)	{
					el.playS();
				}
			}
			while(true);
		}
		else if(playWayP.equals("losowo"))	{
			ArrayList<SList> rList = new ArrayList<SList>();
			rList  = pList;
			Random rand = new Random();
			int sListSize = pList.size();
			
			for (int i=1; i<=sListSize; i++)	{
				int rIndx = rand.nextInt(rList.size());
				rList.get(rIndx).playS();
				rList.remove(rIndx);
			}
		}
		else	{		
			for (SList el: pList)	{
				el.playS();
			}
		}
	}
	
	public String getPlayWayP()	{
		return playWayP;
	}
	
	public ArrayList<SList> getPList()	{
		return pList;
	}
}
