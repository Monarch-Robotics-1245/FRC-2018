package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;
import org.usfirst.frc.team1245.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import edu.wpi.first.wpilibj.interfaces.Gyro;

public class LeftSwitch extends CommandGroup{

	public LeftSwitch() {

		addSequential(new Drive(0, -.4, 0, 1));
		addSequential(new Drive(.5, 0, 0, 1.5));
		addSequential(new Drive(.2, 0, 0, .8));
		addSequential(new Launch(1, 1));//launch
	}
}
