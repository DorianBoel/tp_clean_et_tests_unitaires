package tp_props;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class TpConfigProperties {
	
	public static void main(String[] args) {
		
		ResourceBundle bundle = ResourceBundle.getBundle("config");
	
		Map<String, String> configMap = new HashMap<>();
		
		for (String key : bundle.keySet()) {
			configMap.put(key, bundle.getString(key));
		}
		
		System.out.println(configMap);
		
	}
	
}
