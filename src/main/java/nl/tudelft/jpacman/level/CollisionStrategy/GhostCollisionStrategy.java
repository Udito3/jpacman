package nl.tudelft.jpacman.level.CollisionStrategy;

import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.level.Pellet;
import nl.tudelft.jpacman.level.Player;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.points.PointCalculator;

public class GhostCollisionStrategy implements ICollisionStrategy {
    private final Ghost ghost;

    public GhostCollisionStrategy(Ghost ghost) {
        this.ghost = ghost;
    }

    @Override
    public void collide(Unit collidedOn) {
        if (collidedOn instanceof Player) {
            playerVersusGhost((Player) collidedOn, ghost);
        }
    }
}
