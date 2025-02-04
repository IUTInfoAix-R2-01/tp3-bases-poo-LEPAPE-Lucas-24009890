
public class Ball {
	private float x;
	private float y;
	private int radius;
	private float xDelta;
	private float yDelta;
	
	public Ball(float x, float y, int radius, float xDelta, float yDelta) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.xDelta = xDelta;
		this.yDelta = yDelta;
	}
	
	public float getX() {
		return x;
	}
	
	public void setX(float newX) {
		this.x = newX;
	}
	
	public float getY() {
		return y;
	}
	
	public void setY(float newY) {
		this.y = newY;
	}
	
	public float getXDelta() {
		return xDelta;
	}
	
	public void setXDelta(float newXDelta) {
		this.xDelta = newXDelta;
	}
	
	public float getYDelta() {
		return yDelta;
	}
	
	public void setYDelta(float newYDelta) {
		this.yDelta = newYDelta;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int newRadius) {
		this.radius = newRadius;
	}
	
	public void move() {
		x += xDelta;
		y += yDelta;
	}
	
	public void reflectHorizontal() {
		xDelta = -xDelta;
	}
	
	public void reflectVertical() {
		yDelta = -yDelta;
	}

	public String toString() {
		return String.format("Ball[(%.1f,%.1f),speed=(%.1f,%.1f)]", this.x, this.y, this.xDelta, this.yDelta);
	}
}
