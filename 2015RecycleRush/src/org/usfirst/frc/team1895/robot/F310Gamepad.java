package org.usfirst.frc.team1895.robot;

import edu.wpi.first.wpilibj.Joystick;

public class F310Gamepad extends Joystick {
	
	public static final int LXAxis = 1;
	public static final int LYAxis = 2;
	public static final int RXAxis = 3;
	public static final int RYAxis = 4;
	
	//public Button button_A;
	
	protected F310Gamepad(int port, int numAxisTypes, int numButtonTypes) {
		super(port, numAxisTypes, numButtonTypes);
//		button_A = new JoystickButton(this, 2);
	}
	
	
}
