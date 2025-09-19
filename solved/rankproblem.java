import java.util.LinkedList;
import java.util.Scanner;

public class rankproblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedList<Integer> teams = new LinkedList<Integer>();

        int numTeams = in.nextInt();
        int numMatches = in.nextInt();

        for(int i = 1; i <= numTeams; i++){
            teams.add(i);
        }

        in.nextLine();

        for(int i = 0; i < numMatches; i++){
            String[] input = in.nextLine().split(" ");
            input[0] = input[0].substring(1);
            input[1] = input[1].substring(1);
            int winner = Integer.parseInt(input[0]);
            int loser = Integer.parseInt(input[1]);
            int winnerIndex = teams.indexOf(winner);
            int loserIndex = teams.indexOf(loser);

            if(winnerIndex > loserIndex){
                teams.remove(loserIndex);
                teams.add(winnerIndex, loser);
            }
        }   

        for(int n : teams){
            System.out.print("T" + n + " ");
        }
        
    }

}