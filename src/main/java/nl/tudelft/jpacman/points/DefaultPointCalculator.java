package nl.tudelft.jpacman.points;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.level.Pellet;
import nl.tudelft.jpacman.level.Player;
import nl.tudelft.jpacman.npc.Ghost;

/**
 * A simple, minimalistic point calculator just
 * adding points for each pellet consumed.
 */
public class DefaultPointCalculator implements PointCalculator {
    @Override
    public void consumedAPellet(Player player, Pellet pellet) {
        player.addPoints(pellet.getValue());
    }
}
