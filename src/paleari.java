import java.lang.reflect.Array;
import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class paleari
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				//aggiungere, togliere casi a seconda delle proprie scelte
				case 1:
					es1();
				break;
				case 2:
					es2();
				break;
				case 3:
					//Inserire metodo statico
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		// Modificare il men√π secondo le proprie scelte
		System.out.println("1 - Es n. * - Titolo es. *");
		System.out.println("2 - Es n. * - Titolo es. *");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	
	static void es1()//commento
	{
		double [] array1=new double[4];
		//creo un array che sar‡ riempito con numeri casuali double
		for(int i =0; i<array1.length;i++)
		{
			array1[i]=(Math.random()*10);
		}
		for(int i=0;i<array1.length;i++)//stampa array1
			System.out.println(array1[i]);
		
		double [] array2=new double[array1.length/2];//creo un nuovo array che sar‡ grande la met‡ di array1
		int k=0;//creo una variabile che mi aiuter‡ a incrementare l'indice di array2
		System.out.println("secondo array:");
		for(int i=0; i<array1.length; i+=2)//creo un ciclo per incrementare la i di 2 in 2 per far si che salti dall'elemnto 0 all'elemento 2
		{
		
		    array2[k]=array1[i]*array1[i+1];//prodotto per trovare gli elementi di array2
		    k++;//incremento k per passare alla seconda moltiplicazione
		   
		}
		for(int i=0;i<array2.length;i++)//stampa array2
			System.out.println(array2[i]);  
	}
	static void es2() 
	{
		String [] array1=new String[5];
		for(int i =0; i<array1.length;i++)
		{
			System.out.println("scrivi una parola per riemprire il primo array:");
			array1[i]=in.nextLine();
		}
		String [] array2=new String[5];
		for(int j =0; j<array2.length;j++)
		{
			System.out.println("scrivi una parola per riempire il secondo array:");
			array2[j]=in.nextLine();
		}
		for(int i=0;i<array1.length;i++)
			for(int j=array2.length-1;j>=0;j++)
		       if(array1[i] == array2[j])
		       {
			    System.out.println("OK");
		       }
		       else 
		    	System.out.println("NO");   
	}
}
