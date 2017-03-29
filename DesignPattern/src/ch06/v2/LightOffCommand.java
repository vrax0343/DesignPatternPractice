package ch06.v2;

import ch06.Command;
import ch06.Light;

public class LightOffCommand implements Command {
	Light light;
  
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
