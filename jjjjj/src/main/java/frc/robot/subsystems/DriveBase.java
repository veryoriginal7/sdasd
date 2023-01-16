// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
public class DriveBase extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private final CANSparkMax leftSlaveMotor = new CANSparkMax(0,Motortype.kBrushless);
  private final CANSparkMax leftMasterMotor = new CANSparkMax(0,Motortype.kBrushless);
  private final CANSparkMax leftSlaveMotor2 = new CANSparkMax(0,Motortype.kBrushless);
  private final CANSparkMax rightSlaveMotor = new CANSparkMax(0,Motortype.kBrushless);
  private final CANSparkMax rightMasterMotor = new CANSparkMax(0,Motortype.kBrushless);
  private final CANSparkMax rightSlaveMotor2 = new CANSparkMax(0,Motortype.kBrushless);
  private final MotorControllerGroup m_leftGroupMotor = new MotorControllerGroup(leftSlaveMotor,leftSlaveMotor2,leftMasterMotor);
  private final MotorControllerGroup m_rightGroupMotor = new MotorControllerGroup(rightSlaveMotor,rightSlaveMotor2,rightMasterMotor);
  private final DifferentialDrive m_DifferentialDrive = new DifferentialDrive(m_leftGroupMotor,m_rightGroupMotor);
  public DriveBase() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
  public void arcadeDrive(double speed,double rotation) {
  m_DifferentialDrive.arcadeDrive(speed, rotation);
  }
}
