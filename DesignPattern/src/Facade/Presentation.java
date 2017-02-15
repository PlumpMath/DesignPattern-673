package Facade;

/**
 * 生成表现层模块
 * 
 * @author wangxingyong 2017-2-14 下午5:50:44 2017
 */
public class Presentation {
	/*
	 * 生成表现层（generate生成）
	 */
	public void generate() {
		ConfigMode cm = ConfigManger.getInstance().getConfigMode();
		if (cm.isNeedGenPresentation()) {
			System.out.println("生成表现层代码文件");
		}
	}
}
