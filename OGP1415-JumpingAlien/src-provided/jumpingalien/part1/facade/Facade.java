package jumpingalien.part1.facade;

import jumpingalien.model.Mazub;
import jumpingalien.util.Sprite;

public class Facade implements IFacade {

	@Override
	public Mazub createMazub(int pixelLeftX, int pixelBottomY, Sprite[] sprites) {
		Mazub alien = new Mazub(pixelLeftX, pixelBottomY, sprites);
		return alien;
	}

	@Override
	public int[] getLocation(Mazub alien) {
		int[] location = {alien.GetX(),alien.GetY()};
		return location;
	}

	@Override
	public double[] getVelocity(Mazub alien) {
		double[] velocity = {alien.GetCurrentHorizontalVelocity() / 100 , alien.GetCurrentVerticalVelocity() / 100};
		return velocity;
	}

	@Override
	public double[] getAcceleration(Mazub alien) {
		double[] acceleration = {alien.GetHorizontalAcceleration() / 100, alien.GetVerticalAcceleration() / 100};
		return acceleration;
	}

	@Override
	public int[] getSize(Mazub alien) {
		int[] size = {alien.getWidth(), alien.getHeight()};
		return size;
	}

	@Override
	public Sprite getCurrentSprite(Mazub alien) {
		return alien.GetCurrentSprite();
	}

	@Override
	public void startJump(Mazub alien) {
		alien.startJump();
	}

	@Override
	public void endJump(Mazub alien) {
		alien.endJump();
	}

	@Override
	public void startMoveLeft(Mazub alien) {
		alien.SetOrientationLeft();
		alien.startMove();
	}

	@Override
	public void endMoveLeft(Mazub alien) {
		alien.endMove();
	}

	@Override
	public void startMoveRight(Mazub alien) {
		alien.SetOrientationRight();
		alien.startMove();
	}

	@Override
	public void endMoveRight(Mazub alien) {
		alien.endMove();
	}

	@Override
	public void startDuck(Mazub alien) {
		alien.startDuck();
	}

	@Override
	public void endDuck(Mazub alien) {
		alien.endDuck();
	}

	@Override
	public void advanceTime(Mazub alien, double dt) {
		alien.AdvanceTime(dt);
	}

	
	
}
