package org.usfirst.frc.team1245.robot.subsystems;

import org.usfirst.frc.team1245.robot.commands.ReleaseGripper;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ReleaseSolenoid extends Subsystem{
	Solenoid releasesolenoid;
	public ReleaseSolenoid(int channel) {
		this.releasesolenoid = new Solenoid(channel);
		this.releasesolenoid.set(false);
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new ReleaseGripper());
	}
	
	public void release() {
		this.releasesolenoid.set(!this.releasesolenoid.get());
	}
}
