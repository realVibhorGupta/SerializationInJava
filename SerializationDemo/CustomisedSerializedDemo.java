
package SerializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomisedSerializedDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
			
			Accounts a1= new Accounts();
			System.out.println(a1.username+"....."+a1.password);
			
			FileOutputStream fos=new FileOutputStream("abc.ser");
			
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(a1);
			
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois= new ObjectInputStream(fis);
			
			Accounts a2=(Accounts) ois.readObject();
		
			System.out.println(a2.username+"......"+a2.password);
			
			
			
		
		
	}

}
