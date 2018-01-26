package frc.team1245.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.team1245.robot.Robot;
import frc.team1245.robot.OI;

public class ToggleLift extends Command{

    public ToggleLift() {
        requires(Robot.gripper);
    }

    protected void execute() {
        if (OI.driverPad.getAButtonPressed()) {
            if (Robot.elevator.getValue() == DoubleSolenoid.Value.kForward) {
                Robot.elevator.setReverse();
            } else {
                Robot.elevator.setForward();
            }
        }
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}