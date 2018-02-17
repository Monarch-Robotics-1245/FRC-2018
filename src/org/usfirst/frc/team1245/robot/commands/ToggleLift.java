package org.usfirst.frc.team1245.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1245.robot.Driver;
import org.usfirst.frc.team1245.robot.OI;
import org.usfirst.frc.team1245.robot.Robot;
import org.usfirst.frc.team1245.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class ToggleLift extends Command{

    public ToggleLift() {
        requires(Robot.elevator);
    }

    protected void execute() {
    	if(RobotMap.getDriver()==Driver.Justin) {
    		if(OI.driverStick.getRawButtonPressed(5)) {
    			Robot.elevator.setForward();
    		}
    		if(OI.driverStick.getRawButtonPressed(6)) {
    			Robot.elevator.setReverse();
    		}
    	} else {
    		if (OI.driverPad.getAButtonPressed()) {
            	if (Robot.elevator.getValue()!=Value.kForward) {
                	Robot.elevator.setForward();
            	} else {
                	Robot.elevator.setReverse();
            	}
        	}
    	}
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}