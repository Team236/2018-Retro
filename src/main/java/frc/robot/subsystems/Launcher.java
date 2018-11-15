/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


public class Launcher extends Subsystem {
  

  public SpeedController topRight;
  
  public Launcher(){
    //creates the new motor controller (VictorSP) based on its port # stored in RobotMap
    topRight = new VictorSP(RobotMap.PWM_TOP_RIGHT);

  }

  //this method allows you to call topRight.set(speed) where speed = a number b/w 0-1 to
  //control the speed of the motor
  public void setLaunchSpeed(double speed){

    topRight.set(speed);

  }

  //sets the motor speed to 0 to stop it
  public void stopLaunch(){
    setLaunchSpeed(0);
  }

  public void initDefaultCommand() {
    
  }
}
