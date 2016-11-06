package org.usfirst.frc.team1895.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team1895.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public F310Gamepad F310;
	public Button button;
	public Button button2;
	public Button button3;
	
	public OI() {
		F310 = new F310Gamepad(0,4,12);
		button = new JoystickButton(F310, 2);
		button.whenPressed(new TogglePneumatics());
		button2 = new JoystickButton(F310, 1);
		button2.whenPressed(new ElevatorSetpoint_bottom());
		button3 = new JoystickButton(F310, 4);
		button3.whenPressed(new ElevatorSetpoint_1());
	}
	
	
	public void init() {
		SmartDashboard.putNumber("FLmotor", Robot.driveTrain.FLmotor.get());
	}
}

