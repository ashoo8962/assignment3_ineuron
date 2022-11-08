import java.util.Scanner;
class Guesser
{
	int m=0,n=50;
	int guessNum;
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser please guess the number between 1 to 50");
		guessNum = scan.nextInt();
		if(guessNum>=m&&guessNum<=n) 
		{
			System.out.println("enter number is in the range "+ guessNum);
		}
		else 
		{
			System.out.println("enter number is out of range please enter within range");
			System.out.println("Game is exiting");
			System.exit(0);
		}
		return guessNum;
	}
}
class Player
{
	int m=0,n=50;
	int guessNum1;
	int guessNum2;
	int guessNum3;
	
	int guessNum1() 
	{
	    Scanner scan =new Scanner(System.in);
	    System.out.println("Player 1 please guess the number between 1 to 50");
	    guessNum1 = scan.nextInt();
	    if(guessNum1>=m&&guessNum1<=n) 
		{
			System.out.println("enter number is in the range "+ guessNum1);
		}
		else 
		{
			System.out.println("enter number is out of range please enter within range");
			System.exit(0);
		}
		return guessNum1;
	}
	int guessNum2() 
	{
	    Scanner scan =new Scanner(System.in);
	    System.out.println("Player 2 please guess the number between 1 to 50");
	    guessNum2 = scan.nextInt();
	    if(guessNum2>=m&&guessNum2<=n) 
		{
			System.out.println("enter number is in the range "+ guessNum2);
		}
		else 
		{
			System.out.println("enter number is out of range please enter within range");
			System.exit(0);
	
		}
	    
		return guessNum2;
	}
	int guessNum3() 
	{
	    Scanner scan =new Scanner(System.in);
	    System.out.println("Player 3 please guess the number between 1 to 50");
	    guessNum3 = scan.nextInt();
	    if(guessNum3>=m&&guessNum3<=n) 
		{
			System.out.println("enter number is in the range "+ guessNum3);
		}
		else 
		{
			System.out.println("enter number is out of range please enter within range");
			System.exit(0);
		}
	    return guessNum3;
	}
}
class Umpire 
{
	int numberFromGuesser;
	int numberFromPlayer1;
	int numberFromPlayer2;
	int numberFromPlayer3;
	
	void collectNumberFromGuesser() 
	{
		Guesser g=new Guesser();
		numberFromGuesser=g.guessNum();
		
	}
	void collectNumberFromPlayers() 
	{
		 Player p1 =new Player();
		 Player p2 =new Player();
		 Player p3 =new Player();
		 numberFromPlayer1=p1.guessNum1();
		 numberFromPlayer2=p2.guessNum2();
		 numberFromPlayer3=p3.guessNum3();
	}
	void compare() 
	{
		if (numberFromGuesser==numberFromPlayer1) 
		{
			if (numberFromGuesser==numberFromPlayer2&&numberFromGuesser==numberFromPlayer3) 
			{
				System.out.println("All players won the game");
				System.out.println();
				System.out.println("Game Over");
			}
			else if(numberFromGuesser==numberFromPlayer2) 
			{
				System.out.println("Player 1 and Player 2 won the game");
			}
			else if(numberFromGuesser==numberFromPlayer3) 
			{
			System.out.println("Player 1 and Player 3 won the game");
			}
			else 
			{
			System.out.println("Player 1 won the game");
			System.out.println();
			System.out.println("Game Over");
			}
		}
		else if (numberFromGuesser==numberFromPlayer2) 
		{
			if(numberFromGuesser==numberFromPlayer3) 
			{
				System.out.println("Player 2 and Player 3 won the game");
			}
			else 
			{
				System.out.println("Player 2 won the game");
				System.out.println();
				System.out.println("Game Over");
			}
		}
		else if (numberFromGuesser==numberFromPlayer3) 
		{
			System.out.println("Player 3 won the game");
			System.out.println();
			System.out.println("Game Over");
		}	
		else 
		{
			System.out.println("All players lost the game and Please try again");
		}
	}
}

public class GuesserGameP1 {
	
	public static void main(String[] args) {
		String user = "Ashlesha@gmail.com";
		String pass ="ashlesha123";
		
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username");
        String username = s.next();
        
        System.out.println("Enter password");
        String password = s.next();
        
        if(username.equalsIgnoreCase(user) && password.equals(pass))
        {
            System.out.println("sucessful login");
            System.out.println("Begin the Game");
        }
        else
        {
            System.out.println("Incorrect username or password so please check and try again");
            System.exit(0);
        }
		
		Umpire u = new Umpire();
		u.collectNumberFromGuesser();
		u.collectNumberFromPlayers();
		u.compare();

	}
	
}

