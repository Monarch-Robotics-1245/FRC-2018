package frc.team1245.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.team1245.robot.commands.DriveMecanum;


public class Drivetrain extends Subsystem{

    //mecanum wheels access
    protected MecanumDrive robotDrive;

    //initializing CANTalons
    public WPI_TalonSRX frontLeft, frontRight, rearLeft, rearRight;

    public Drivetrain(int frontLeft, int frontRight, int rearLeft, int rearRight){
        //assigning motor ports to CANTalons
        this.frontLeft = new WPI_TalonSRX(frontLeft);
        this.frontRight = new WPI_TalonSRX(frontRight);
        this.rearLeft = new WPI_TalonSRX(rearLeft);
        this.rearRight = new WPI_TalonSRX(rearRight);

        //enabling brake mode
        this.frontLeft.setNeutralMode(NeutralMode.Brake);
        this.frontRight.setNeutralMode(NeutralMode.Brake);
        this.rearLeft.setNeutralMode(NeutralMode.Brake);
        this.rearRight.setNeutralMode(NeutralMode.Brake);

        //Automatically inverts one set of wheels.
        robotDrive = new MecanumDrive(this.frontLeft, this.frontRight, this.rearLeft, this.rearRight);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new DriveMecanum());
    }

    public MecanumDrive getDrivetrain(){
        return robotDrive;
    }
}
