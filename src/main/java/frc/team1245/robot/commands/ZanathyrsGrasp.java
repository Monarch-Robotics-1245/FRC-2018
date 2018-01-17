package frc.team1245.robot.commands;

import frc.team1245.robot.Robot;
import frc.team1245.robot.OI;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.DriverStation;

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
        if (OI.driverPad.getTriggerAxis(GenericHID.Hand.kRight) > 0.5) {
            Robot.gripper.rightArmOfZanathyr.set(-0.5);
            Robot.gripper.leftArmOfZanathyr.set(0.5);
        }
        else if (OI.driverPad.getTriggerAxis(GenericHID.Hand.kLeft) > 0.5) {
            Robot.gripper.rightArmOfZanathyr.set(0.5);
            Robot.gripper.leftArmOfZanathyr.set(-0.5);
        }
        else {
            Robot.gripper.rightArmOfZanathyr.set(0);
            Robot.gripper.leftArmOfZanathyr.set(0);
        }
    }
}
