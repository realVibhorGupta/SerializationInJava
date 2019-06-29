package SerializationDemo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Accounts implements Serializable {

		String username="vibhor";
		transient 	String  password="gupta";
		
}
