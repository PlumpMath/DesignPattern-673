package Facade;

public class ConfigManger {
	/*
	 * ���ù��������ȡ�����ļ������������ļ��������õ�Mode��
	 */
	private static ConfigManger manger = null;
	private static ConfigMode cm = null;
	
	//����
	private ConfigManger(){
	}
	
	public static ConfigManger getInstance() {
		// TODO Auto-generated method stub
		if(null==manger){
			manger=new ConfigManger();
			cm=new ConfigMode();
			/*
			 * ʡ����
			 * ��ȡ�����ļ�
			 * ���������õ�Mode��
			 * �Ĳ���
			 */
		}
		return manger;
	}

	/*
	 * ��ȡ��������
	 */
	public ConfigMode getConfigMode() {
		return cm;
	}

	
}
