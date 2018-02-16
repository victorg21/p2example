public class Part {

	protected String Id;
	protected String name;
	protected Dimension dimension;

	public Part(String id, String name) {
		Id = id;
		this.name = name;
	}

	public Part(String id, String name, Dimension dimension) {
		Id = id;
		this.name = name;
		this.dimension = dimension;
	}
}
