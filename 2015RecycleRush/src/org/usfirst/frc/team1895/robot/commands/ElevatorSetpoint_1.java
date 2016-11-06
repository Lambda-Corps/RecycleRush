
package org.usfirst.frc.team1895.robot.commands;

import org.usfirst.frc.team1895.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


/**
 *
 */
public class ElevatorSetpoint_1 extends Command {

	double desired;
	double setSpeed;
	boolean stop;
	
    public ElevatorSetpoint_1() {
        // Use requires() here to declare subsystem dependencies
        //requires(Robot.exampleSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.elevator.manualControl = false;
    	desired = 850.0;
    	stop = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.elevator.manualControl == false) {
    		if((Robot.elevator.encoder.getDistance() > (desired + 10)) || (Robot.elevator.encoder.getDistance() < (desired - 10))) {
    			setSpeed = (Robot.elevator.encoder.getDistance() - desired)*10;
    			if(setSpeed < -150) {setSpeed = -150;}
    			else if(setSpeed > 150) {setSpeed = 150;}
    			Robot.elevator.elevatorMotor.set(setSpeed/200);
    		} else {
    			stop = true;
    		}
    		System.out.println("encoder: "+Robot.elevator.encoder.getDistance());
    		System.out.println(stop);
    		System.out.println(setSpeed);
    	} else {
    		stop = true;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return stop;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.elevator.elevatorMotor.set(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
