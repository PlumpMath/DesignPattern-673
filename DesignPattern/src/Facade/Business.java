package Facade;
/**
 * 生成业务层模块
 * @author wangxingyong
 * 2017-2-15
 * 上午11:04:00
 * 2017
 */
public class Business {
	public void generate() {
		ConfigMode cm=ConfigManger.getInstance().getConfigMode();
		if(cm.isNeedGenBusiness()){
			System.out.println("生成逻辑层");
		}
	}
}
