package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Launch extends Command{
	double velocity, time;
	Timer timer;
	public Launch(double velocity, double time) {
		this.velocity = velocity;
		this.time = time;
	}
	
	protected void initialize() {
		this.timer.start();
	}
	
	protected void execute() {
		Robot.drivetrain.getDrivetrain().driveCartesian(0, 0, 0);
		
		Robot.gripper.leftArmOfZanathyr.set(this.velocity);
		Robot.gripper.rightArmOfZanathyr.set(this.velocity);
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
