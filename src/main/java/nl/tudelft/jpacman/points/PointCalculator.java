package nl.tudelft.jpacman.points;

import nl.tudelft.jpacman.level.Pellet;
import nl.tudelft.jpacman.level.Player;

/**
 * The responsibility of the point calculator is to update the points
 * of the player when certain activities happen.
 * Different calculation strategies can be employed,
 * giving rise to different types of games, for example at different levels.
 */
public interface PointCalculator {
    /**
     * Method called whenever a player consumes a pellet.
     * It can be used to update the player's points accordingly.
     *
     * @param player
     *            The player consuming a pellet
     * @param pellet
     *            The pellet consumed.
     */
    void consumedAPellet(Player player, Pellet pellet);
}
