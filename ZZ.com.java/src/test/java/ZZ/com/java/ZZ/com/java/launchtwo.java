package ZZ.com.java.ZZ.com.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class launchtwo {

	public static void main(String[] args) throws FileNotFoundException {
		File file1 = new File("/Users/lakshtisharma/eclipse-workspace/ZZ.com.java/OR.properties");
		FileInputStream stream = new FileInputStream(file1);
		Properties prop = new Properties();
		String data = (String) prop.get("Threate");
		System.out.println(data);
	}

}
