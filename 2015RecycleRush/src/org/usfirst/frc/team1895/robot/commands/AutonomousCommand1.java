package org.usfirst.frc.team1895.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonomousCommand1 extends CommandGroup {
    
    public  AutonomousCommand1() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.
    	
    	
    	//close arm around tote or recycling container
    	addSequential(new TogglePneumatics());
    	addSequential(new StopAllCommand(),1);
    	//move elevator up to setpoint 1
    	addSequential(new ElevatorSetpoint_1());
    	addSequential(new StopAllCommand(),1);
    	//drive backward
    	addSequential(new AutoStraightDrive(0.45),5.5);
    	addSequential(new AutoStraightDrive(0),0.1);
    	addSequential(new StopAllCommand(),1);
    	//move elevator down
    	addSequential(new ElevatorSetpoint_bottom());
    	
    	
    }
}
