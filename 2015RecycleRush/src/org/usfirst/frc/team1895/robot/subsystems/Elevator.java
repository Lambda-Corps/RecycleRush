
package org.usfirst.frc.team1895.robot.subsystems;

import org.usfirst.frc.team1895.robot.RobotMap;
import org.usfirst.frc.team1895.robot.commands.MoveElevator;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
 
/**
 *
 */
public class Elevator extends Subsystem {
	
    public Jaguar elevatorMotor;
    public DigitalInput upperBound;
    public DigitalInput lowerBound;
    public boolean manualControl;

    public Encoder encoder;
    
	public Elevator() {
		elevatorMotor = new Jaguar(RobotMap.elevator_port);
		upperBound = new DigitalInput(RobotMap.elevator_upperBound_port);
		lowerBound = new DigitalInput(RobotMap.elevator_lowerBound_port);
		
		manualControl = true;
		
		encoder = new Encoder(RobotMap.elevatorEncoder1_1_port,RobotMap.elevatorEncoder1_2_port);
		//encoder.reset();
		
	}
	
	 

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new MoveElevator());
    }
}

