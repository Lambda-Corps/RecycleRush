
package org.usfirst.frc.team1895.robot.subsystems;

import org.usfirst.frc.team1895.robot.RobotMap;
import org.usfirst.frc.team1895.robot.commands.MoveCamera;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Camera extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	

    public Servo cameraServo;
    
    public double desiredCameraAngle;
    
    public Camera() {
    	cameraServo = new Servo(RobotMap.cameraServo_port);
		desiredCameraAngle = 0.0;
    }
    
    public void incDesiredCameraAngle() {
		if(cameraServo.get() < 0.9) {
			desiredCameraAngle += 0.01;
		}
	}
	public void decDesiredCameraAngle() {
		if(cameraServo.get() > 0.1) {
			desiredCameraAngle -= 0.01;
		}
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new MoveCamera());
    }
}

