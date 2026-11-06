
package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class John extends SubsystemBase {
  /** Creates a new John. */
  TalonFX John = new TalonFX(0);
  public John() {
    
  }

  @Override
  public void periodic() {
    //Breaths
    // This method will be called once per scheduler run
  }
}

