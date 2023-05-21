package java_design_patterns;

public class Singleton {
	
	//Constructor should be private
	private Singleton() {}
	
	private static class SingletonHolder {
		public static final Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}
}
