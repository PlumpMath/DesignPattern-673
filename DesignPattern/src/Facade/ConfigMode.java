package Facade;

public class ConfigMode {
	/*
	 * ��־λ���Ƿ����ɱ��ֲ㡢�߼�������ݲ㣨Dao��
	 */
	private boolean needGenPresentation = true;
	private boolean needGenBusiness = true;
	private boolean needGenDao = true;

	public boolean isNeedGenPresentation() {
		return needGenPresentation;
	}

	public void setNeedGenPresentation(boolean needGenPresentation) {
		this.needGenPresentation = needGenPresentation;
	}

	public boolean isNeedGenBusiness() {
		return needGenBusiness;
	}

	public void setNeedGenBusiness(boolean needGenBusiness) {
		this.needGenBusiness = needGenBusiness;
	}

	public boolean isNeedGenDao() {
		return needGenDao;
	}

	public void setNeedGenDao(boolean needGenDao) {
		this.needGenDao = needGenDao;
	}
	
}
