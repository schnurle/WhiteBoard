package Logic;

public class Singleton {

	private static Singleton instance; //Variable der Singleton-Instanz 
	private Singleton() {} // Konstruktor 
	
	public static synchronized Singleton getInstance() { 
		if (instance == null) { 
				instance = new Singleton(); 
				} 
		return instance; 
		} 
	
	public void doSomething() { 
		
		
	}
	
	
}
