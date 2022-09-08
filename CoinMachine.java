//Name: Jay Jay
public class CoinMachine {

	public static void main(String args[]) {
		
		//Define variables: Amount received; Cost of the item; Change
		String amtRec = args[0];
		String cost = args[1];
		
		int change = Integer.parseInt(amtRec) - Integer.parseInt(cost);
		
		//Print out the result
		System.out.println("Amount received: " + amtRec);
		System.out.println("Cost of the item: " + cost);
		System.out.println("Required change: " + change);
		
		/*Main calculation, define the loop
		 * since $2.75 is represented by the integer 275, Toonie = $2 *100, Loonie = $1 *100, Quarter = 25, Dime = 10, Nickel = 5.
		 */
		int numT =0, numL =0, numQ =0, numD=0, numN=0;
		
		do {
			if(change >= 200) {
				change = change -200;
				numT = numT +1;
			}else if (change >= 100 && change < 200) {
				change = change - 100;
				numL = numL +1;
			}else if(change >= 25 && change <100) {
				change = change -25;
				numQ = numQ + 1;
			}else if (change >= 10 && change < 25) {
				change = change -10;
				numD = numD +1;
			}else if (change >= 5 && change < 10) {
				change = change -5;
				numN = numN +1;
			}
			} while (change > 0);
		
		
		//Print out the result
		
		System.out.print("\n");
		System.out.println("Change: ");
		System.out.println("    toonies x " + numT);
		System.out.println("    loonie x " + numL);
		System.out.println("    quarter x " + numQ);
		System.out.println("    dime x " + numD);
		System.out.println("    nickel x " + numN);
		
	}

}
