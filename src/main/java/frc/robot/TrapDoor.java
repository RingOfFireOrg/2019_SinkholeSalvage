package frc.robot;

import edu.wpi.first.wpilibj.Servo;

public class TrapDoor {
    private static final double DOWN_POSITION = 0.0;
    private static final double UP_POSITION = 1.0;
    private static final double MIDDLE_POSITION = 0.5;

    private Servo TrapDoorArm = new Servo(RobotMap.TRAPDOOR_SERVO);


    public void moveArm(double trapDoorPos) {
        if (trapDoorPos == 0) {
            TrapDoorArm.set(DOWN_POSITION);
        }
        else if (trapDoorPos == 1) {
            TrapDoorArm.set(UP_POSITION);
        }
        else {
            stop();
        }
    }

    public void stop() {
        TrapDoorArm.set(MIDDLE_POSITION);
    }

    public void reset(){
        TrapDoorArm.set(UP_POSITION);
    }
}