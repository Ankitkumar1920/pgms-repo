package oops;

public class australianTraffic implements centralTraffic,trainSymbol {
	//one class can implement multiple interfaces
	//use comma to add another interface
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		centralTraffic a = new australianTraffic();
		a.redStop();
		a.greenGo();
		a.yellowSlow();
		australianTraffic at = new australianTraffic();
		at.walkOn();
		trainSymbol tt=new australianTraffic();
		tt.trainSyms();
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("green go implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red stop implementation");
	}

	@Override
	public void yellowSlow() {
		// TODO Auto-generated method stub
		System.out.println("yellow slow implementation");
	}
	
	public void walkOn() {
		System.out.println("Walking");
	}

	@Override
	public void trainSyms() {
		// TODO Auto-generated method stub
		System.out.println("Train Symbols");
	}

}
