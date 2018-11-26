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
    //Creates an instance of the VictorSP SpeedController class (called topRight)
    //based on the PWM port # it is connected to on the roboRIO. 
    //The port number is a constant store in RobotMap
    topRight = new VictorSP(RobotMap.PWM_TOP_RIGHT);

  }

  //This method sets the speed of the top right motor.
  //Call this method in a command and pass it the speed (between -1 reverse and 1 forward) to set it
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
