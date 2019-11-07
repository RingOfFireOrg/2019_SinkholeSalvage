package frc.robot;

import edu.wpi.first.wpilibj.PWMVictorSPX;

public class Banana {
    PWMVictorSPX bananaWheel = new PWMVictorSPX(1);

    public void stop(){
        bananaWheel.stopMotor();
    }
    public void intake(double speed){
        bananaWheel.set(speed);
    }
    
}