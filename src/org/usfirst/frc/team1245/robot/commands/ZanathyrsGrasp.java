package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Driver;
import org.usfirst.frc.team1245.robot.OI;
import org.usfirst.frc.team1245.robot.Robot;
import org.usfirst.frc.team1245.robot.RobotMap;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;

public class ZanathyrsGrasp extends Command {

    public ZanathyrsGrasp(){
        requires(Robot.gripper);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void execute() {
    	if(RobotMap.getDriver()==Driver.Justin) {
    		if(OI.driverStick.getRawButton(2)) { //out
    			Robot.gripper.rightArmOfZanathyr.set(0.8);
    			Robot.gripper.leftArmOfZanathyr.set(0.8);
    		}
    		else if(OI.driverStick.getRawButton(1)) { //in
    			Robot.gripper.rightArmOfZanathyr.set(-1);
    			Robot.gripper.leftArmOfZanathyr.set(-1);
    		}
    		else {
    			Robot.gripper.rightArmOfZanathyr.set(0);
    			Robot.gripper.leftArmOfZanathyr.set(0);
    		}
    	}
    	else {
    		if(OI.driverPad.getYButton()) { //out
    			Robot.gripper.rightArmOfZanathyr.set(.8);
    			Robot.gripper.leftArmOfZanathyr.set(0.8);
    		}
    		else if(OI.driverPad.getXButton()) { //in
    			Robot.gripper.rightArmOfZanathyr.set(-1);
    			Robot.gripper.leftArmOfZanathyr.set(-1);
    		}
    		else {
    			Robot.gripper.rightArmOfZanathyr.set(0);
    			Robot.gripper.leftArmOfZanathyr.set(0);
    		}
    	}
    }
}
