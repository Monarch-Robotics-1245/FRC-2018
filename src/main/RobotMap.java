package main;

import edu.wpi.cscore.CvSource;

public class RobotMap {
    // Talon SRX channels
    private static final int frontLeft = 3;
    private static final int rearLeft = 2;
    private static final int frontRight = 4;
    private static final int rearRight = 1;

    //Output stream for camera on dashboard
    private static CvSource cameraOutputStream;

    //Deadzone values, don't set them to 1;
    private static final double translationalDeadZone = 0.1;
    private static final double rotationalDeadZone = 0.1;

    public static int getFrontLeft(){
        return frontLeft;
    }

    public static int getRearLeft(){
        return rearLeft;
    }

    public static int getFrontRight(){
        return frontRight;
    }

    public static int getRearRight(){
        return rearRight;
    }

    public static CvSource getCameraOutputStream(){
        return cameraOutputStream;
    }

    public static double getTranslationalDeadZone(){
        if (translationalDeadZone == 1){
            return .99;
        }
        return translationalDeadZone;
    }
}
