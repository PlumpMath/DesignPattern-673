package Facade;

public class ConfigManger {
	/*
	 * 配置管理，负责读取配置文件，并把配置文件内容配置到Mode中
	 */
	private ConfigManger manger = null;
	private ConfigMode cm = null;
	
	//单例
	private ConfigManger(){
		if(null==manger){
			manger=new ConfigManger();
			cm=new ConfigMode();
			/*
			 * 省略了
			 * 读取配置文件
			 * 把内容配置到Mode里
			 * 的步骤
			 */
		}
	}

	/*
	 * 获取配置内容
	 */
	public ConfigMode getConfigMode() {
		return cm;
	}

	
}
