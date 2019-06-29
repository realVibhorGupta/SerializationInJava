package SerializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialisationDemo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

			Dog1 d1=new Dog1();
			FileOutputStream  fos = new FileOutputStream("abc.ser");
			@SuppressWarnings("resource")
			ObjectOutputStream  oos=new ObjectOutputStream(fos);
			oos.writeObject(d1);
			
			FileInputStream  fis =new FileInputStream("abc.ser");
			@SuppressWarnings("resource")
			ObjectInputStream ois= new ObjectInputStream(fis);
			Dog1 d2= (Dog1) ois.readObject();
			System.out.println(d2.c.r.j);
			
			
	
	}

}
