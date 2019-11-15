package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.PWMVictorSPX;

public class Shooter {
    private PWMVictorSPX wheelsMotor;

    Shooter(int canPort) {
        wheelsMotor = new PWMVictorSPX(canPort);
    }

    public void stop() {
        wheelsMotor.set( 0.0);
    }
    public void shoot(double speed){
        wheelsMotor.set( speed);
    }


}