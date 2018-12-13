/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.Drive;
import frc.robot.subsystems.Launcher;



public class Robot extends TimedRobot {
  //declare oi Allows us to create an instance of the OI class named oi
  public static OI oi;

  //Creates instance of Launcher subsystem calld launcher
  //(must create an instance of all subsystems in Robot.java)
  public static Launcher launcher = new Launcher();
  public static Drive drive = new Drive();

  
  @Override
  public void robotInit() {
    oi = new OI();
  }

  
  @Override
  public void robotPeriodic() {
  }

  
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  
  @Override
  public void autonomousInit() {
  }

  
  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
  }

  
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  
  @Override
  public void testPeriodic() {
  }
}
