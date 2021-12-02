package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.security.SecureRandom;

public class ComputerPlayer implements Player{

    private Logger logger = LoggerFactory.getLogger("computer");
    @Override
    public long askNextGuess() {
        SecureRandom random = new SecureRandom();
        long nbr = random.nextInt(100);
        return nbr;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

    }
}
