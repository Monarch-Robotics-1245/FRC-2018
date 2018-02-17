package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Driver;
import org.usfirst.frc.team1245.robot.OI;
import org.usfirst.frc.team1245.robot.Robot;
import org.usfirst.frc.team1245.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class ReleaseGripper extends Command{

	public ReleaseGripper() {
		requires(Robot.releaseSolenoid);
	}
	
	public void execute() {
		if(RobotMap.getDriver()==Driver.Justin) {
			if(OI.driverStick.getRawButtonPressed(10)) {
				Robot.releaseSolenoid.release();
			}
		}
		else {
			if(OI.driverPad.getBButtonPressed()) {
				Robot.releaseSolenoid.release();
			}
		}
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
