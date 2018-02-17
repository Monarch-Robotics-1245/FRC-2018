package org.usfirst.frc.team1245.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team1245.robot.commands.ZanathyrsGrasp;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Gripper extends Subsystem{

    public Talon leftArmOfZanathyr, rightArmOfZanathyr;

    public Gripper(int leftArm, int rightArm) {
        this.leftArmOfZanathyr = new Talon(leftArm);
        this.rightArmOfZanathyr = new Talon(rightArm);

        //They need to spin opposite ways
        this.leftArmOfZanathyr.setInverted(true);
        this.rightArmOfZanathyr.setInverted(false);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new ZanathyrsGrasp());
    }
}
