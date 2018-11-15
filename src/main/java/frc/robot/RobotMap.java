/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


public class RobotMap {
  public static final int USB_CONTROLLER = 2;

  //this is the PWM number of the motor controller for the motor we want to move
  public static final int PWM_TOP_RIGHT = 2;

  //by storing the launch speed here it is easier to change b/c you don't have to 
  //find where you used it in the code, can be set b/w 0-1
  public static final double LAUNCH_SPEED = 0.5;

  //stores button # for spinning up, button 1 is A (green)
  public static final int SPIN_UP_BUTTON = 1;

  
}
