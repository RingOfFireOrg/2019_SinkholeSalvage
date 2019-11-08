package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Arm {

    static private WPI_VictorSPX ballArm = new WPI_VictorSPX(RobotMap.ARM_MOTOR_PWM_PIN);

    static public void control(double speed) {
        // if (speed < 0.1 && speed > -0.1) {
        //     speed = 0;
        // }
        ballArm.set(speed);
    }

    // public void stop() {
        
    // }
}