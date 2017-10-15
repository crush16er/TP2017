package cardspackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck
{
	ArrayList<String> cards = new ArrayList<String>();
	ArrayList<String> colors = new ArrayList<String>();
	ArrayList<ArrayList> deck = new ArrayList<ArrayList>();
	Random rnd = new Random();
	int amount = 0;
	
	
	public Deck(int amount)
	{
		this.amount = amount;
		this.cards.addAll(Arrays.asList("2","3","4","5","6","7","8","9","10","J","Q","K","A"));
		for(int i = 0; i < (52-amount)/4; i++)
		{
			cards.remove(0);
		}
		
		int cards_size = cards.size();
		
		for(int i = 0; i < 3; i++)
		{
			for (int j = 0; j<cards_size; j++)
			{
				cards.add(cards.get(j));
			}
		}
		
		deck.add(cards);
		
		for(int i=0; i<cards_size; i++)
		{
			colors.add("Hearts");
		}
		
		for(int i=0; i<cards_size; i++)
		{
			colors.add("Diamonds");
		}
		
		for(int i=0; i<cards_size; i++)
		{
			colors.add("Clubs");
		}
		
		for(int i=0; i<cards_size; i++)
		{
			colors.add("Spades");
		}
		
		deck.add(colors);
	}
	
	public void shuffle()
	{
		for(int i=0; i<10000; i++)
		{
			int index1 = rnd.nextInt(colors.size());
			int index2 = rnd.nextInt(colors.size());
			
			String tmp = cards.get(index1);
			cards.set(index1, cards.get(index2));
			cards.set(index2, tmp);
			
			tmp = colors.get(index1);
			colors.set(index1, colors.get(index2));
			colors.set(index2, tmp);
		}
	}
	
	public void top_card()
	{
		System.out.println(cards.get(cards.size()-1) + " of " + colors.get(colors.size()-1));
	}
	
	public void sort()
	{
		int mincar = 0;
		int mincol = 0;
		int n = cards.size();
		int carid = 0;
		int colid = 0;
		
		for(int i=0; i<n-1; i++)
		{
			if(cards.get(i)=="J")
			{
				mincar = 11;
			}
			else if(cards.get(i)=="Q")
			{
				mincar = 12;
			}
			else if(cards.get(i)=="K")
			{
				mincar = 13;
			}
			else if(cards.get(i)=="A")
			{
				mincar = 14;
			}
			else
			{
				mincar = Integer.parseInt(cards.get(i));
			}
			
			if(colors.get(i)=="Hearts")
			{
				mincol = 1;
			}
			else if(colors.get(i)=="Diamonds")
			{
				mincol = 2;
			}
			else if(colors.get(i)=="Clubs")
			{
				mincol = 3;
			}
			else
			{
				mincol = 4;
			}
			
			carid = i;
			colid = i;
			
			for(int j=i+1; j<n; j++)
			{
				int tmpcar = 0;
				int tmpcol = 0;
				
				if(cards.get(j)=="J")
				{
					tmpcar = 11;
				}
				else if(cards.get(j)=="Q")
				{
					tmpcar = 12;
				}
				else if(cards.get(j)=="K")
				{
					tmpcar = 13;
				}
				else if(cards.get(j)=="A")
				{
					tmpcar = 14;
				}
				else
				{
					tmpcar = Integer.parseInt(cards.get(j));
				}
				
				if(colors.get(j)=="Hearts")
				{
					tmpcol = 1;
				}
				else if(colors.get(j)=="Diamonds")
				{
					tmpcol = 2;
				}
				else if(colors.get(j)=="Clubs")
				{
					tmpcol = 3;
				}
				else
				{
					tmpcol = 4;
				}
				
				if(tmpcol<mincol)
				{
					mincol = tmpcol;
					mincar = tmpcar;
					carid = j;
					colid = j;
				}
				else if(tmpcol == mincol)
				{
					if(tmpcar<mincar)
					{
						mincol = tmpcol;
						mincar = tmpcar;
						carid = j;
						colid = j;
					}
				}
			}
			
			cards.set(carid, cards.get(i));
			colors.set(colid, colors.get(i));
			
			if(mincar==11)
			{
				cards.set(i, "J");
			}
			else if(mincar==12)
			{
				cards.set(i, "Q");
			}
			else if(mincar==13)
			{
				cards.set(i, "K");
			}
			else if(mincar==14)
			{
				cards.set(i, "A");
			}
			else
			{
				cards.set(i, String.valueOf(mincar));
			}
			
			if(mincol==1)
			{
				colors.set(i, "Hearts");
			}
			else if(mincol==2)
			{
				colors.set(i, "Diamonds");
			}
			else if(mincol==3)
			{
				colors.set(i, "Clubs");
			}
			else
			{
				colors.set(i, "Spades");
			}
		}
	}
}
