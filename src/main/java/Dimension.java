public class Dimension {
	public enum Unit {
		MM, INCH
	}

	private long x;
	private long y;
	private long z;
	private Unit unit;

	public Dimension() {
		this(1, 1, 1);
	}

	public Dimension(long x, long y, long z) {
		this(x, y, z, Unit.MM);
	}

	public Dimension(long x, long y, long z, Unit unit) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.unit = unit;
	}

	public long getX() {
		return x;
	}

	public void setX(long x) {
		this.x = x;
	}

	public long getY() {
		return y;
	}

	public void setY(long y) {
		this.y = y;
	}

	public long getH() {
		return z;
	}

	public void setH(long z) {
		this.z = z;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}
}
