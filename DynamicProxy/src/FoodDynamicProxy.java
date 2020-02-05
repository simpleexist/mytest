import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class FoodDynamicProxy implements InvocationHandler{

	private Object target;
	
	public FoodDynamicProxy(Object target) {
		super();
		this.target = target;
	}

	InsertOther io = new InsertOther();
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		io.show();
		System.out.println(method.getName()+"===>");
		method.invoke(target, args);
		return null;
	}

}
