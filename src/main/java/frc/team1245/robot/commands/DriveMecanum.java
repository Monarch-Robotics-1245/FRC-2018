package frc.team1245.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class DriveMecanum extends Command {
    public DriveMecanum(){
        requires(null);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
