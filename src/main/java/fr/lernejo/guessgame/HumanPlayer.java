package fr.lernejo.guessgame;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player{
    private final Logger logger = LoggerFactory.getLogger("player");
    Scanner scanner = new Scanner( System.in );
    @Override
    public long askNextGuess() {
        logger.log("Entrer un nombre compris entre 1 et 100 ");
        long entrer = scanner.nextLong();
        return entrer;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater){
            logger.log("C'est moins");
        }
        else{
            logger.log("C'est plus");
        }
    }
}
