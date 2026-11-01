// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Humza extends SubsystemBase {
  /** Creates a new Humza. */
  TalonFX humza = new TalonFX(0);
  public Humza() {
    
  }

  @Override
  public void periodic() {
    //Breaths
    // This method will be called once per scheduler run
  }
}
