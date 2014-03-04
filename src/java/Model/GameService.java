

package Model;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Teresa Mahoney
 */
public class GameService implements Serializable{
   public int getRandomInt(int e) {
        Random RValue = new Random(System.nanoTime());
        return (RValue.nextInt(e) + 1);
   }
    
}
