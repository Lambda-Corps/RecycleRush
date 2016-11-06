package org.usfirst.frc.team1895.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//Gamepad/Joysticks Ports
    public static final int F310_port = 0;
    
    //PWM Ports
    public static final int FLmotor_port = 0;
    public static final int FRmotor_port = 1;
    public static final int RLmotor_port = 2;
    public static final int RRmotor_port = 3;
    public static final int elevator_port = 4;
    public static final int cameraServo_port = 6;
    
    //Analog Ports
    //public static final int ultrasonic_port = 1;
    public static final int gyroscope_port = 0;
    
    
    //DIO Ports
    public static final int elevatorEncoder1_1_port = 3;
    public static final int elevatorEncoder1_2_port = 2;
    public static final int elevator_lowerBound_port = 8;
    public static final int elevator_upperBound_port = 9;
    
    //PCM Solenoid Ports
    public static final int solenoid1_1_port = 0;
    public static final int solenoid1_2_port = 1;
}
