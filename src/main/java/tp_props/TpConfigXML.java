package tp_props;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class TpConfigXML {

	public static void main(String[] args) {

		Configurations configs = new Configurations();
		
		try {
			
			File file = new File("config.xml");
			XMLConfiguration xml = configs.xml(file);
			
			Map<String, String> configMap = new HashMap<>();
			
			xml.getKeys().forEachRemaining(key -> configMap.put(key, xml.getString(key)));
			
			System.out.println(configMap);
			
		} catch (ConfigurationException err) {
			System.err.println(err);
		}
		
	}

}
