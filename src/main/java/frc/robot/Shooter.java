package frc.robot;

import edu.wpi.first.wpilibj.PWMVictorSPX;

public class Shooter {
    private PWMVictorSPX wheelsMotor;

    Shooter(int pwmPort) {
        wheelsMotor = new PWMVictorSPX(pwmPort);
    }

    public void stop() {
        wheelsMotor.set(0.0);
    }
    public void shoot(double speed){
        wheelsMotor.set(speed);
    }


}