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
  
  //Allows us to create an instance of the WPILib SpeedController Class named "topRight"
  public SpeedController topRight;
  public SpeedController topLeft;
  public SpeedController bottomRight;
  public SpeedController bottomLeft;
  
  public Launcher(){
    //Creates an instance of the VictorSP SpeedController class (called topRight)
    //based on the PWM port # it is connected to on the roboRIO. 
    //The port number is a constant store in RobotMap
    topRight = new VictorSP(RobotMap.PWM_TOP_RIGHT);
    topLeft = new VictorSP(RobotMap.PWM_TOP_LEFT);
    bottomRight = new VictorSP(RobotMap.PWM_BOTTOM_RIGHT);
    bottomLeft = new VictorSP(RobotMap.PWM_BOTTOM_LEFT);

  }

  //This method sets the speed of the top right motor.
  //Call this method in a command and pass it the speed (between -1 reverse and 1 forward) to set it
  public void setLaunchSpeed(double speed){

    //"set" is a method already in the WPILib SpeedController class.  Guess what it does.
    topRight.set(speed);
    topLeft.set(-speed); //-speed makes the wheels spin the opposite direction, but at the same speed
    bottomRight.set(speed);
    bottomLeft.set(-speed);

  }

  //sets the motor speed to 0 to stop it
  public void stopLaunch(){
    setLaunchSpeed(0);
  }

  public void initDefaultCommand() {
    
  }
}
