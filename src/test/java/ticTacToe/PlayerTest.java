package ticTacToe;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class PlayerTest {

 

    @Test
    public void constructorTest(){
            Player player = new Player("Marco", false, Player.Symbol.X);
            
            Assertions.assertEquals("Marco", player.getName());
            Assertions.assertEquals(Player.Symbol.X, player.getSymbol());
            Assertions.assertEquals(false, player.isOnTheMove());
    }

}