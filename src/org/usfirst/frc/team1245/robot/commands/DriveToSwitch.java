package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;
import org.usfirst.frc.team1245.robot.Side;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class DriveToSwitch extends Command {

    //private Gyro gyro;
    private Timer timer;
    private boolean finished = false;
    private Side sideSwitch, sideRobot;
    
    private double angle, kP;

    public DriveToSwitch(Side sideSwitch, Side sideRobot) {
        requires(Robot.drivetrain);

        //timer = new Timer();
        this.sideSwitch = sideSwitch;
        this.sideRobot = sideRobot;
        if(this.sideSwitch != Robot.getDumpSide()) {
        	this.sideSwitch = Robot.getDumpSide();
        	//look up how to print to console if it this happens
        }
       
    }
    
    public DriveToSwitch() {
    	new DriveToSwitch(Side.Right, Side.Center); //because crashing because we don't have a default sucks
    }

    protected void initialize() {
        System.out.println("timer made it here");
    	timer = new Timer();
    	timer.start();
    	System.out.println("timer made");
        // gyro.reset();
        kP = .05;
    }

    protected void execute() {
    	if(timer.get()<1.5) {
    		Robot.drivetrain.getDrivetrain().driveCartesian(.5, 0, 0.03);
    	} else if (timer.get()<2.5) {
    		Robot.drivetrain.getDrivetrain().driveCartesian(.2, 0, 0.03);
    	} else if (timer.get()<3.7) {
    		Robot.drivetrain.getDrivetrain().driveCartesian(0, 0, 0);
    		Robot.gripper.leftArmOfZanathyr.set(.8);
    		Robot.gripper.rightArmOfZanathyr.set(.8);
    	} else {
    		Robot.gripper.leftArmOfZanathyr.set(0);
    		Robot.gripper.rightArmOfZanathyr.set(0);
    		Robot.drivetrain.getDrivetrain().driveCartesian(0, 0, 0);
    	}
    }
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
