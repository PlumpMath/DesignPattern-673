package Facade;

/**
 * ���ɱ��ֲ�ģ��
 * 
 * @author wangxingyong 2017-2-14 ����5:50:44 2017
 */
public class Presentation {
	/*
	 * ���ɱ��ֲ㣨generate���ɣ�
	 */
	public void generate() {
		ConfigMode cm = ConfigManger.getInstance().getConfigMode();
		if (cm.isNeedGenPresentation()) {
			System.out.println("���ɱ��ֲ�����ļ�");
		}
	}
}
