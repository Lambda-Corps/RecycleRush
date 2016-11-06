
package org.usfirst.frc.team1895.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1895.robot.Robot;

/**
 *
 */
public class TogglePneumatics extends Command {

    public TogglePneumatics() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.pneumatics);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//System.out.println("open");
    	if(Robot.pneumatics.arm.get() == DoubleSolenoid.Value.kForward) {
    		Robot.pneumatics.arm.set(DoubleSolenoid.Value.kReverse);
    		System.out.println("open");
    	} else if(Robot.pneumatics.arm.get() == DoubleSolenoid.Value.kReverse) {
    		Robot.pneumatics.arm.set(DoubleSolenoid.Value.kForward);
    		System.out.println("close");
    	} else {
    		Robot.pneumatics.arm.set(DoubleSolenoid.Value.kForward);
    	}
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
