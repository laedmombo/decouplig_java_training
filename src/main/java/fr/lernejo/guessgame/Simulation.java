package fr.lernejo.guessgame;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import org.w3c.dom.ls.LSOutput;

import java.util.Date;
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

  public void loopUntilPlayerSucceed(long itMax) {
    //TODO implement me
      long duree ;
      long secondes ;
      long min ;
      long mili ;
      long dateFin;
      boolean bool;
      for (long i=1;i<itMax;i++){
          long dateDebut = System.currentTimeMillis(); //Relever l'heure a la fin du progamme (en milliseconde)
          bool=nextRound();
          if(bool) {
              dateFin = System.currentTimeMillis();
              duree=dateFin-dateDebut;
              secondes = duree / 1000;
              min = secondes / 60;
              mili = duree % 1000;
              logger.log("Nombre trouvé avant la limite d’itération :"+itMax+"en ="+min+":"+secondes+"."+mili);
              System.exit(0);
          }
      }

      logger.log("Nombre n'a pas trouvé avant la limite d’itération :");
      }
  }

