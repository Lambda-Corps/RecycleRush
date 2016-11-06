
package org.usfirst.frc.team1895.robot.subsystems;

import org.usfirst.frc.team1895.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
// import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class CopyOfDriveTrain extends PIDSubsystem {
    
	public Talon FLmotor;
	public Talon FRmotor;
	public Talon RLmotor;
	public Talon RRmotor;
	
	
	/// public Gyro gyro;
	
	public AnalogInput pValue;
	public AnalogInput iValue;
	public AnalogInput dValue;
	
	public double correctionFactor;
	public double desiredAngle;
	
	public CopyOfDriveTrain() {
		
		super(0.875,0.0,3.240);
		
		FLmotor = new Talon(RobotMap.FLmotor_port);
		FRmotor = new Talon(RobotMap.FRmotor_port);
		RLmotor = new Talon(RobotMap.RLmotor_port);
		RRmotor = new Talon(RobotMap.RRmotor_port);
		
		
///		gyro = new Gyro(RobotMap.gyroscope_port);
		
		pValue = new AnalogInput(1);
		iValue = new AnalogInput(2);
		dValue = new AnalogInput(3);
		
		correctionFactor = 0.0;
		desiredAngle = 0.0;
		
		setAbsoluteTolerance(10);
        setOutputRange(-15.0, 15.0);
        enable();
		
        
	}
	
	
	
	public void usePIDOutput(double value)  {
		correctionFactor = value / 15;
	}
	public double returnPIDInput() {
//		return gyro.getAngle();
		return 0;
	}
	
	public void setDesiredAngle(double value) {
		desiredAngle += (value * 2);
		getPIDController().setSetpoint(desiredAngle);
		
	}
	
	
	//drive methods
	public void drivePIDMecanum(double drive, double strafe) {
		/*
		double w0;
		double w1;
		double w2;
		double w3;
		double wMax;
		
		w0 = drive + strafe - correctionFactor * 1.0;
		w1 = drive - strafe + correctionFactor * 1.0; 
		w2 = drive - strafe - correctionFactor * 1.0;
		w3 = drive + strafe + correctionFactor * 1.0;
		
		wMax = Math.min(Math.max(Math.abs(w0), Math.abs(w1)), Math.max(Math.abs(w2), Math.abs(w3)));
		
		if(wMax > 1) {
			w0 = w0/wMax;
			w1 = w1/wMax;
			w2 = w2/wMax;
			w3 = w3/wMax;
		}
		 
		FLmotor.set(-w0*0.5);
		FRmotor.set( w1*0.5);
		RLmotor.set(-w2*0.5);
		RRmotor.set( w3*0.5);
		*/
	}
	public void driveMecanum(double drive, double strafe, double yaw) {
		double w0;
		double w1;
		double w2;
		double w3;
		double wMax;
		
		w0 = drive + strafe - yaw;
		w1 = drive - strafe + yaw; 
		w2 = drive - strafe - yaw;
		w3 = drive + strafe + yaw;
		
		wMax = Math.min(Math.max(Math.abs(w0), Math.abs(w1)), Math.max(Math.abs(w2), Math.abs(w3)));
		
		if(wMax > 1) {
			w0 = w0/wMax;
			w1 = w1/wMax;
			w2 = w2/wMax;
			w3 = w3/wMax;
		}
		 
		FLmotor.set(-w0*0.5);
		FRmotor.set( w1*0.5);
		RLmotor.set(-w2*0.5);
		RRmotor.set( w3*0.5);
	}
	public void driveTank(double drive, double yaw) {
		double w0;
		double w1;
		double w2;
		double w3;
		double wMax;
		
		w0 = drive + yaw;
		w1 = drive - yaw;
		w2 = drive + yaw;
		w3 = drive - yaw;
		
		wMax = Math.min(Math.max(Math.abs(w0), Math.abs(w1)), Math.max(Math.abs(w2), Math.abs(w3)));
		
		if(wMax > 1) {
			w0 = w0/wMax;
			w1 = w1/wMax;
			w2 = w2/wMax;
			w3 = w3/wMax;
		}
		
		FLmotor.set(-w0);
		FRmotor.set( w1);
		RLmotor.set(-w2);
		RRmotor.set( w3);
	}
	
    
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	//setDefaultCommand(new MainDrive());
    }
}

