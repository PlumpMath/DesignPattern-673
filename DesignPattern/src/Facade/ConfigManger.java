package Facade;

public class ConfigManger {
	/*
	 * ���ù��������ȡ�����ļ������������ļ��������õ�Mode��
	 */
	private ConfigManger manger = null;
	private ConfigMode cm = null;
	
	//����
	private ConfigManger(){
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
	}

	/*
	 * ��ȡ��������
	 */
	public ConfigMode getConfigMode() {
		return cm;
	}

	
}
