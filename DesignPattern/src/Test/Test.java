package Test;

import SimpleFactory.Factory;
import SimpleFactory.ImplA;
import SimpleFactory.MyApi;

public class Test {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Inputer ipt=new Inputer();
//		ipt.input();
//		InputStream is=new InputStream();InputStream是抽象类不能实例化
//		System.out.println(fun()+" ");
//		
//		try{
//			System.out.println("try");
//			return;
//		}
//		finally{
//			System.out.println("finally");
//		}
//		
//		TimeDemo tm=new TimeDemo();
//		tm.showTime();
		Factory mf=new Factory();
		
		MyApi api=mf.onCreate(1);
		api.operate("xiaoming");
		api=mf.onCreate(2);
		api.operate("xiaohong");
	}
	
}	
