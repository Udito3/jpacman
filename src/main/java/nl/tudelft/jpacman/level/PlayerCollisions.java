package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.board.Unit;

/**
 * A simple implementation of a collision map for the JPacman player.
 * <p>
 * It uses a number of instanceof checks to implement the multiple dispatch for the 
 * collisionmap. For more realistic collision maps, this approach will not scale,
 * and the recommended approach is to use a {@link CollisionInteractionMap}.
 *
 * @author Arie van Deursen, 2014
 *
 */

public class PlayerCollisions implements CollisionMap {
    @Override
    public void collide(Unit mover, Unit collidedOn) {
        mover.collide(collidedOn);
    }
}
