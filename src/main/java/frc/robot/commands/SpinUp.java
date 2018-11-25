/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class SpinUp extends Command {

  

  public SpinUp() {
    //requires(subsystem); tells the program what subsystem the command requires
    //(note: when you choose Robot from the ctrl+space menu make sure you pick the Robot
    //that says frc.robot next to it, if you pick the wrong Robot you won't be able to find the subsystem)
    requires(Robot.launcher);

  }

  public SpinUp(double _speed) {
    
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.launcher.setLaunchSpeed(RobotMap.LAUNCH_SPEED);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.launcher.stopLaunch();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
