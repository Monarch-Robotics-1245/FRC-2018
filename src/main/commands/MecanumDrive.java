package main.commands;

import edu.wpi.first.wpilibj.command.Command;

public class MecanumDrive extends Command {
    public MecanumDrive(){
        requires(null);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
