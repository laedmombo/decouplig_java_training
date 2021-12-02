package fr.lernejo.guessgame;
import java.security.SecureRandom;
public class Launcher {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)
        //Player player = new HumanPlayer();
        //Simulation simulation = new Simulation(player);
        //simulation.initialize(randomNumber);
        //simulation.loopUntilPlayerSucceed();
        System.out.println(args[0]);
        if (args.length == 1 && args[0].equals("-interactive")) {
            Player player = new HumanPlayer();
            Simulation simulation = new Simulation(player);
            simulation.initialize(randomNumber);
            simulation.loopUntilPlayerSucceed(Long.MAX_VALUE);
        }
        else if (args.length == 2 && args[0].equals("-auto") && args[1].matches("-?\\d+")) {
            Player player = new ComputerPlayer();
            Simulation simulation = new Simulation(player);
            simulation.initialize(randomNumber);
            simulation.loopUntilPlayerSucceed(1000);
        } else {
            System.out.println("Usage: Javac -cp bin Launcher.java [OPTION]... [Nbr Itiration]...\n" +
                "List information about the FILEs (the current directory by default).\n" +
                "Mandatory arguments to long options are mandatory for short options too.\n" +
                "  -auto nombre  iteration                  do not ignore entries starting with .\n" +
                "  -interactive         do not list implied . and ..\n");

        }
    }
}


