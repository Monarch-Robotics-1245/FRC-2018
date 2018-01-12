package main.subsystems;

import com.ctre.CANTalon;
import main.commands.MecanumDrive;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem{

    //mecanum wheels access
    protected RobotDrive robotDrive;

    //initializing CANTalons
    public CANTalon frontLeft, frontRight, rearLeft, rearRight;

    public Drivetrain(int frontLeft, int frontRight, int rearLeft, int rearRight){
        //assigning motor ports to CANTalons
        this.frontLeft = new CANTalon(frontLeft);
        this.frontRight = new CANTalon(frontRight);
        this.rearLeft = new CANTalon(rearLeft);
        this.rearRight = new CANTalon(rearRight);

        //enabling brake mode //TODO: Lookup what brake mode does
        this.frontLeft.enableBrakeMode(true);
        this.frontRight.enableBrakeMode(true);
        this.rearLeft.enableBrakeMode(true);
        this.rearRight.enableBrakeMode(true);

        robotDrive = new RobotDrive(this.frontLeft, this.frontRight, this.rearLeft, this.rearRight);
        //invert right wheels so it drives straight
        robotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new MecanumDrive());
    }
}
