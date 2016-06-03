package ch01;

import java.io.StringBufferInputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import sun.misc.*;

public class DynamicProxyTest {
	interface IHello{
		void sayHello();
	}
	
	static class Hello implements IHello{
		@Override
		public void sayHello() {
			// TODO Auto-generated method stub
			System.out.println("Hello world");
		}
	}
	
	static class DynamicProxy implements InvocationHandler{
		Object originalobj;
		
		Object bind(Object originalobj){
			this.originalobj=originalobj;
			return Proxy.newProxyInstance(originalobj.getClass().getClassLoader(),originalobj.getClass().getInterfaces(),this);
		}
		@Override
		public Object invoke(Object proxy, Method method, Object[] args)
				throws Throwable {
			// TODO Auto-generated method stub
			System.out.println("welcome");
			
			return method.invoke(originalobj,args);
		}
	}
	
	public static void main(String[] args) {
		IHello hello = (IHello) new DynamicProxy().bind(new Hello());
		hello.sayHello();
		
	}

}
