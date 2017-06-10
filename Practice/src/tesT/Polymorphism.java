package tesT;

class bike{
	public void run(){
		System.out.println("bike is running");
	}
	public String run(int a){
		System.out.println("Dhinchak !!");
		return null;
	}
}

class bajaj extends bike{
	public void run(){
		System.out.println("bajaj is running");
		System.out.println("LOL !!");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike obj = new bajaj();
		obj.run();
	}

}
