package Facade;
/**
 * ����ҵ���ģ��
 * @author wangxingyong
 * 2017-2-15
 * ����11:04:00
 * 2017
 */
public class Business {
	public void generate() {
		ConfigMode cm=ConfigManger.getInstance().getConfigMode();
		if(cm.isNeedGenBusiness()){
			System.out.println("�����߼���");
		}
	}
}
