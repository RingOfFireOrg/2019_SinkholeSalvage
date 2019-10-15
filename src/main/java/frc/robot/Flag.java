package frc.robot;

import edu.wpi.first.wpilibj.Servo;

public class Flag {
    private static final double LEFT_POSITION = 0.0;
    private static final double RIGHT_POSITION = 1.0;
    private static final double UP_POSITION = 0.5;

    private Servo flagArm = new Servo(RobotMap.FLAG_SERVO);

    public void wave(double xPos) {
        if (xPos > 0.25) {
            flagArm.set(RIGHT_POSITION);
        }
        else if (xPos < -0.25) {
            flagArm.set(LEFT_POSITION);
        }
        else {
            stop();
        }
    }

    public void stop() {
        flagArm.set(UP_POSITION);
    }
}