package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;
import org.usfirst.frc.team1245.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.interfaces.Gyro;

public class Drive extends Command{
	double x, y, twist, time, angle;
	Timer timer;
	Gyro gyro;
	public Drive(double y, double x, double twist, double time) {//time in seconds
		this.x = x;
		this.y = y;
		this.twist = twist;
		this.time = time;
	}
	
	protected void initialize() {
    	this.timer = new Timer();
    	this.timer.start();
    	this.gyro = new AnalogGyro(RobotMap.getGyroChannel());
        this.gyro.reset();
    }

    protected void execute() {
    	angle = gyro.getAngle();
    	Robot.drivetrain.getDrivetrain().driveCartesian(y, x, twist-(angle*.05));
    }
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		if(timer.get() < time) {
			return true;
		} else {
			return false;
		}
	}
	
}
