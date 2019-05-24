package configurations;

import java.util.HashMap;
import java.util.Map;

/**
 * Class file represents setting the object instance into singleton and get the
 * object instance wherever required
 * 
 * @author Sohail
 *
 */
public class Singleton {

	private static Map<String, Object> serviceCollection = new HashMap<String, Object>();

	/**
	 * Method to get the object instance from singleton. If the object instance
	 * is not available, this method will set the object instance and get the
	 * same
	 * 
	 * @param aClass
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getInstance(Class<T> aClass) {
		Object instance = null;
		try {
			if (serviceCollection.containsKey(aClass.getTypeName())) {
				instance = serviceCollection.get(aClass.getTypeName());
			} else {
				serviceCollection.put(aClass.getTypeName(), aClass.newInstance());
				instance = serviceCollection.get(aClass.getTypeName());
			}
		} catch (InstantiationException ex) {
			throw new RuntimeException(ex.getMessage());
		} catch (IllegalAccessException ex) {
			throw new RuntimeException(ex.getMessage());
		}
		return (T) instance;
	}

	/**
	 * Method to set the object instance into the singleton
	 * 
	 * @param aClass
	 * @param instance
	 */
	public static <T> void setInstance(Class<T> aClass, Object instance) {
		try {
			if (!serviceCollection.containsKey(aClass.getTypeName()) && (aClass.isInstance(instance))) {
				serviceCollection.put(aClass.getTypeName(), instance);
			}
		} catch (Exception e) {
			throw new RuntimeException("Error occured while setting the object instance in singleton");
		}
	}
}
