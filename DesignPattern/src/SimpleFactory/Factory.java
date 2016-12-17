package SimpleFactory;

public class Factory {
	public MyApi onCreate(int flag) {
		// TODO Auto-generated method stub
		MyApi api=null;
		if(flag==1){
			api=new ImplA();
		}else if(flag==2){
			api=new ImplB();
		}
		return api;
	}
}
