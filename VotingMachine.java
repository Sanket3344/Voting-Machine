import java.util.Scanner;
class VotingMachine
{
	static int bjp,congress,aap,mns,sena,nota;     // 0

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("  ** VOTING MACHINE  **  ");
		System.out.println();
		System.out.print("Enter the count of voters: ");
		int count = sc.nextInt();  

		for(int i = 1; i<=count ; i++)
		{
			System.out.println();
			System.out.println("1.BJP  2.CONGRESS  3.MNS  4.AAP  5.SHIVSENA  6.NOTA");
			System.out.print("Enter an option: ");
			int option = sc.nextInt();
			System.out.println();

			switch(option)
			{
			case 1: 
				bjp++;
				System.out.println("SABKA SATH SABKA VIKAS"); 
				break;
			case 2: 
				congress++;
				System.out.println("BHARAT JODO.");
				break;
			case 3:
				aap++;
				System.out.println("APKA EK VOTE MUJHE AAZAD KAR SAKTA");
				break;
			case 4:
				mns++;
				System.out.println("JAI MAHARASHTRA");
				break;
			case 5:
				sena++;
				System.out.println("ASLI SENA");
				break;
			case 6:
				nota++;
				System.out.println("YOU ARE EDUCATED");
				break;
			default: 
				System.out.println("WRONG OPTION ENTERED.");
				i--;
				break;
			}
		}

		if(bjp>congress && bjp>aap && bjp>mns && bjp>sena && bjp>nota)
			System.out.println("BJP HAS WON THE ELECTION BY "+ bjp + " VOTES");

		else if(congress>bjp && congress>aap && congress>mns && congress>sena && congress>nota)
			System.out.println("CONGRESS HAS WON THE ELECTION BY "+ congress + " VOTES");

		else if(aap>bjp && aap>congress && aap>mns && aap>sena && aap>nota)
			System.out.println("AAP HAS WON THE ELECTION BY "+ aap + " VOTES");

		else if(mns>bjp && mns>aap && mns>congress && mns>sena && mns>nota)
			System.out.println("MNS HAS WON THE ELECTION BY "+ mns + " VOTES");

		else if(sena>bjp && sena>aap && sena>mns && sena>congress && sena>nota)
			System.out.println("SHIVSENA HAS WON THE ELECTION BY "+ sena + " VOTES");

		else
			System.out.println("NOTA HAS WON THE ELECTION BY "+ nota + " VOTES");

		

	}
}