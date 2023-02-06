package nl.tudelft.jpacman.level.CollisionStrategy;

import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.level.Player;
import nl.tudelft.jpacman.npc.Ghost;

public interface ICollisionStrategy {
    void collide(Unit collidedOn);

    /**
     * Actual case of player bumping into ghost or vice versa.
     *
     * @param ghost
     *          The ghost involved in the collision.
     */
    default void playerVersusGhost(Player player, Ghost ghost) {
        player.removeLife(ghost);
    }
}
