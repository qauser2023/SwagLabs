package demo;

 interface ParentA {
	 default void show(){
		 System.out.println("PARENT A");
	 }
}

 interface ParentB{
	 default void show(){
		 System.out.println("PARENT B");
	 }
}

public class USA implements ParentA, ParentB{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		ParentA.super.show();
		ParentB.super.show();
		
	}
	
	
}


