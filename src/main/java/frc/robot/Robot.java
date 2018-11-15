/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.subsystems.Launcher;



public class Robot extends TimedRobot {

//creates Launcher subsystem in Robot.java so it can be accessed by other files (like commands)
public static Launcher Launcher = new Launcher();
  
  @Override
  public void robotInit() {
    
  }

  
  @Override
  public void robotPeriodic() {
  }

  
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
  }

  
  @Override
  public void autonomousInit() {
  }

  
  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
  }

  
  @Override
  public void teleopPeriodic() {
  }

  
  @Override
  public void testPeriodic() {
  }
}
