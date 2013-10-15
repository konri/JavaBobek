package lab2;

import lab2.JavaIn.*;
import java.util.*;
public class Test {
	static void viewPunkts(List<Punkt3d> lista)
	{
		int i=1;
		for(Punkt3d punkt  : lista)
		{
			System.out.println(i + ". " + punkt);
			i++;
		}
	}
	public static void main(String[] args) {
		
		List<Punkt3d> listPunkt = new ArrayList<Punkt3d>();
		
	while(true)
		{
		System.out.println("1. Wczytaj punkt 3D");
		System.out.println("2. Wyświetl wszystkie punkty");
		System.out.println("3. Oblicz odległość");
		System.out.println("4. Zakończ");
		System.out.println("?");
		
		 
		switch(JIn.getInteger())
		{
		case 1:
			System.out.println("Podaj wektor w postaci: x,y,z");
			String getS = JIn.getString();
			String[] tmp = getS.split(",");
			if(tmp.length==3)
			{
				listPunkt.add(new Punkt3d(new Double(tmp[0]), new Double(tmp[1]), new Double(tmp[2])));
				
			}else{
				System.out.print("Podany został zły wektor");	
			}
			
			
			
		break;
		case 2:
			viewPunkts(listPunkt);
		break;
		case 3:
			System.out.println("Miedzy którymy punktami chcesz obliczyć odleglość zapisz w postaci: 5->6");
			viewPunkts(listPunkt);
			String getVectors = JIn.getString();
			String[] tmpVectors = getVectors.split("->");
			
			System.out.println("Dystans pomiędzy punktami: " + listPunkt.get((new Integer(tmpVectors[0])-1)).distance(listPunkt.get((new Integer(tmpVectors[1])-1))));
		break;
		case 4:
		System.exit(0);
		break;
		}
		
		}
		
	}

}
