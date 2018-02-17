package org.usfirst.frc.team1245.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.Timer;
import org.usfirst.frc.team1245.robot.Robot;
import org.usfirst.frc.team1245.robot.Side;

/**
 * Created by Zelie on 2/5/18.
 */
public class GyroDrive extends Command {

    private Gyro gyro;
    private Timer timer;
    private boolean finished = false;
    private Side sideSwitch, sideRobot;

    public GyroDrive(Side sideSwitch, Side sideRobot) {
        requires(Robot.drivetrain);

        timer = new Timer();
        gyro = new AnalogGyro(1);
        this.sideSwitch = sideSwitch;
        this.sideRobot = sideRobot;
    }
    
    public GyroDrive() {
    	new GyroDrive(Side.Right, Side.Center); //because crashing because we don't have a default sucks
    }

    protected void initialize() {
        timer.start();
    }

    protected void execute() {
        if(sideSwitch == Side.Left) {
        	
        } else if(sideSwitch == Side.Right) {
        	
        } else {
        	//HOW!?
        	//drive forward so we get auto bonus at least
        	
        }
    }

    @Override
    protected boolean isFinished() {
        return finished;
    }
}