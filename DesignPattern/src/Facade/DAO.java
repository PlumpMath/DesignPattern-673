package Facade;

public class DAO {
	public void generate() {
		ConfigMode cm=ConfigManger.getInstance().getConfigMode();
		if(cm.isNeedGenDao()){
			System.out.println("Éú³Édao²ã");
		}
	}
}
