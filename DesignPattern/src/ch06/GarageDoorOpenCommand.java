package ch06;

public class GarageDoorOpenCommand implements Command {
	GarageDoor gd;
	
	public GarageDoorOpenCommand(GarageDoor gd) {
		super();
		this.gd = gd;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gd.up();
	}

}
