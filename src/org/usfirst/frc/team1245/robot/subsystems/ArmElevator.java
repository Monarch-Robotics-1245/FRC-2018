package org.usfirst.frc.team1245.robot.subsystems;

import org.usfirst.frc.team1245.robot.commands.ToggleLift;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


    public class ArmElevator extends Subsystem {

        // Put methods for controlling this subsystem
        // here. Call these from Commands.

        // Double solenoid that controls lifter actuation
        DoubleSolenoid lifterSolenoid, lifterSolenoid2;
        // Double solenoid that controls lifter pressure
        //DoubleSolenoid airPressureSolenoid, airPressureSolenoid2;
        Solenoid liftSolenoid1, liftSolenoid2; 
        

        public void initDefaultCommand() {
            // Set the default command for a subsystem here.
            //setDefaultCommand(new MySpecialCommand());
            // Nothing to do by default
        	setDefaultCommand(new ToggleLift());
        }
        public ArmElevator(int liftChannel, int reverseChannel) {
        	lifterSolenoid = new DoubleSolenoid(liftChannel, reverseChannel);
        	//liftSolenoid1 = new Solenoid(liftChannel);
        	//liftSolenoid1.set(false);
        }
        

        // Set the actuation solenoid in the forward position
        public void setForward(){
            //liftSolenoid1.set(true);
            //liftSolenoid2.set(true);
            lifterSolenoid.set(DoubleSolenoid.Value.kForward);
            //lifterSolenoid.set(DoubleSolenoid.Value.kForward);
        	
        	SmartDashboard.putBoolean("Lifted", true);
        }

        // Set the actuation solenoid in the reverse position, using off because gravity
        public void setReverse(){
            //liftSolenoid2.set(false);
            //liftSolenoid1.set(false);
        	//lifterSolenoid.set(DoubleSolenoid.Value.kOff);
            lifterSolenoid.set(DoubleSolenoid.Value.kReverse);
            SmartDashboard.putBoolean("Lifted", false);
        }

        // Return the lifter solenoid's state
        public DoubleSolenoid.Value getValue(){
        	return lifterSolenoid.get();
        }
        public boolean getValueB() {
        	return liftSolenoid1.get();
        }

        // Return the pressure solenoid's state
        //public DoubleSolenoid.Value getPressure() {
            //return airPressureSolenoid.get();
        //}

        // Switch the pressure
        /*public void switchPressure() {
            if(airPressureSolenoid.get() == DoubleSolenoid.Value.kForward) {
                airPressureSolenoid.set(DoubleSolenoid.Value.kReverse);
                airPressureSolenoid2.set(DoubleSolenoid.Value.kReverse);
                SmartDashboard.putString("Lifter Pressure", "High");
            } else {
                airPressureSolenoid.set(DoubleSolenoid.Value.kForward);
                airPressureSolenoid2.set(DoubleSolenoid.Value.kForward);
                SmartDashboard.putString("Lifter Pressure", "Low");
            }
        }*/

        //set pressure to high
        /*public void setPressureHigh(){
            if (!(airPressureSolenoid.get() == Value.kReverse)){
                airPressureSolenoid.set(Value.kReverse);
                airPressureSolenoid2.set(Value.kReverse);
            }
        }

        //set pressure to low
        public void setPressureLow(){
            if (!(airPressureSolenoid.get() == Value.kForward)){
                airPressureSolenoid.set(Value.kForward);
                airPressureSolenoid2.set(Value.kForward);
            }
        }*/
    }
