package colection;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p=new Properties();
	FileInputStream kk=new FileInputStream("C://Users//shivu//eclipse-[MANI]//colection//src//colection//test,properties");
p.load(kk);
System.out.println(p);
 String ss=p.getProperty("choclate");
 System.out.println(ss);
 p.setProperty("choclate", "100");
 FileOutputStream jj=new FileOutputStream("C://Users//shivu//eclipse-[MANI]//colection//src//colection//test,properties");
	p.store(jj, "output");
	System.out.println(p);
	}

}
