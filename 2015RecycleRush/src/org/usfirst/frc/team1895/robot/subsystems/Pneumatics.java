
package org.usfirst.frc.team1895.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics extends Subsystem {
    
	public DoubleSolenoid arm;
    
    public Pneumatics() {
    	arm = new DoubleSolenoid(0,1);
    }
    
    
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new RunCompressor());
    }
}

