package nl.tudelft.jpacman.level.CollisionStrategy;

import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.level.Pellet;
import nl.tudelft.jpacman.level.Player;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.points.PointCalculator;

public class PlayerCollisionStrategy implements ICollisionStrategy {
    private final PointCalculator pointCalculator;
    private final Player player;

    public PlayerCollisionStrategy(PointCalculator pointCalculator, Player player) {
        this.pointCalculator = pointCalculator;
        this.player = player;
    }

    @Override
    public void collide(Unit collidedOn) {
        if (collidedOn instanceof Ghost) {
            playerVersusGhost(player, (Ghost) collidedOn);
        } else if (collidedOn instanceof Pellet) {
            playerVersusPellet((Pellet) collidedOn);
        }
    }
    /**
     * Actual case of player consuming a pellet.
     *
     * @param pellet
     *           The pellet involved in the collision.
     */
    public void playerVersusPellet(Pellet pellet) {
        pointCalculator.consumedAPellet(player, pellet);
        pellet.leaveSquare();
    }
}
