package SerializationDemo;

import java.io.Serializable;

public class Dog implements Serializable {
	

	private static final long serialVersionUID = 1L;
	final int i=10;
	int j=20;//transient gives default value it means not to serialise
}
