package ch04;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		if(item.equals("cheese")){
			return new NYStyleCheesePizza();
		}/*else if (item.equals("veggie")){
			return new NYStyleVeggiePizza();
		}else if (item.equals("clam")){
			return new NYStyleClamPizza();
		}else if (item.equals("pepperoni")){
			return new NYStylePepperoniPizza();
		}*/
		return null;
	}

}
