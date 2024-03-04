import java.util.Scanner;
import java.util.Random;

class NumberGame {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        boolean play=true;
        while(play)
        {
            int rnum=r.nextInt(100)+1;
            int attempts=0;
            final int maxattempts=5;
            boolean guess=false;
            System.out.println("A  random number between 1 and 100 was generated.Guess It!!");

            while(!guess && attempts < maxattempts)
            {
                System.out.println("Enter your Guess");

                try{
                    int num=s.nextInt();
                    attempts++;
                    if(rnum==num)
                    {
                        System.out.println("You Guessed the Correct Number.The random Number is "+rnum);
                        guess=true;
                    }
                    else if(num<rnum)
                    {
                        System.out.println("Too Low.Try again.");
                    }
                    else
                    {
                        System.out.println("Too High.Try again.");

                    }
                }
                catch(Exception e)
                {
                    System.out.println("enter a number between 1 and 100");
                }
            }
            if(!guess)
            {
                System.out.println("You have reached the maximum attempts.The random number is "+rnum);
            }


            System.out.println("Do you want to play again?");
            System.out.println("Enter 1 to continue or Enter 2 to Exit");
            int playagain=s.nextInt();
            if(playagain!=1)
            {
                play=false;
            }
        }
        System.out.println("Game ended");
        s.close();

    }
}
