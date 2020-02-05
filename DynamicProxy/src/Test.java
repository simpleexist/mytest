import java.lang.reflect.Proxy;


public class Test {

	/**   
	 * @Description: TODO(用一句话描述该文件做什么) 
	 * @param 
	 * @return
	 * @throws 
	 */
	public static void main(String[] args) {
		IFood food = new Fish();
		FoodDynamicProxy fdp = new FoodDynamicProxy(food);
		IFood ifd = (IFood)Proxy.newProxyInstance(food.getClass().getClassLoader(), new Class[]{IFood.class}, fdp);
		ifd.save(new Fish());
		ifd.delete(new Fish());
	}

}
