package frc.robot;

import edu.wpi.first.wpilibj.Servo;

public class TrapDoor {
    private static final double CLOSED_POSITION = 0.0;
    private static final double OPEN_POSITION = 1.0;

    private Servo TrapDoorArm = new Servo(RobotMap.TRAPDOOR_SERVO);


    public void moveArm(Boolean armButton) {
        if (armButton) {
            TrapDoorArm.set(OPEN_POSITION);
        } else {
            TrapDoorArm.set(CLOSED_POSITION);
        }
    }

    public void reset(){
        TrapDoorArm.set(CLOSED_POSITION);
    }
}