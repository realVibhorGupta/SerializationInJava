package SerializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// DO Auto-generated method stub
		Dog d1=new Dog();
		
		/**Serialization 
		 * takes place
		 * here
		 */
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		@SuppressWarnings("resource")
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		/**De-serialization 
		 * takes place here
		 */
	
		FileInputStream fis=new FileInputStream("abc.ser");
		@SuppressWarnings("resource")
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		
		/** Serialisation 
		 * order should be maintained
		 * otherwise type cast error 
		 * will arise
		 */
		System.out.println(d2.i+"...."+d2.j);
		}

}
