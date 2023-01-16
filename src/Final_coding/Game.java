package Final_coding;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class Game {

    @Test
    public void testGameMock(){

        //3. Create a Mock object for the following interface
        //public interface Game {
        //   public int getUsedGameCost(int originalPrice);
        //}
        //In addition, make the Mock object return the stub value 10 for every call to getUsedGameCost() with any int.

        Game mock = Mockito.mock(Game.class);

        Mockito.when(mock.getUsedGameCost(15)).thenReturn(10);

        int result = mock.getUsedGameCost(15);

        Assert.assertEquals("Wrong output", 10, result);


    }


}
