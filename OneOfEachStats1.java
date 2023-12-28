/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		int T = Integer.parseInt(args[0]);
		int seckind;
		int kindof;
		boolean check = true;
		double Average;
		int sum = 1;
		int sumTotal = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		int onefam = 0;

		for (int n = 0; n < T; n++){
			double firstchild = (Math.random() * 10);
			sum = 1;
			if (firstchild < 5){
				kindof = 1;

			}
			else{
				kindof = 0;
			}
			while (check == true) {
				sum = sum +1;
				double secondechild = (Math.random() * 10);
				if (secondechild < 5 ){
					seckind = 0 ;
					if (kindof == seckind){
						check = false;
						}
				}
				else{
					seckind = 1 ;
					if (kindof == seckind){
						check = false;
					}
				}
			}
			if (sum == 2){
				x ++;
			}
			if(sum == 3){ 
				y ++;
			}
			else{
				z ++;
			}
			check = true;
			sumTotal += sum;
		}
		Average = (double) sumTotal / T ; 
		System.out.println("Average: "  + Average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: "+ x);
		System.out.println("Number of families with 3 children: "+ y);
		System.out.println("Number of families with 4 or more children: "+ z);
		System.out.println("The most common number of children is " +  ((Math.max(z, (Math.max(x,y))) > 3) ? "4 or more." : Math.max(x,y) + "."));

		
	}
}
