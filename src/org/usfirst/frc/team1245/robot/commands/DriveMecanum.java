package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Driver;
import org.usfirst.frc.team1245.robot.OI;
import org.usfirst.frc.team1245.robot.Robot;
import org.usfirst.frc.team1245.robot.RobotMap;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;

public class DriveMecanum extends Command {
    public DriveMecanum(){
        requires(Robot.drivetrain);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void execute(){
     	double y, x, twist;
        // Get joystick input and filter it through the dead zone function
    	if(RobotMap.getDriver()==Driver.Cooper) {
    		y = OI.scaleSpeed(OI.deadZone(OI.driverPad.getX(GenericHID.Hand.kLeft), RobotMap.getTranslationalDeadZone()), 1);
    		x = OI.scaleSpeed(-OI.deadZone(OI.driverPad.getY(GenericHID.Hand.kLeft), RobotMap.getTranslationalDeadZone()), 1);
    		twist = OI.scaleSpeed(OI.deadZone(OI.driverPad.getX(GenericHID.Hand.kRight), RobotMap.getRotationalDeadZone()), 1);
    	} else if (RobotMap.getDriver()==Driver.Justin) {
    		y = OI.scaleSpeed(OI.deadZone(OI.driverStick.getX(), RobotMap.getTranslationalDeadZone()), 1);
    		x = OI.scaleSpeed(-OI.deadZone(OI.driverStick.getY(), RobotMap.getTranslationalDeadZone()), 1);
    		twist =OI.scaleSpeed(OI.deadZone(OI.driverStick.getTwist(), RobotMap.getRotationalDeadZone()), 1);
    	} else {
    		y = OI.scaleSpeed(OI.deadZone(OI.driverPad.getX(GenericHID.Hand.kLeft), RobotMap.getTranslationalDeadZone()), 1);
    		x = OI.scaleSpeed(-OI.deadZone(OI.driverPad.getY(GenericHID.Hand.kLeft), RobotMap.getTranslationalDeadZone()), 1);
         	twist = OI.scaleSpeed(OI.deadZone(OI.driverPad.getX(GenericHID.Hand.kRight), RobotMap.getRotationalDeadZone()), 1);
    	}

        // Drive the robot based on the user input
        Robot.drivetrain.getDrivetrain().driveCartesian(x,y,twist,0);
        
    }
}
