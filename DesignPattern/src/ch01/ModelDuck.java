package ch01;

public class ModelDuck extends Duck {

	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("���� ���� �����Դϴ�.");
	}

}
