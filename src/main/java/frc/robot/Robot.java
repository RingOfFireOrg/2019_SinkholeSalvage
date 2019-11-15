/*----------------------------------------------------------------------------*/
/* Fall Training - 2019 Team PyroTech (FRC 3459)               */
/*----------------------------------------------------------------------------*/
package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;

/**
 * Don't change the name of this or it won't work. (The manifest looks for
 * "Robot")
 */
public class Robot extends TimedRobot {
    private Joystick leftStick = new Joystick(RobotMap.JOYSTICK_DRIVE_LEFT);
    private Joystick manipulatorStick = new Joystick(RobotMap.JOYSTICK_MANIPULATOR);

    TankDrive tankDrive = new TankDrive();
    Shooter shooter = new Shooter(RobotMap.SHOOTER_MOTOR);

    /**
     * This function is run when the robot is first started up and should be used
     * for any initialization code.
     */
    @Override
    public void robotInit() {
    }

    /**
     * This function is called every robot packet, no matter the mode. Use this for
     * items like diagnostics that you want ran during disabled, autonomous,
     * teleoperated and test.
     *
     * <p>
     * This runs after the mode specific periodic functions, but before LiveWindow
     * and SmartDashboard integrated updating.
     */
    @Override
    public void robotPeriodic() {
    }

    /**
     * This function is called once we go into autonomous mode
     */
    @Override
    public void autonomousInit() {
    }

    /**
     * This function is called periodically during autonomous. (approx 20ms)
     */
    @Override
    public void autonomousPeriodic() {
    }

    /**
     * This function is called when you switch into teleop mode on the driver
     * station.
     */
    @Override
    public void teleopInit() {
    }

    /**
     * This function is called periodically during operator control. (approx 20ms)
     */
    @Override
    public void teleopPeriodic() {
        shooter.shoot(manipulatorStick.getY());
        DriverStation.reportWarning("Shooting " + manipulatorStick.getY(),false);

        tankDrive.arcadeDrive(-leftStick.getY(), leftStick.getX());
    }

    /**
     * This function is called when you switch into teleop mode on the driver
     * station.
     */
    @Override
    public void testInit() {
    }

    /**
     * This function is called periodically during test mode. (approx 20ms)
     */
    @Override
    public void testPeriodic() {
    }
}