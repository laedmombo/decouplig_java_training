package fr.lernejo.guessgame;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Simulation {

  private final Logger logger = LoggerFactory.getLogger("simulation");
  private final Player player;  //TODO add variable type
  private long numberToGuess; //TODO add variable type

  public Simulation(Player player) {
    //TODO implement me
      this.player = player;
  }

  public void initialize(long numberToGuess) {
    //TODO implement me
      this.numberToGuess = numberToGuess;
  }

  /**
   * @return true if the player have guessed the right number
   */
  private boolean nextRound() {
    //TODO implement me
      Long nbrAttent =player.askNextGuess() ;
      if(nbrAttent==numberToGuess){
          logger.log("Bravo partie terminer");
          return true;
      }
      else if(nbrAttent>numberToGuess){
          player.respond(true);
          return false;
      }
      else {
          player.respond(false);
          return false;
      }
  }

  public void loopUntilPlayerSucceed() {
    //TODO implement me
      boolean bool;
      do{
          bool = nextRound();
      }
      while (bool!=true);
      }
  }

