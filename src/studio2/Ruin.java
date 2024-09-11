package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Start amount: ");
		double startAmount = in.nextDouble();
		System.out.println("Win chance: ");
		double winChance = in.nextDouble();
		System.out.println("Win limit: ");
		double winLimit = in.nextDouble();
		System.out.println("Total simulations: ");
		int totalSimulations = in.nextInt();
		int x = 0;
		for(int i =0; i<=totalSimulations; i++) //number of days simulated
		{
			double amount = startAmount;
			while(amount>0 && amount<winLimit) //one day
			{
				double game = Math.random();
				if(game<winChance)
				{
					amount++;
					//System.out.println("You win!");
					x++;
				}
				else
				{
					amount--;
					//System.out.println("You lose...");
					x++;
				}
			}
			if(amount<=0)
			{
				System.out.println("Simulation "+ i + ": " + x +" LOSE");
				x=0;
			}
			else if(amount>=winLimit)
			{
				System.out.println("Simulation "+ i + ": "+ x + " WIN");
				x=0;
			}
		}
		
	}

}
