package frc.robot;

import edu.wpi.first.wpilibj.Servo;

public class TrapDoor {
    private static final double LEFT_POSITION = 0.0;
    private static final double RIGHT_POSITION = 1.0;
    private static final double UP_POSITION = 0.5;

    private Servo TrapDoorArm = new Servo(RobotMap.TRAPDOOR_SERVO);

    public void wave(double xPos) {
        if (xPos > 0.25) {
            TrapDoorArm.set(RIGHT_POSITION);
        }
        else if (xPos < -0.25) {
            TrapDoorArm.set(LEFT_POSITION);
        }
        else {
            stop();
        }
    }

    public void stop() {
        TrapDoorArm.set(UP_POSITION);
    }
}