package Ch21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C06FileCopy {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		InputStream in = new FileInputStream("c:\\iotest\\dog.jpg");
		OutputStream out = new FileOutputStream("c:\\iotest\\copydog2.jpg");
		
		byte [] buff = new byte[4096];
		
//		while(true) {
//			int cnt=in.read(buff); //buff크기만큼 읽어와서 buff에저장,읽은개수를 리턴
//			if(cnt==-1) {
//				break;
//			}
//			out.write(buff,0,cnt);
//		}
		int cnt=0;
		while((cnt=in.read(buff)) !=-1) {
			out.write(buff,0,cnt);
		}
		

	}

}
