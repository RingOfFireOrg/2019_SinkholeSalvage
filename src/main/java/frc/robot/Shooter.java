package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.VictorSP;;

public class Shooter {
    private VictorSPX wheelsMotor;

    Shooter(int canPort) {
        wheelsMotor = new VictorSPX(canPort);
    }

    public void stop() {
        wheelsMotor.set(ControlMode.PercentOutput, 0.0);
    }
    public void shoot(double speed){
        wheelsMotor.set(ControlMode.PercentOutput, speed);
    }


}