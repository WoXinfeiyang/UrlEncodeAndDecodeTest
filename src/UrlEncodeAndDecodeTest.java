import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;


public class UrlEncodeAndDecodeTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str01="http://www.baidu.com/s?wd=ÖÐ¹ú";
		System.out.println("str01="+str01);
		try {
			String str02=URLEncoder.encode(str01,"GBK");
			System.out.println("str02="+str02);
			
			String str03=URLEncoder.encode(str02,"GBK");
			System.out.println("str03="+str03);
			
			String str04=URLEncoder.encode(str03,"GBK");
			System.out.println("str04="+str04);
			
			String dstr02=URLDecoder.decode(str02,"GBK");
			System.out.println("dstr02="+dstr02);
			
			String dstr03=URLDecoder.decode(str03,"GBK");
			System.out.println("dstr03="+dstr03);
			
			String dstr04=URLDecoder.decode(str04,"GBK");
			System.out.println("dstr04="+dstr04);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
