
public class Fish implements IFood {

	@Override
	public void save(IFood food) {
		System.out.println("save food");

	}

	@Override
	public void delete(IFood food) {
		System.out.println("delete food");

	}

}
